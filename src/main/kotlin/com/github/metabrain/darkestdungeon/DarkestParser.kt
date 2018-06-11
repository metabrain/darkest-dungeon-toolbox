package com.github.metabrain.darkestdungeon

import java.util.regex.Pattern

typealias Expression = Pair<String, Attributes>
typealias Attributes = Map<String, Values>
typealias Values = List<Any>

sealed class REGEXS(private val regex: String) {

    fun tryConsume(str: String): Pair<String?, String> =
            findFirstGroup(str).let { Pair(it, _consume(str, it)) }

    fun findFirstGroup(str: String): String? {
        val matcher = Pattern.compile(regex).matcher(str)
        return if (matcher.find()) {
            matcher.group(1)
        } else {
            null
        }
    }

    abstract fun consume(str: String, group: String): String

    private fun _consume(str: String, group: String?): String {
        return if(group!=null) {
            consume(str, group).trim()
        } else {
            str
        }
    }

    object EXP_ID: REGEXS("^(\\w+):") {
        override fun consume(str: String, group: String): String = str.replaceFirst("$group:","")
    }
    object ATTR_ID: REGEXS("^.(\\w+)") {
        override fun consume(str: String, group: String): String = str.replaceFirst(".$group","")
    }
    object ATTR_VALUE: REGEXS("^(?:\"?|-?)((?!\\.)(?:\\w|\\.|\\%|\\-)+)\"?") {
        override fun consume(str: String, group: String): String = str
                .replaceFirst("\"$group\"","")
                .replaceFirst("-$group","")
                .replaceFirst(group,"")
    }

}

object DarkestParser {
    fun parse(line: String): Expression? {
        val (key, rem) = REGEXS.EXP_ID.tryConsume(line)
        val exp = key?.let {
            Expression(key, parseAttrs(rem))
        }
        return exp
    }

    fun parseAttrs(str: String): Attributes {
        val (key, rem) = REGEXS.ATTR_ID.tryConsume(str)
        if(key==null) {
            return emptyMap()
        }

        val (values, lastRem) = parseAttrValues(rem)
        return mapOf(key to values) + parseAttrs(lastRem)
    }

    fun parseAttrValues(str: String): Pair<Values, String> {
        val (value, rem) = REGEXS.ATTR_VALUE.tryConsume(str)
        return if(value!=null) {
            val (rest, lastRem) = parseAttrValues(rem)
            Pair((rest+value), lastRem)
        } else {
            Pair(listOf(), rem)
        }
    }

}

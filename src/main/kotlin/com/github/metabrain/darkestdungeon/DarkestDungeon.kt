package com.github.metabrain.darkestdungeon

import java.nio.file.Path

/**
 * Created by daniel.parreira on 11/06/2018.
 */
object DarkestDungeon {

    var heroes: List<Hero> = listOf()

    fun loadConfig(relPath: Path, lines: List<String>) {
//        val contents = lines.joinToString("\n")
        val loader = findLoader(relPath)?.load(this, ConfigFile(relPath, lines))
//        ?: System.err.println("NO LOADER AVAILABLE FOR $relPath: $contents\n")
    }

    private fun findLoader(relPath: Path): Loader? {
        return when {
            relPath.toString().startsWith("audio") -> Loader.NopLoader
            relPath.toString().startsWith("heroes") -> {
                val hero = relPath.getName(1).toString()
                Loader.HeroLoader(hero)
            }
            else -> {
                null
            }
        }
    }


    sealed class Loader {

        abstract fun load(dd: DarkestDungeon, f: ConfigFile)

        object NopLoader : Loader() {
            override fun load(dd: DarkestDungeon, f: ConfigFile) {
                println("Ignoring file ${f.relPath}")
            }
        }

        class HeroLoader(val hero: String) : Loader() {
            override fun load(dd: DarkestDungeon, f: ConfigFile) {
                println("${f.relPath.toString()} -> Loading hero $hero: \n${f.contents.joinToString("\n")}\n")
//                val hero = Hero
                val exps = f.contents.map { line ->
                    DarkestParser.parse(line)
                }.filterNotNull()
                println("${f.relPath.toString()} -> LOADED hero $hero! \n$exps\n")
            }
        }
    }

}

data class ConfigFile(val relPath: Path, val contents: List<String>)
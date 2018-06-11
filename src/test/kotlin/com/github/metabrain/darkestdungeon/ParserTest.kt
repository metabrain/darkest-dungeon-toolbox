package com.github.metabrain.darkestdungeon

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by daniel.parreira on 12/06/2018.
 */
class ParserTest {
    @Test
    fun weaponTest() {
        val line = "weapon: .name \"abomination_weapon_0\" .icon \"eqp_weapon_0.png\""
        val (name, attrs) = DarkestParser.parse(line)!!
        assertEquals("weapon", name)
        assertEquals(listOf("abomination_weapon_0"), attrs["name"])
        assertEquals(listOf("eqp_weapon_0.png"), attrs["icon"])
    }

    @Test
    fun listOfValuesTest() {
        val line = "\"abomination_weapon_0\" 1234 -6 5.5% stringz \"eqp_weapon_0.png\""
        val (values, rem) = DarkestParser.parseAttrValues(line)
        assertEquals("", rem)
        assertEquals(6, values.size)
    }
}
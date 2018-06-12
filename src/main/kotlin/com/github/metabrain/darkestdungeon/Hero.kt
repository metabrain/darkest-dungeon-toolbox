package com.github.metabrain.darkestdungeon

/**
 * Created by daniel.parreira on 11/06/2018.
 */
data class Hero(val name: String) {

        var skills: List<Skill> = listOf()
        lateinit var stats: Stats
        lateinit var resistances: Resistances
        var religious: Boolean = false
        var forwardMovement: Int = 0
        var backwardsMovement: Int = 0
        var provisions: List<Item> = listOf()
        var restrictions: List<Restriction> = emptyList()

}

class Restriction {

}

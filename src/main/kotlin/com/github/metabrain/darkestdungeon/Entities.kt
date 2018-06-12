package com.github.metabrain.darkestdungeon

object Entities {
    fun from(exp: Expression): Props? {
        return when(exp.first) {
            "weapon" -> Weapon(exp.second["name"]?.first().toString())
            "armour" -> Armour(exp.second["name"]?.first().toString())
            "tag" -> Tag(exp.second["id"]?.first().toString())
            "combat_skill" -> Skill(exp.second["name"]?.first().toString())
            "combat_move_skill" -> Move(exp.second["id"]?.first().toString()) // FIXME ???????????
            "resistances" -> Resistances(exp.second["name"]?.first().toString())
            "deaths_door" -> DeathsDoor() // TODO
            "controlled" -> Controlled() // TODO
            "id_index" -> Controlled() // TODO
            "skill_selection" -> Prop(exp.first, exp.second) // TODO
            "mode" -> Mode(exp.second["id"]?.first().toString(), exp.second) // TODO
            "incompatible_party_member" -> Incompatibility(exp.second["id"]?.first().toString(), exp.second) // TODO
            "generation" -> Generation(exp.second) // TODO
            "extra_battle_loot" -> Prop(exp.first, exp.second) // TODO
            "extra_curio_loot" -> Prop(exp.first, exp.second) // TODO
            "extra_stack_limit" -> Prop(exp.first, exp.second) // TODO
            else -> {
                System.err.println("Unknown entity found: ${exp.first} -> ${exp.second}")
                UNKNOWN("${exp.first} -> ${exp.second}")
            }
        }
    }
}

sealed class Props
data class Prop(val name: String, val attrs: Map<String, Any>): Props()
data class Mode(val name: String, val attrs: Map<String, Any>): Props()
data class Incompatibility(val name: String, val attrs: Map<String, Any>): Props()
data class Generation(val attrs: Map<String, Any>): Props() // TODO
data class UNKNOWN(val str: String): Props()

sealed class Entity: Props()
data class Weapon(val name: String): Entity()
data class Armour(val name: String): Entity()
data class Tag(val name: String): Entity()
data class Skill(val name: String): Entity()
data class Move(val id: String): Entity() // FIXME ?????????????
data class Stats(val name: String): Entity()
data class Item(val name: String): Entity()
data class Resistances(val name: String): Entity()
class Controlled: Entity()
class DeathsDoor: Entity() // TODO

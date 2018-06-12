package com.github.metabrain.darkestdungeon

import org.junit.Test
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.test.assertEquals

/**
 * Created by daniel.parreira on 12/06/2018.
 */
class ParserTest {

    @Test
    fun main() {
        Main.main(emptyArray())
    }

    @Test
    fun loadAntiquarianTest() {
        DarkestDungeon.Loader.HeroLoader("abom").load(DarkestDungeon, ConfigFile(
                Paths.get("D:\\Steam\\steamapps\\common\\DarkestDungeon\\heroes\\antiquarian\\antiquarian.info.darkest"),
                """

                    resistances: .stun 20% .poison 20% .bleed 20% .disease 20% .move 20% .debuff 20% .death_blow 67% .trap 10%
                    weapon: .name "antiquarian_weapon_0" .atk 0% .dmg 3 5 .crit 2.5% .spd 5
                    weapon: .name "antiquarian_weapon_1" .atk 0% .dmg 4 6 .crit 3% .spd 5 .upgradeRequirementCode 0
                    weapon: .name "antiquarian_weapon_2" .atk 0% .dmg 4 7 .crit 3.5% .spd 6 .upgradeRequirementCode 1
                    weapon: .name "antiquarian_weapon_3" .atk 0% .dmg 5 8 .crit 4% .spd 6 .upgradeRequirementCode 2
                    weapon: .name "antiquarian_weapon_4" .atk 0% .dmg 5 9 .crit 4.5% .spd 7 .upgradeRequirementCode 3
                    armour: .name "antiquarian_armour_0" .def 10% .prot 0 .hp 17 .spd 0
                    armour: .name "antiquarian_armour_1" .def 15% .prot 0 .hp 20 .spd 0 .upgradeRequirementCode 0
                    armour: .name "antiquarian_armour_2" .def 20% .prot 0 .hp 23 .spd 0 .upgradeRequirementCode 1
                    armour: .name "antiquarian_armour_3" .def 25% .prot 0 .hp 26 .spd 0 .upgradeRequirementCode 2
                    armour: .name "antiquarian_armour_4" .def 30% .prot 0 .hp 29 .spd 0 .upgradeRequirementCode 3
                    combat_skill: .id "kris_stab" .level 0 .type "melee" .atk 90% .dmg 0% .crit 0% .launch 4321 .target 123 .is_crit_valid True
                    combat_skill: .id "kris_stab" .level 1 .type "melee" .atk 95% .dmg 0% .crit 0% .launch 4321 .target 123 .is_crit_valid True
                    combat_skill: .id "kris_stab" .level 2 .type "melee" .atk 100% .dmg 0% .crit 1% .launch 4321 .target 123 .is_crit_valid True
                    combat_skill: .id "kris_stab" .level 3 .type "melee" .atk 105% .dmg 0% .crit 2% .launch 4321 .target 123 .is_crit_valid True
                    combat_skill: .id "kris_stab" .level 4 .type "melee" .atk 110% .dmg 0% .crit 2% .launch 4321 .target 123 .is_crit_valid True
                    combat_skill: .id "festering_vapours" .level 0 .type "ranged" .atk 95% .dmg -75% .crit 0% .launch 4321 .target 1234 .is_crit_valid True  .effect "Antiq Blight 1" "Antiq Blight Debuff 1"
                    combat_skill: .id "festering_vapours" .level 1 .type "ranged" .atk 100% .dmg -75% .crit 0% .launch 4321 .target 1234 .is_crit_valid True  .effect "Antiq Blight 2" "Antiq Blight Debuff 2"
                    combat_skill: .id "festering_vapours" .level 2 .type "ranged" .atk 105% .dmg -75% .crit 1% .launch 4321 .target 1234 .is_crit_valid True  .effect "Antiq Blight 3" "Antiq Blight Debuff 3"
                    combat_skill: .id "festering_vapours" .level 3 .type "ranged" .atk 110% .dmg -75% .crit 2% .launch 4321 .target 1234 .is_crit_valid True  .effect "Antiq Blight 4" "Antiq Blight Debuff 4"
                    combat_skill: .id "festering_vapours" .level 4 .type "ranged" .atk 115% .dmg -75% .crit 2% .launch 4321 .target 1234 .is_crit_valid True  .effect "Antiq Blight 5" "Antiq Blight Debuff 5"
                    combat_skill: .id "cower" .level 0 .type "ranged" .atk 0% .dmg 0% .crit 0% .move 1 0 .launch 4321 .target  .is_crit_valid True  .effect "Antiq Cower 1" "Antiq Self Speed 1"
                    combat_skill: .id "cower" .level 1 .type "ranged" .atk 0% .dmg 0% .crit 0% .move 1 0 .launch 4321 .target  .is_crit_valid True  .effect "Antiq Cower 2" "Antiq Self Speed 2"
                    combat_skill: .id "cower" .level 2 .type "ranged" .atk 0% .dmg 0% .crit 0% .move 1 0 .launch 4321 .target  .is_crit_valid True  .effect "Antiq Cower 3" "Antiq Self Speed 3"
                    combat_skill: .id "cower" .level 3 .type "ranged" .atk 0% .dmg 0% .crit 0% .move 1 0 .launch 4321 .target  .is_crit_valid True  .effect "Antiq Cower 4" "Antiq Self Speed 4"
                    combat_skill: .id "cower" .level 4 .type "ranged" .atk 0% .dmg 0% .crit 0% .move 1 0 .launch 4321 .target  .is_crit_valid True  .effect "Antiq Cower 5" "Antiq Self Speed 5"
                    combat_skill: .id "flashpowder" .level 0 .type "ranged" .atk 95% .dmg -100% .crit 0% .launch 4321 .target 1234 .is_crit_valid True .ignore_stealth true  .effect "Antiq Distract 1" "Destealth"
                    combat_skill: .id "flashpowder" .level 1 .type "ranged" .atk 100% .dmg -100% .crit 0% .launch 4321 .target 1234 .is_crit_valid True .ignore_stealth true  .effect "Antiq Distract 2" "Destealth"
                    combat_skill: .id "flashpowder" .level 2 .type "ranged" .atk 105% .dmg -100% .crit 0% .launch 4321 .target 1234 .is_crit_valid True .ignore_stealth true  .effect "Antiq Distract 3" "Destealth"
                    combat_skill: .id "flashpowder" .level 3 .type "ranged" .atk 110% .dmg -100% .crit 0% .launch 4321 .target 1234 .is_crit_valid True .ignore_stealth true  .effect "Antiq Distract 4" "Destealth"
                    combat_skill: .id "flashpowder" .level 4 .type "ranged" .atk 115% .dmg -100% .crit 0% .launch 4321 .target 1234 .is_crit_valid True .ignore_stealth true  .effect "Antiq Distract 5" "Destealth"
                    combat_move_skill: .id "move" .level 0 .type "move" .move 2 2 .launch 4321
                    combat_skill: .id "fortifying_vapours" .level 0 .heal 1 1 .launch 43 .target @1234
                    combat_skill: .id "fortifying_vapours" .level 1 .heal 1 2 .launch 43 .target @1234
                    combat_skill: .id "fortifying_vapours" .level 2 .heal 2 2 .launch 43 .target @1234
                    combat_skill: .id "fortifying_vapours" .level 3 .heal 2 3 .launch 43 .target @1234
                    combat_skill: .id "fortifying_vapours" .level 4 .heal 3 3 .launch 43 .target @1234
                    combat_skill: .id "invigorating_vapours" .level 0 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 43 .target ~@1234 .is_crit_valid True  .effect "Antiq Dodge 1"
                    combat_skill: .id "invigorating_vapours" .level 1 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 43 .target ~@1234 .is_crit_valid True  .effect "Antiq Dodge 2"
                    combat_skill: .id "invigorating_vapours" .level 2 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 43 .target ~@1234 .is_crit_valid True  .effect "Antiq Dodge 3"
                    combat_skill: .id "invigorating_vapours" .level 3 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 43 .target ~@1234 .is_crit_valid True  .effect "Antiq Dodge 4"
                    combat_skill: .id "invigorating_vapours" .level 4 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 43 .target ~@1234 .is_crit_valid True  .effect "Antiq Dodge 5"
                    combat_skill: .id "protect_me" .level 0 .type "ranged" .atk 0% .dmg 0% .crit 0% .self_target_valid false .launch 4321 .target @1234 .is_crit_valid True  .effect "Antiq DefBuff 1" "Antiq ProtectMe ClearGuardsPerformer" "Antiq ProtectMe ClearGuardsTarget" "Antiq ProtectMe Guard" .generation_guaranteed true
                    combat_skill: .id "protect_me" .level 1 .type "ranged" .atk 0% .dmg 0% .crit 0% .self_target_valid false .launch 4321 .target @1234 .is_crit_valid True  .effect "Antiq DefBuff 2" "Antiq ProtectMe ClearGuardsPerformer" "Antiq ProtectMe ClearGuardsTarget" "Antiq ProtectMe Guard"
                    combat_skill: .id "protect_me" .level 2 .type "ranged" .atk 0% .dmg 0% .crit 0% .self_target_valid false .launch 4321 .target @1234 .is_crit_valid True  .effect "Antiq DefBuff 3" "Antiq ProtectMe ClearGuardsPerformer" "Antiq ProtectMe ClearGuardsTarget" "Antiq ProtectMe Guard"
                    combat_skill: .id "protect_me" .level 3 .type "ranged" .atk 0% .dmg 0% .crit 0% .self_target_valid false .launch 4321 .target @1234 .is_crit_valid True  .effect "Antiq DefBuff 4" "Antiq ProtectMe ClearGuardsPerformer" "Antiq ProtectMe ClearGuardsTarget" "Antiq ProtectMe Guard"
                    combat_skill: .id "protect_me" .level 4 .type "ranged" .atk 0% .dmg 0% .crit 0% .self_target_valid false .launch 4321 .target @1234 .is_crit_valid True  .effect "Antiq DefBuff 5" "Antiq ProtectMe ClearGuardsPerformer" "Antiq ProtectMe ClearGuardsTarget" "Antiq ProtectMe Guard"
                    tag: .id "light"
                    tag: .id "non-religious"
                    tag: .id "library"
                    deaths_door: .buffs deathsdoorACCDebuff deathsdoorDMGLowDebuff deathsdoorDMGHighDebuff deathsdoorSPDDebuff deathsdoorSRDebuff .recovery_buffs mortalityACCDebuff mortalityDMGLowDebuff mortalityDMGHighDebuff mortalitySPDDebuff mortalitySRDebuff .recovery_heart_attack_buffs heartattackACCDebuff heartattackDMGLowDebuff heartattackDMGHighDebuff heartattackSPDDebuff heartattackSRDebuff
                    controlled: .target_rank 4
                    id_index: .index 14
                    skill_selection: .can_select_combat_skills true .number_of_selected_combat_skills_max 4
                    extra_battle_loot: .code "ANTIQ" .count 1
                    extra_curio_loot: .code "ANTIQ" .count 1
                    extra_stack_limit: .id antiquarian_gold
                    generation: .is_generation_enabled true .number_of_positive_quirks_min 1 .number_of_positive_quirks_max 2 .number_of_negative_quirks_min 1 .number_of_negative_quirks_max 2 .number_of_class_specific_camping_skills 2 .number_of_shared_camping_skills 1 .number_of_random_combat_skills 4 .number_of_cards_in_deck 5 .card_chance 1.0
                    """.lines().map { it.trim() }
        ))
    }

    @Test
    fun loadAbomTest() {
        DarkestDungeon.Loader.HeroLoader("abom").load(DarkestDungeon, ConfigFile(
                Paths.get("D:\\Steam\\steamapps\\common\\DarkestDungeon\\heroes\\abomination\\abomination.info.darkest"),
                """

                    resistances: .stun 40% .poison 60% .bleed 30% .disease 20% .move 40% .debuff 20% .death_blow 67% .trap 10%
                    weapon: .name "abomination_weapon_0" .atk 0% .dmg 6 11 .crit 2.5% .spd 7
                    weapon: .name "abomination_weapon_1" .atk 0% .dmg 7 13 .crit 3% .spd 7 .upgradeRequirementCode 0
                    weapon: .name "abomination_weapon_2" .atk 0% .dmg 8 15 .crit 3.5% .spd 8 .upgradeRequirementCode 1
                    weapon: .name "abomination_weapon_3" .atk 0% .dmg 10 18 .crit 4% .spd 8 .upgradeRequirementCode 2
                    weapon: .name "abomination_weapon_4" .atk 0% .dmg 11 20 .crit 4.5% .spd 9 .upgradeRequirementCode 3
                    armour: .name "abomination_armour_0" .def 7.5% .prot 0 .hp 26 .spd 0
                    armour: .name "abomination_armour_1" .def 12.5% .prot 0 .hp 31 .spd 0 .upgradeRequirementCode 0
                    armour: .name "abomination_armour_2" .def 17.5% .prot 0 .hp 36 .spd 0 .upgradeRequirementCode 1
                    armour: .name "abomination_armour_3" .def 22.5% .prot 0 .hp 41 .spd 0 .upgradeRequirementCode 2
                    armour: .name "abomination_armour_4" .def 27.5% .prot 0 .hp 46 .spd 0 .upgradeRequirementCode 3
                    combat_skill: .id "transform" .level 0 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 321 .target  .is_crit_valid True .valid_modes human beast .human_effects switch_mode_beast_self beast_stress_party beast_buff_1 beast_buff2_1 xform_damage_1 .beast_effects switch_mode_human_self human_stress_heal_party_1 beast_debuff_1 Transform_HealSelf_1 .is_continue_turn true .per_turn_limit 1 .per_battle_limit 2
                    combat_skill: .id "transform" .level 1 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 321 .target  .is_crit_valid True .valid_modes human beast .human_effects switch_mode_beast_self beast_stress_party beast_buff_2 beast_buff2_2 xform_damage_2 .beast_effects switch_mode_human_self human_stress_heal_party_2 beast_debuff_2 Transform_HealSelf_2 .is_continue_turn true .per_turn_limit 1 .per_battle_limit 2
                    combat_skill: .id "transform" .level 2 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 321 .target  .is_crit_valid True .valid_modes human beast .human_effects switch_mode_beast_self beast_stress_party beast_buff_3 beast_buff2_3 xform_damage_3 .beast_effects switch_mode_human_self human_stress_heal_party_3 beast_debuff_3 Transform_HealSelf_3 .is_continue_turn true .per_turn_limit 1 .per_battle_limit 2
                    combat_skill: .id "transform" .level 3 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 321 .target  .is_crit_valid True .valid_modes human beast .human_effects switch_mode_beast_self beast_stress_party beast_buff_4 beast_buff2_4 xform_damage_4 .beast_effects switch_mode_human_self human_stress_heal_party_4 beast_debuff_4 Transform_HealSelf_4 .is_continue_turn true .per_turn_limit 1 .per_battle_limit 2
                    combat_skill: .id "transform" .level 4 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 321 .target  .is_crit_valid True .valid_modes human beast .human_effects switch_mode_beast_self beast_stress_party beast_buff_5 beast_buff2_5 xform_damage_5 .beast_effects switch_mode_human_self human_stress_heal_party_5 beast_debuff_5 Transform_HealSelf_5 .is_continue_turn true .per_turn_limit 1 .per_battle_limit 2
                    combat_skill: .id "manacles" .level 0 .type "ranged" .atk 95% .dmg -60% .crit 0% .launch 32 .target 123 .is_crit_valid True  .effect "Stun 1" .valid_modes human
                    combat_skill: .id "manacles" .level 1 .type "ranged" .atk 100% .dmg -60% .crit 0% .launch 32 .target 123 .is_crit_valid True  .effect "Stun 2" .valid_modes human
                    combat_skill: .id "manacles" .level 2 .type "ranged" .atk 105% .dmg -60% .crit 1% .launch 32 .target 123 .is_crit_valid True  .effect "Stun 3" .valid_modes human
                    combat_skill: .id "manacles" .level 3 .type "ranged" .atk 110% .dmg -60% .crit 2% .launch 32 .target 123 .is_crit_valid True  .effect "Stun 4" .valid_modes human
                    combat_skill: .id "manacles" .level 4 .type "ranged" .atk 115% .dmg -60% .crit 2% .launch 32 .target 123 .is_crit_valid True  .effect "Stun 5" .valid_modes human
                    combat_skill: .id "vomit" .level 0 .type "ranged" .atk 95% .dmg -100% .crit 1% .launch 32 .target ~23 .is_crit_valid True  .effect "Abom Vomit 1" "Vomit Debuff 1" .valid_modes human
                    combat_skill: .id "vomit" .level 1 .type "ranged" .atk 100% .dmg -100% .crit 2% .launch 32 .target ~23 .is_crit_valid True  .effect "Abom Vomit 2" "Vomit Debuff 2" .valid_modes human
                    combat_skill: .id "vomit" .level 2 .type "ranged" .atk 105% .dmg -100% .crit 2% .launch 32 .target ~23 .is_crit_valid True  .effect "Abom Vomit 3" "Vomit Debuff 3" .valid_modes human
                    combat_skill: .id "vomit" .level 3 .type "ranged" .atk 110% .dmg -100% .crit 2% .launch 32 .target ~23 .is_crit_valid True  .effect "Abom Vomit 4" "Vomit Debuff 4" .valid_modes human
                    combat_skill: .id "vomit" .level 4 .type "ranged" .atk 115% .dmg -100% .crit 3% .launch 32 .target ~23 .is_crit_valid True  .effect "Abom Vomit 5" "Vomit Debuff 5" .valid_modes human
                    combat_skill: .id "absolution" .level 0 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 4321 .target  .is_crit_valid True  .effect "Absolution HealStress 1" "Absolution Heal 1" .valid_modes human
                    combat_skill: .id "absolution" .level 1 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 4321 .target  .is_crit_valid True  .effect "Absolution HealStress 2" "Absolution Heal 2" .valid_modes human
                    combat_skill: .id "absolution" .level 2 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 4321 .target  .is_crit_valid True  .effect "Absolution HealStress 3" "Absolution Heal 3" .valid_modes human
                    combat_skill: .id "absolution" .level 3 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 4321 .target  .is_crit_valid True  .effect "Absolution HealStress 4" "Absolution Heal 4" .valid_modes human
                    combat_skill: .id "absolution" .level 4 .type "ranged" .atk 0% .dmg 0% .crit 0% .launch 4321 .target  .is_crit_valid True  .effect "Absolution HealStress 5" "Absolution Heal 5" .valid_modes human
                    combat_move_skill: .id "move" .level 0 .type "move" .move 2 1 .launch 4321
                    combat_skill: .id "rake" .level 0 .type "melee" .atk 90% .dmg -40% .crit 2% .launch 21 .target ~12 .is_crit_valid True  .effect "rakebuff_1" .valid_modes beast
                    combat_skill: .id "rake" .level 1 .type "melee" .atk 95% .dmg -40% .crit 3% .launch 21 .target ~12 .is_crit_valid True  .effect "rakebuff_2" .valid_modes beast
                    combat_skill: .id "rake" .level 2 .type "melee" .atk 100% .dmg -40% .crit 4% .launch 21 .target ~12 .is_crit_valid True  .effect "rakebuff_3" .valid_modes beast
                    combat_skill: .id "rake" .level 3 .type "melee" .atk 105% .dmg -40% .crit 4% .launch 21 .target ~12 .is_crit_valid True  .effect "rakebuff_4" .valid_modes beast
                    combat_skill: .id "rake" .level 4 .type "melee" .atk 110% .dmg -40% .crit 4% .launch 21 .target ~12 .is_crit_valid True  .effect "rakebuff_5" .valid_modes beast
                    combat_skill: .id "rage" .level 0 .type "melee" .atk 85% .dmg 0% .crit 5% .launch 21 .target 123 .is_crit_valid True  .valid_modes beast
                    combat_skill: .id "rage" .level 1 .type "melee" .atk 90% .dmg 0% .crit 6% .launch 21 .target 123 .is_crit_valid True  .valid_modes beast
                    combat_skill: .id "rage" .level 2 .type "melee" .atk 95% .dmg 0% .crit 6% .launch 21 .target 123 .is_crit_valid True  .valid_modes beast
                    combat_skill: .id "rage" .level 3 .type "melee" .atk 100% .dmg 0% .crit 6% .launch 21 .target 123 .is_crit_valid True  .valid_modes beast
                    combat_skill: .id "rage" .level 4 .type "melee" .atk 105% .dmg 0% .crit 7% .launch 21 .target 123 .is_crit_valid True  .valid_modes beast
                    combat_skill: .id "slam" .level 0 .type "melee" .atk 80% .dmg -25% .crit 2% .move 0 1 .launch 321 .target 12 .is_crit_valid True  .effect "Push 2A" "Slam Debuff 1" .valid_modes beast
                    combat_skill: .id "slam" .level 1 .type "melee" .atk 85% .dmg -25% .crit 3% .move 0 1 .launch 321 .target 12 .is_crit_valid True  .effect "Push 2B" "Slam Debuff 2" .valid_modes beast
                    combat_skill: .id "slam" .level 2 .type "melee" .atk 90% .dmg -25% .crit 4% .move 0 1 .launch 321 .target 12 .is_crit_valid True  .effect "Push 2C" "Slam Debuff 3" .valid_modes beast
                    combat_skill: .id "slam" .level 3 .type "melee" .atk 95% .dmg -25% .crit 4% .move 0 1 .launch 321 .target 12 .is_crit_valid True  .effect "Push 2D" "Slam Debuff 4" .valid_modes beast
                    combat_skill: .id "slam" .level 4 .type "melee" .atk 100% .dmg -25% .crit 4% .move 0 1 .launch 321 .target 12 .is_crit_valid True  .effect "Push 2E" "Slam Debuff 5" .valid_modes beast
                    tag: .id "light"
                    tag: .id "non-religious"
                    tag: .id "outsiders_bonfire"
                    deaths_door: .buffs deathsdoorACCDebuff deathsdoorDMGLowDebuff deathsdoorDMGHighDebuff deathsdoorSPDDebuff deathsdoorSRDebuff .recovery_buffs mortalityACCDebuff mortalityDMGLowDebuff mortalityDMGHighDebuff mortalitySPDDebuff mortalitySRDebuff .recovery_heart_attack_buffs heartattackACCDebuff heartattackDMGLowDebuff heartattackDMGHighDebuff heartattackSPDDebuff heartattackSRDebuff
                    controlled: .target_rank 2
                    id_index: .index 13
                    skill_selection: .can_select_combat_skills false .number_of_selected_combat_skills_max 7
                    mode: .id human .is_raid_default true
                    mode: .id beast .bark_override_id str_beast_bark .affliction_combat_skill_id transform .battle_complete_combat_skill_id transform .stress_damage_per_turn 6
                    incompatible_party_member: .id abomination_religion .hero_tag religious
                    generation: .is_generation_enabled true .number_of_positive_quirks_min 1 .number_of_positive_quirks_max 2 .number_of_negative_quirks_min 1 .number_of_negative_quirks_max 2 .number_of_class_specific_camping_skills 2 .number_of_shared_camping_skills 1 .number_of_random_combat_skills 7 .number_of_cards_in_deck 5 .card_chance 1.0


                """.trimIndent().lines().map { it.trim() }
        ))
    }

    @Test
    fun weaponTest() {
        val line = "weapon: .name \"abomination_weapon_0\" .icon \"eqp_weapon_0.png\""
        val (name, attrs) = DarkestParser.parse(line)!!
        assertEquals("weapon", name)
        assertEquals(listOf("abomination_weapon_0"), attrs["name"])
        assertEquals(listOf("eqp_weapon_0.png"), attrs["icon"])
    }

    @Test
    fun skillTest() {
        val line = "combat_skill: .id \"vomit\" .level 0 .type \"ranged\" .atk 95% .dmg -100% .crit 1% .launch 32 .target ~23 .is_crit_valid True  .effect \"Abom Vomit 1\" \"Vomit Debuff 1\" .valid_modes human"
        val (name, attrs) = DarkestParser.parse(line)!!
        assertEquals("combat_skill", name)
//        assertEquals(listOf("abomination_weapon_0"), attrs["name"])
//        assertEquals(listOf("eqp_weapon_0.png"), attrs["icon"])
    }

    @Test
    fun listOfValuesTest() {
        val line = "\"abomination_weapon_0\" 1234 -6 5.5% stringz \"eqp_weapon_0.png\""
        val (values, rem) = DarkestParser.parseAttrValues(line)
        assertEquals("", rem)
        assertEquals(6, values.size)
    }
}
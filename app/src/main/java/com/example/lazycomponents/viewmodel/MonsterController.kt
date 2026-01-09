package com.example.lazycomponents.viewmodel

import com.example.lazycomponents.R
import com.example.lazycomponents.model.Monster

fun getMonsterList(): MutableList<Monster> {
    val monsters: MutableList<Monster> = mutableListOf()

    monsters.add(Monster("aboleth","Aboleth","Large","aberration",135,"18d10+36",R.drawable.aboleth))
    monsters.add(Monster("boar", "Boar", "Medium", "beast", 11, "2d8", R.drawable.boar))
    monsters.add(Monster("goblin", "Goblin", "Small", "humanoid", 7, "2d6", R.drawable.goblin))
    monsters.add(Monster("ogre", "Ogre", "Large", "giant", 59, "7d10", R.drawable.ogre))
    monsters.add(Monster("troll", "Troll", "Large", "giant", 84, "8d10", R.drawable.troll))
    monsters.add(Monster("mimic", "Mimic", "Medium", "monstrosity", 58, "9d8", R.drawable.mimic))
    monsters.add(Monster("lich", "Lich", "Medium", "undead", 135, "18d8", R.drawable.lich))
    monsters.add(Monster("wyvern", "Wyvern", "Large", "dragon", 110, "13d10", R.drawable.wyvern))
    monsters.add(Monster("gelatinous-cube", "Gelatinous Cube", "Large", "ooze", 84, "8d10", R.drawable.gelatinous_cube))
    monsters.add(Monster("young-red-dragon", "Young Red Dragon", "Large", "dragon", 178, "17d10", R.drawable.young_red_dragon))

    return monsters
}

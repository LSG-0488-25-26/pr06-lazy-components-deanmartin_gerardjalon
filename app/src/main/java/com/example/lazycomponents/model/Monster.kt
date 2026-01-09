package com.example.lazycomponents.model

import androidx.annotation.DrawableRes

data class Monster(
    var index: String,
    var name: String,
    var size: String,
    var type: String,
    var hit: Int,
    var hitDice: String,
    @DrawableRes var image: Int
)

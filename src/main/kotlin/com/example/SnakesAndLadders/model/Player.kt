package com.example.SnakesAndLadders.model

data class Player(var name: String, var onPosition: Int = 1, var moveToPosition: Int = 1, var winner: Boolean=false)

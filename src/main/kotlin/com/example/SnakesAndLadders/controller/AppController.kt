package com.example.SnakesAndLadders.controller

import com.example.SnakesAndLadders.model.Dice
import com.example.SnakesAndLadders.model.Player
import com.example.SnakesAndLadders.service.AppService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class AppController {
    val service = AppService()

    var randomValue: Int = 0
    var dice = Dice()

    @GetMapping(value = ["/throw"])
    fun roll(): Dice {
        randomValue = service.randomRollValue()
        return Dice(randomValue)
    }

    @GetMapping(value = ["/move"])
    fun move(): Player {
        return service.playerMove(randomValue)
    }


}
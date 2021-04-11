package com.example.SnakesAndLadders.service

import com.example.SnakesAndLadders.model.Dice
import com.example.SnakesAndLadders.model.Player
import org.springframework.stereotype.Service
import java.util.*

@Service
class AppService {

    val player1 = Player("Player 1")
    val dice = Dice()

    fun randomRollValue(): Int {
        val rand = Random()
        return (1 + rand.nextInt(6))
    }

    fun playerMove(randomValue: Int): Player {

           player1.onPosition = player1.moveToPosition
        if (player1.onPosition + randomValue ==100)
        {
            player1.moveToPosition = player1.onPosition + randomValue
            player1.winner= true
            return player1
        }
      else if(player1.onPosition + randomValue >100){
            return player1
        }
        else {
            player1.moveToPosition = player1.onPosition + randomValue
            return player1
        }

    }

}
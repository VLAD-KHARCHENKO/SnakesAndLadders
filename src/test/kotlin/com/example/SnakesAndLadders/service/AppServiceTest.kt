package com.example.SnakesAndLadders.service


import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test





internal class AppServiceTest {
    val appService = AppService()


    @Test
    @ExperimentalCoroutinesApi
    fun `Valid random value`() {
        val valueArray =1..6
        assertTrue(  appService.randomRollValue() in valueArray)

    }

    @Test
    @ExperimentalCoroutinesApi
    fun `Move for 5 position`() {
        appService.playerMove(5)
        assertEquals(6, appService.player1.moveToPosition)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun `Status when move position 105`() {
        appService.player1.moveToPosition = 99
        appService.playerMove(6)

        assertEquals(false, appService.player1.winner)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun `Check for winner`() {
        appService.player1.moveToPosition = 99
        appService.playerMove(1)
        assertEquals(true, appService.player1.winner)
    }

}
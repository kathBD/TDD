package com.practice.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class PlayerTest {

    @Test
    public void lose_when_number_low() {
        //Dice dice = new Dice(6);
        //dado simulado
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(2);

      Player player =  new Player(dice, 3);
        assertEquals(false, player.play());

    }
    @Test
    public void lose_when_number_big() {
        //Dice dice = new Dice(6);
        //dado simulado
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        Player player =  new Player(dice, 3);
        assertEquals(true, player.play());

    }
}
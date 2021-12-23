package tests.unitTests;

import blackjack.cards.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardsUnitTetsts {

    @Before
    public void setUp() {
    }

    @Test
    public void testFiguresValues() {
        Card jack = new Jack();
        assertEquals(10, jack.getValue());

        Card queen = new Queen();
        assertEquals(10, queen.getValue());

        Card king = new King();
        assertEquals(10, king.getValue());
    }

    @Test
    public void testPipcardsValues() {
        for (int i = 1; i < 11; i++) {
            Card tempPip = new Pip(i);
            assertEquals(i, tempPip.getValue());
        }
    }

    @Test
    public void testPipCardWithValue1() {
        try {
            Card pip1 = new Pip(1);
        } catch (ValueLowerThanMinimumException e) {}
    }

    @Test
    public void testPipCardWithValuesLowerThan2() {
        for (int i = -8; i < 1; i++) {
            try {
                Card pip1 = new Pip(0);
            } catch (ValueLowerThanMinimumException e) {}
        }
    }

    @Test
    public void testPipCardWithValue11() {
        try {
            Card pip1 = new Pip(11);
        } catch (ValueHigherThanMaximumException e) {}
    }

    @Test
    public void testPipCardWithValuesHigherThan11() {
        for (int i = 12; i < 20; i++) {
            try {
                Card pip1 = new Pip(0);
            } catch (ValueHigherThanMaximumException e) {}
        }
    }

    @Test
    public void testAceValues() {
        Card Ace = new Ace();
        assertEquals(1, Ace.getOneAsValue());
        assertEquals(11, Ace.getElevenAsValue());
    }
}

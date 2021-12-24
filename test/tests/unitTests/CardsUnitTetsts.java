package tests.unitTests;

import blackjack.cards.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardsUnitTetsts {

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
    public void testPipcardsValues() throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        for (int i = 2; i < 11; i++) {
            Card tempPip = new Pip(i);
            assertEquals(i, tempPip.getValue());
        }
    }

    @Test
    public void testPipCardWithValue1() throws Pip.ValueHigherThanMaximumException {
        try {
            Card pip1 = new Pip(1);
        } catch (Pip.ValueLowerThanMinimumException e) {}
    }

    @Test
    public void testPipCardWithValuesLowerThan2() throws Pip.ValueHigherThanMaximumException {
        for (int i = -8; i < 1; i++) {
            try {
                Card pip1 = new Pip(i);
            } catch (Pip.ValueLowerThanMinimumException e) {}
        }
    }

    @Test
    public void testPipCardWithValue11() throws Pip.ValueLowerThanMinimumException {
        try {
            Card pip1 = new Pip(11);
        } catch (Pip.ValueHigherThanMaximumException e) {}
    }

    @Test
    public void testPipCardWithValuesHigherThan11() throws Pip.ValueLowerThanMinimumException {
        for (int i = 12; i < 20; i++) {
            try {
                Card pip1 = new Pip(i);
            } catch (Pip.ValueHigherThanMaximumException e) {}
        }
    }

    @Test
    public void testAceValue() {
        Card ace = new Ace();
        assertEquals(11, ace.getValue());
    }
}

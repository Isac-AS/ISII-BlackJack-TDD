package tests.unitTests;

import org.junit.Test;
import static org.junit.Assert.*;
import blackjack.cards.*;
import java.util.ArrayList;

public class UtilsUnitTests {
    
    @Test
    public void testCalculateScoreWith2Pips() {
        ArrayList<Card> hand = new ArrayList<>();
        try {
            hand.add(new Pip(10));
            hand.add(new Pip(5));
        } catch (Exception e) {}
        
        assertEquals(15, blackjack.utils.gameMethods.calculateScore(hand));
    }
    
    @Test
    public void testCalculateScoreWithPipAndFigure() {
        ArrayList<Card> hand = new ArrayList<>();
        try{
            hand.add(new Pip(10));
            hand.add(new Jack());
        } catch (Exception e) {}
        
        assertEquals(20, blackjack.utils.gameMethods.calculateScore(hand));
    }
    
    @Test
    public void testCalculateScoreWith2PipsAndFigure() {
        ArrayList<Card> hand = new ArrayList<>();
        try {
            hand.add(new Pip(9));
            hand.add(new Pip(2));
            hand.add(new King());
        } catch (Exception e) {}
        
        assertEquals(21, blackjack.utils.gameMethods.calculateScore(hand));
    }
    
    @Test
    public void testCalculateScoreWithDifferent2PipsAndDifferentFigure() {
        ArrayList<Card> hand = new ArrayList<>();
        try {        
            hand.add(new Pip(7));
            hand.add(new Pip(3));
            hand.add(new Queen());
        } catch (Exception e) {}
        
        assertEquals(20, blackjack.utils.gameMethods.calculateScore(hand));
    }
    
    @Test
    public void testCalculateScoreWith4Pips() {
        ArrayList<Card> hand = new ArrayList<>();
        try {
            hand.add(new Pip(8));
            hand.add(new Pip(6));
            hand.add(new Pip(4));
            hand.add(new Pip(5));
        } catch (Exception e) {}
        
        assertEquals(23, blackjack.utils.gameMethods.calculateScore(hand));
    }
    
    @Test
    public void testCalculateScoreWith3PipsAndAce() {
        ArrayList<Card> hand = new ArrayList<>();
        try {
            hand.add(new Ace());
            hand.add(new Pip(6));
            hand.add(new Pip(4));
            hand.add(new Pip(5));
        } catch (Exception e) {}
        
        assertEquals(16, blackjack.utils.gameMethods.calculateScore(hand));
    }
    
    @Test
    public void testCalculateScoreWith2PipsAnd2Aces() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Ace());
        try {
            hand.add(new Pip(6));
            hand.add(new Pip(4));
            hand.add(new Ace());
        } catch (Exception e) {}

        assertEquals(12, blackjack.utils.gameMethods.calculateScore(hand));
    }
    
    @Test
    public void testCalculateScoreWith2PipsAndAce() {
        ArrayList<Card> hand = new ArrayList<>();
        try {
            hand.add(new Pip(6));
            hand.add(new Pip(4));
            hand.add(new Ace());
        } catch (Exception e) {}
        
        assertEquals(21, blackjack.utils.gameMethods.calculateScore(hand));
    }
}

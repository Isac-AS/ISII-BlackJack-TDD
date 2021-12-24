package tests.unitTests;

import blackjack.cards.*;
import blackjack.entities.*;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class EntitiesUnitTetsts {
    
    @Test
    public void testPlayerHandWithFigures() {
        Player player = new Player();
        
        player.addCardToHand(new King());
        player.addCardToHand(new Queen());
        player.addCardToHand(new Jack());
        
        ArrayList<Card> expectedOutcome = new ArrayList<>();
        expectedOutcome.add(new King());
        expectedOutcome.add(new Queen());
        expectedOutcome.add(new Jack());
        
        ArrayList<Card> playerHand = player.getHand();
        for (int i = 0; i < expectedOutcome.size(); i++) {
            assertEquals(playerHand.get(i).getClass(),
                    expectedOutcome.get(i).getClass());
            assertEquals(playerHand.get(i).getValue(),
                    expectedOutcome.get(i).getValue());
        }
    }
    
    @Test
    public void testPlayerHandWithFiguresAndAce() {
        Player player = new Player();
        
        player.addCardToHand(new King());
        player.addCardToHand(new Ace());
        player.addCardToHand(new Jack());
        
        ArrayList<Card> expectedOutcome = new ArrayList<>();
        expectedOutcome.add(new King());
        expectedOutcome.add(new Ace());
        expectedOutcome.add(new Jack());
        
        ArrayList<Card> playerHand = player.getHand();
        for (int i = 0; i < expectedOutcome.size(); i++) {
            assertEquals(playerHand.get(i).getClass(),
                    expectedOutcome.get(i).getClass());
            assertEquals(playerHand.get(i).getValue(),
                    expectedOutcome.get(i).getValue());
        }
    }
    
    @Test
    public void testPlayerHandWithPipFigureAndAce() throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        Player player = new Player();
        
        player.addCardToHand(new Pip(6));
        player.addCardToHand(new Queen());
        player.addCardToHand(new Ace());
        
        ArrayList<Card> expectedOutcome = new ArrayList<>();
        expectedOutcome.add(new Pip(6));
        expectedOutcome.add(new Queen());
        expectedOutcome.add(new Ace());
        
        ArrayList<Card> playerHand = player.getHand();
        for (int i = 0; i < expectedOutcome.size(); i++) {
            assertEquals(playerHand.get(i).getClass(),
                    expectedOutcome.get(i).getClass());
            assertEquals(playerHand.get(i).getValue(),
                    expectedOutcome.get(i).getValue());
        }
    }
    
    
    @Test
    public void testCroupierHandWithFigures() {
        Croupier croupier = new Croupier();
        
        croupier.addCardToHand(new King());
        croupier.addCardToHand(new Queen());
        croupier.addCardToHand(new Jack());
        
        ArrayList<Card> expectedOutcome = new ArrayList<>();
        expectedOutcome.add(new King());
        expectedOutcome.add(new Queen());
        expectedOutcome.add(new Jack());
        
        ArrayList<Card> playerHand = croupier.getHand();
        for (int i = 0; i < expectedOutcome.size(); i++) {
            assertEquals(playerHand.get(i).getClass(),
                    expectedOutcome.get(i).getClass());
            assertEquals(playerHand.get(i).getValue(),
                    expectedOutcome.get(i).getValue());
        }
    }
    
    @Test
    public void testCroupierHandWithFiguresAndAce() {
        Croupier croupier = new Croupier();
        
        croupier.addCardToHand(new King());
        croupier.addCardToHand(new Ace());
        croupier.addCardToHand(new Jack());
        
        ArrayList<Card> expectedOutcome = new ArrayList<>();
        expectedOutcome.add(new King());
        expectedOutcome.add(new Ace());
        expectedOutcome.add(new Jack());
        
        ArrayList<Card> playerHand = croupier.getHand();
        for (int i = 0; i < expectedOutcome.size(); i++) {
            assertEquals(playerHand.get(i).getClass(),
                    expectedOutcome.get(i).getClass());
            assertEquals(playerHand.get(i).getValue(),
                    expectedOutcome.get(i).getValue());
        }
    }
    
    @Test
    public void testCroupierHandWithPipFigureAndAce() throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        Croupier croupier = new Croupier();
        
        croupier.addCardToHand(new Pip(6));
        croupier.addCardToHand(new Queen());
        croupier.addCardToHand(new Ace());
        
        ArrayList<Card> expectedOutcome = new ArrayList<>();
        expectedOutcome.add(new Pip(6));
        expectedOutcome.add(new Queen());
        expectedOutcome.add(new Ace());
        
        ArrayList<Card> playerHand = croupier.getHand();
        for (int i = 0; i < expectedOutcome.size(); i++) {
            assertEquals(playerHand.get(i).getClass(),
                    expectedOutcome.get(i).getClass());
            assertEquals(playerHand.get(i).getValue(),
                    expectedOutcome.get(i).getValue());
        }
    }
    
    
    @Test
    public void testDeckRemainingCardsWithFigures() {
        Deck deck = new Deck();
        
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Queen());
        deck.addRemainingCard(new Jack());
        
        ArrayList<Card> expectedOutcome = new ArrayList<>();
        expectedOutcome.add(new King());
        expectedOutcome.add(new Queen());
        expectedOutcome.add(new Jack());
        
        ArrayList<Card> playerHand = deck.getRemainingCards();
        for (int i = 0; i < expectedOutcome.size(); i++) {
            assertEquals(playerHand.get(i).getClass(),
                    expectedOutcome.get(i).getClass());
            assertEquals(playerHand.get(i).getValue(),
                    expectedOutcome.get(i).getValue());
        }
    }
    
    @Test
    public void testDeckRemainingCardsWithFiguresAndAce() {
        Deck deck = new Deck();
        
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Ace());
        deck.addRemainingCard(new Jack());
        
        ArrayList<Card> expectedOutcome = new ArrayList<>();
        expectedOutcome.add(new King());
        expectedOutcome.add(new Ace());
        expectedOutcome.add(new Jack());
        
        ArrayList<Card> playerHand = deck.getRemainingCards();
        for (int i = 0; i < expectedOutcome.size(); i++) {
            assertEquals(playerHand.get(i).getClass(),
                    expectedOutcome.get(i).getClass());
            assertEquals(playerHand.get(i).getValue(),
                    expectedOutcome.get(i).getValue());
        }
    }
    
    @Test
    public void testDeckRemainingCardsWithPipFigureAndAce() throws Pip.ValueLowerThanMinimumException, Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException, Pip.ValueHigherThanMaximumException {
        Deck deck = new Deck();
        
        deck.addRemainingCard(new Pip(6));
        deck.addRemainingCard(new Queen());
        deck.addRemainingCard(new Ace());
        
        ArrayList<Card> expectedOutcome = new ArrayList<>();
        expectedOutcome.add(new Pip(6));
        expectedOutcome.add(new Queen());
        expectedOutcome.add(new Ace());
        
        ArrayList<Card> playerHand = deck.getRemainingCards();
        for (int i = 0; i < expectedOutcome.size(); i++) {
            assertEquals(playerHand.get(i).getClass(),
                    expectedOutcome.get(i).getClass());
            assertEquals(playerHand.get(i).getValue(),
                    expectedOutcome.get(i).getValue());
        }
    }
}

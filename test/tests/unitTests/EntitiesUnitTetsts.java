package tests.unitTests;

import blackjack.cards.*;
import blackjack.entities.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EntitiesUnitTetsts {
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testPlayerHandWithFigures() {
        Player player = new Player();
        
        player.addCardToHand(new King());
        player.addCardToHand(new Queen());
        player.addCardToHand(new Jack());
        
        ArrayList<Card> result = new ArrayList<>();
        result.add(new King());
        result.add(new Queen());
        result.add(new Jack());
        
        assertTrue(result.equals(player.getHand()));
    }
    
    @Test
    public void testPlayerHandWithFiguresAndAce() {
        Player player = new Player();
        
        player.addCardToHand(new King());
        player.addCardToHand(new Ace());
        player.addCardToHand(new Jack());
        
        ArrayList<Card> result = new ArrayList<>();
        result.add(new King());
        result.add(new Ace());
        result.add(new Jack());
        
        assertTrue(result.equals(player.getHand()));
    }
    
    @Test
    public void testPlayerHandWithPipFigureAndAce() {
        Player player = new Player();
        
        player.addCardToHand(new Pip(6));
        player.addCardToHand(new Queen());
        player.addCardToHand(new Ace());
        
        ArrayList<Card> result = new ArrayList<>();
        result.add(new Pip(6));
        result.add(new Queen());
        result.add(new Ace());
        
        assertTrue(result.equals(player.getHand()));
    }
    
    
    @Test
    public void testCroupierHandWithFigures() {
        Croupier croupier = new Croupier();
        
        croupier.addCardToHand(new King());
        croupier.addCardToHand(new Queen());
        croupier.addCardToHand(new Jack());
        
        ArrayList<Card> result = new ArrayList<>();
        result.add(new King());
        result.add(new Queen());
        result.add(new Jack());
        
        assertTrue(result.equals(croupier.getHand()));
    }
    
    @Test
    public void testCroupierHandWithFiguresAndAce() {
        Croupier croupier = new Croupier();
        
        croupier.addCardToHand(new King());
        croupier.addCardToHand(new Ace());
        croupier.addCardToHand(new Jack());
        
        ArrayList<Card> result = new ArrayList<>();
        result.add(new King());
        result.add(new Ace());
        result.add(new Jack());
        
        assertTrue(result.equals(croupier.getHand()));
    }
    
    @Test
    public void testCroupierHandWithPipFigureAndAce() {
        Croupier croupier = new Croupier();
        
        croupier.addCardToHand(new Pip(6));
        croupier.addCardToHand(new Queen());
        croupier.addCardToHand(new Ace());
        
        ArrayList<Card> result = new ArrayList<>();
        result.add(new Pip(6));
        result.add(new Queen());
        result.add(new Ace());
        
        assertTrue(result.equals(croupier.getHand()));
    }
    
    
    @Test
    public void testDeckRemainingCardsWithFigures() {
        Deck deck = new Deck();
        
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Queen());
        deck.addRemainingCard(new Jack());
        
        ArrayList<Card> result = new ArrayList<>();
        result.add(new King());
        result.add(new Queen());
        result.add(new Jack());
        
        assertTrue(result.equals(deck.getRemainingCards()));
    }
    
    @Test
    public void testDeckRemainingCardsWithFiguresAndAce() {
        Deck deck = new Deck();
        
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Ace());
        deck.addRemainingCard(new Jack());
        
        ArrayList<Card> result = new ArrayList<>();
        result.add(new King());
        result.add(new Ace());
        result.add(new Jack());
        
        assertTrue(result.equals(deck.getRemainingCards()));
    }
    
    @Test
    public void testDeckRemainingCardsWithPipFigureAndAce() {
        Deck deck = new Deck();
        
        deck.addRemainingCard(new Pip(6));
        deck.addRemainingCard(new Queen());
        deck.addRemainingCard(new Ace());
        
        ArrayList<Card> result = new ArrayList<>();
        result.add(new Pip(6));
        result.add(new Queen());
        result.add(new Ace());
        
        assertTrue(result.equals(deck.getRemainingCards()));
    }
}

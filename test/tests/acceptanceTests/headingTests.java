package tests.acceptanceTests;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class headingTests {
    
    public headingTests() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void caso1() {
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
        
        players[0].addCardToHand(new Jack());
        players[0].addCardToHand(new Ace());
        
        players[1].addCardToHand(new Pip(10));
        players[1].addCardToHand(new Pip(5));
        players[1].addCardToHand(new Pip(6));
        
        players[2].addCardToHand(new Pip(3));
        players[2].addCardToHand(new Pip(6));
        players[2].addCardToHand(new Ace());
        players[2].addCardToHand(new Pip(3));
        players[2].addCardToHand(new Ace());
        players[2].addCardToHand(new King());
        
        Croupier croupier = new Croupier();
        croupier.addCardToHand(new Pip(9));
        croupier.addCardToHand(new Pip(7));
        
        Deck deck = new Deck();
        deck.addRemainingCard(new Pip(5));
        deck.addRemainingCard(new Pip(4));
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Pip(2));
        
        assertEquals(players[0], 
                blackjack.utils.getWinners(
                        players[0].getHand(),
                        players[1].getHand(),
                        players[2].getHand(),
                        croupier.getHand(),
                        deck.getRemainingCards()
                ));
    }
    
}

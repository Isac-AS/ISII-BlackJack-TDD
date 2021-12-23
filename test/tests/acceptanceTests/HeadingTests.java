package tests.acceptanceTests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import blackjack.cards.*;
import blackjack.entities.*;

public class HeadingTests {
    
    private Player[] players = new Player[3];
    
    @Before
    public void setUp() {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
    }
    
    @Test
    public void caso1() {
        
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
        
        assertEquals("[Player1]", 
                blackjack.utils.gameMethods.getWinners(
                        players[0].getHand(),
                        players[1].getHand(),
                        players[2].getHand(),
                        croupier.getHand(),
                        deck.getRemainingCards()
                ).toString()
        );
    }
    
    
    @Test
    public void caso2() {
        
        
        players[0].addCardToHand(new Pip(10));
        players[0].addCardToHand(new King());
        
        players[1].addCardToHand(new Pip(10));
        players[1].addCardToHand(new Pip(2));
        players[1].addCardToHand(new Pip(6));
        
        players[2].addCardToHand(new Pip(8));
        players[2].addCardToHand(new Pip(8));
        players[2].addCardToHand(new Pip(5));
        
        Croupier croupier = new Croupier();
        croupier.addCardToHand(new Pip(5));
        croupier.addCardToHand(new Pip(10));
        
        Deck deck = new Deck();
        deck.addRemainingCard(new Ace());
        deck.addRemainingCard(new Pip(3));
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Pip(2));
        
        assertEquals("[Player1, Player3]", 
                blackjack.utils.gameMethods.getWinners(
                        players[0].getHand(),
                        players[1].getHand(),
                        players[2].getHand(),
                        croupier.getHand(),
                        deck.getRemainingCards()
                ).toString()
        );
    }
}

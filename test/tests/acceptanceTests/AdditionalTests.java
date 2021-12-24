package tests.acceptanceTests;

import org.junit.Test;
import static org.junit.Assert.*;
import blackjack.cards.*;
import blackjack.entities.*;

public class AdditionalTests {
    
    private final Player[] players = new Player[3];
    
    @Test
    public void test3CourpierWinsWithBlackJack() 
            throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        
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
        players[2].addCardToHand(new Pip(2));
        
        Croupier croupier = new Croupier();
        croupier.addCardToHand(new Queen());
        croupier.addCardToHand(new Ace());
        
        Deck deck = new Deck();
        deck.addRemainingCard(new Ace());
        deck.addRemainingCard(new Pip(4));
        deck.addRemainingCard(new Pip(5));
        
        assertEquals("[Croupier]", 
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
    public void test4CroupierWinsAfterDrawingBlackJack() 
            throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
        
        players[0].addCardToHand(new Jack());
        players[0].addCardToHand(new Ace());
        
        players[1].addCardToHand(new Pip(3));
        players[1].addCardToHand(new Pip(5));
        players[1].addCardToHand(new Pip(6));
        
        players[2].addCardToHand(new Pip(3));
        players[2].addCardToHand(new Pip(6));
        players[2].addCardToHand(new Queen());
        players[2].addCardToHand(new Pip(2));
        
        Croupier croupier = new Croupier();
        croupier.addCardToHand(new Ace());
        
        Deck deck = new Deck();
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Pip(4));
        deck.addRemainingCard(new Pip(5));
        
        assertEquals("[Croupier]", 
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
    public void test5PlayersWinAfterCroupierDrawsOver21() 
            throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
        
        players[0].addCardToHand(new Pip(10));
        players[0].addCardToHand(new Pip(7));
        
        players[1].addCardToHand(new Pip(3));
        players[1].addCardToHand(new Pip(5));
        players[1].addCardToHand(new Pip(6));
        
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(8));
        players[2].addCardToHand(new Pip(4));
        
        Croupier croupier = new Croupier();
        croupier.addCardToHand(new Pip(10));
        croupier.addCardToHand(new Pip(6));
        
        Deck deck = new Deck();
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Pip(4));
        deck.addRemainingCard(new Pip(5));
        
        assertEquals("[Player1, Player2, Player3]", 
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
    public void test6CroupierVictoryAllPlayersOver21() 
            throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
        
        players[0].addCardToHand(new Pip(10));
        players[0].addCardToHand(new Pip(7));
        players[0].addCardToHand(new King());
        
        players[1].addCardToHand(new Pip(3));
        players[1].addCardToHand(new Pip(5));
        players[1].addCardToHand(new Pip(6));
        players[1].addCardToHand(new Jack());
        
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(8));
        players[2].addCardToHand(new Pip(4));
        players[2].addCardToHand(new Queen());
        
        Croupier croupier = new Croupier();
        croupier.addCardToHand(new Pip(10));
        croupier.addCardToHand(new Pip(6));
        croupier.addCardToHand(new Pip(2));
        
        Deck deck = new Deck();
        deck.addRemainingCard(new Pip(3));
        deck.addRemainingCard(new Pip(4));
        deck.addRemainingCard(new Pip(5));
        
        assertEquals("[Croupier]", 
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
    public void test7CroupierVictoryAllPlayersOver21WithDraw() 
            throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
        
        players[0].addCardToHand(new Pip(10));
        players[0].addCardToHand(new Pip(7));
        players[0].addCardToHand(new King());
        
        players[1].addCardToHand(new Pip(3));
        players[1].addCardToHand(new Pip(5));
        players[1].addCardToHand(new Pip(6));
        players[1].addCardToHand(new Jack());
        
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(8));
        players[2].addCardToHand(new Pip(4));
        players[2].addCardToHand(new Queen());
        
        Croupier croupier = new Croupier();
        croupier.addCardToHand(new Pip(10));
        croupier.addCardToHand(new Pip(6));
        
        Deck deck = new Deck();
        deck.addRemainingCard(new Pip(3));
        deck.addRemainingCard(new Pip(4));
        deck.addRemainingCard(new Pip(5));
        
        assertEquals("[Croupier]", 
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
    public void test8CroupiersVictoryHeSimplyIsOverAllPlayers() 
            throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
        
        players[0].addCardToHand(new Pip(10));
        players[0].addCardToHand(new Pip(7));
        
        players[1].addCardToHand(new Pip(3));
        players[1].addCardToHand(new Pip(5));
        players[1].addCardToHand(new Pip(6));
        
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(8));
        players[2].addCardToHand(new Pip(4));
        
        Croupier croupier = new Croupier();
        croupier.addCardToHand(new Pip(4));
        croupier.addCardToHand(new Pip(5));
        croupier.addCardToHand(new Ace());
        
        Deck deck = new Deck();
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Pip(4));
        deck.addRemainingCard(new Pip(5));
        
        assertEquals("[Croupier]", 
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
    public void test9CroupiersVictoryHeSimplyIsOverAllPlayersWithDraw() 
            throws Pip.ValueLowerThanMinimumException, Pip.ValueHigherThanMaximumException {
        
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
        
        players[0].addCardToHand(new Pip(10));
        players[0].addCardToHand(new Pip(7));
        
        players[1].addCardToHand(new Pip(3));
        players[1].addCardToHand(new Pip(5));
        players[1].addCardToHand(new Pip(6));
        
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(2));
        players[2].addCardToHand(new Pip(8));
        players[2].addCardToHand(new Pip(4));
        
        Croupier croupier = new Croupier();
        croupier.addCardToHand(new Pip(4));
        croupier.addCardToHand(new Pip(5));
        
        Deck deck = new Deck();
        deck.addRemainingCard(new King());
        deck.addRemainingCard(new Pip(4));
        deck.addRemainingCard(new Pip(5));
        
        assertEquals("[Croupier]", 
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
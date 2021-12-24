package blackjack.entities;

import blackjack.cards.Card;
import java.util.ArrayList;

public class Deck {

    final private ArrayList<Card> remainingCards = new ArrayList<>();
    
    public void addRemainingCard(Card card) {
        remainingCards.add(card);
    }
    
    public ArrayList<Card> getRemainingCards() {
        return remainingCards;
    }
    
}

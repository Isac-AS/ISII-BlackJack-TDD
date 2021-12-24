package blackjack.entities;

import blackjack.cards.Card;
import java.util.ArrayList;

public class Croupier {

    final private ArrayList<Card> hand = new ArrayList<>();
    
    public void addCardToHand(Card card) {
        hand.add(card);
    }
    
    public ArrayList<Card> getHand() {
        return hand;
    }
}

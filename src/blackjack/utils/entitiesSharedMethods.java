package blackjack.utils;

import blackjack.cards.Card;
import java.util.List;

public class entitiesSharedMethods {
    
    public static List<Card> addCard(List<Card> list, Card card) {
        list.add(card);
        return list;
    }
}

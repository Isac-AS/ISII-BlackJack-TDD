package blackjack.utils;

import blackjack.cards.Card;
import java.util.ArrayList;
import java.util.List;

public class gameMethods {
    
    public static ArrayList<String> getWinners(
            List<Card> player1Hand,
            List<Card> player2Hand,
            List<Card> player3Hand,
            List<Card> croupierCards,
            List<Card> remainingCardsInDeck) {
        ArrayList<String> winners = new ArrayList<>();
        winners.add("Player1");
        return winners;
    }
}

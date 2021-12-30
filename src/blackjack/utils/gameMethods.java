package blackjack.utils;

import blackjack.cards.Ace;
import blackjack.cards.Card;
import java.util.ArrayList;

public class gameMethods {

    public static ArrayList<String> getWinners(
            ArrayList<Card> player1Hand,
            ArrayList<Card> player2Hand,
            ArrayList<Card> player3Hand,
            ArrayList<Card> croupierCards,
            ArrayList<Card> remainingCardsInDeck) {

        ArrayList<String> winners = new ArrayList<>();
        ArrayList<Card> croupierBet = croupierHandAfterDrawingCards(
                croupierCards,
                remainingCardsInDeck);

        ArrayList<Card>[] playerHands = new ArrayList[3];
        playerHands[0] = player1Hand;
        playerHands[1] = player2Hand;
        playerHands[2] = player3Hand;

        if (gameMethods.isBlackjack(croupierBet)) {
            winners.add("Croupier");
            return winners;
        } else if(calculateScore(croupierBet) > 21) {
            for (int i = 0; i < playerHands.length; i++) {
                if (calculateScore(playerHands[i]) <= 21){
                    winners.add("Player" + (i + 1));
                }
            }
        } else {
            int croupierScore = calculateScore(croupierBet);
            for (int i = 0; i < playerHands.length; i++) {
                if (isBlackjack(playerHands[i])) {
                    winners.add("Player" + (i + 1));
                    continue;
                }
                int playerScore = calculateScore(playerHands[i]);
                if (playerScore > croupierScore && playerScore <= 21){
                    winners.add("Player" + (i + 1));
                }
            }
            if (winners.isEmpty()) {
                winners.add("Croupier");
            }
        }
        return winners;
    }

    public static int calculateScore(ArrayList<Card> hand) {
        int aceCounter = 0;
        int score = 0;
        for (Card card : hand) {
            if (card instanceof Ace) {
                aceCounter++;
            }
            score += card.getValue();
        }
        while (score > 21 && aceCounter > 0) {
            score -= 10;
            aceCounter--;
        }
        return score;
    }

    private static boolean isBlackjack(ArrayList<Card> hand) {
        return hand.size() == 2 && calculateScore(hand) == 21;
    }

    private static ArrayList<Card> croupierHandAfterDrawingCards(
            ArrayList<Card> croupierHand, ArrayList<Card> remainingInDeck) {
        while (calculateScore(croupierHand) < 17) {
            croupierHand.add(remainingInDeck.remove(0));
        }
        return croupierHand;
    }
}

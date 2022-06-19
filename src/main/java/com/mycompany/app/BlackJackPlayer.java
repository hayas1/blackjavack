package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class BlackJackPlayer {
    protected List<Card> hand = new ArrayList<Card>();
    protected List<Card> deck;
    protected String name;

    public BlackJackPlayer(List<Card> deck) {
        this.deck = deck;
        drawCard();
        drawCard();
    }

    public void drawCard() {
        hand.add(deck.remove(deck.size() - 1));
    }

    public void play() {}

    public int score() {
        var ace = hand.stream().filter(x -> x.getNumber() == 1).count();
        var score = hand.stream().map(x -> x.getNumber()).reduce(0, (s, x) -> s + Math.min(x, 10));
        for (int i = 0; i < ace; i++) {
            if (score + 10 <= 21) {
                score += 10;
            }
        }
        return score;
    }


    public String hands(boolean upHand) {
        var hands = new ArrayList<String> ();
        for (int i = 0; i < hand.size(); i++) {
            if (i > 0 && upHand) {
                hands.add("***");
            } else {
                hands.add(hand.get(i).toString());
            }
        }
        return String.join(", ", hands);
    }

    public String status(boolean upHand) {
        var score = upHand ? "***" : score();
        return name + "(" + score + "): " + hands(upHand);
    }
}

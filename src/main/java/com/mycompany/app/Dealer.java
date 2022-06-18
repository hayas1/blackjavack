package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer extends BlackJackPlayer {
    public Dealer(List<Card> deck) {
        super(deck);
    }

    public static ArrayList<Card> initDeck() {
        var deck = new ArrayList<Card>();
        for (Suit s: Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(s, i));
            }
        }
        Collections.shuffle(deck);
        return deck;
    }

    @Override
    public void play() {
        while (score() < 15) {
            super.drawCard();
        }
    }

    public String hands(boolean upHand) {
        if (upHand) {
            var hands = new ArrayList<String> ();
            for (int i = 0; i < this.hand.size(); i++) {
                if (i > 0) {
                    hands.add("***");
                } else {
                    hands.add(this.hand.get(i).toString());
                }
            }
            return String.join(", ", hands);
        } else {
            return String.join(", ", hand.stream().map(c -> c.toString()).toList());
        }
    }
}


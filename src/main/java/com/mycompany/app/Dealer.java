package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer extends BlackJackPlayer {
    public Dealer(List<Card> deck) {
        super(deck);
        super.name = "Dealer";
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
        while (score() < 17) {
            super.drawCard();
            System.out.println(this.status(false));
        }
    }
}


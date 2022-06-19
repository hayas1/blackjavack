package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer extends BlackJackPlayer {
    public Dealer(List<Card> deck) {
        super(deck);
        this.name = "Dealer";
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
        System.out.println(status(false));
        do {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (score() < 17) {
                drawCard();
            } else {
                break;
            }
            System.out.println(status(false));
        } while (true);
    }
}


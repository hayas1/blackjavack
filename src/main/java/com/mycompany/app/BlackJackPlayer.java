package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class BlackJackPlayer {
    protected List<Card> hand = new ArrayList<Card>(); 
    protected List<Card> deck;

    public BlackJackPlayer(List<Card> deck) {
        this.deck = deck;
        this.hand.add(deck.remove(deck.size() - 1));
        this.hand.add(deck.remove(deck.size() - 1));
    }

    public void play() {}

    public int score() {
        var ace = hand.stream().filter(x -> x.getNumber() == 1).count();
        var score = hand.stream().map(x -> x.getNumber()).reduce(0, Integer::sum);
        for (int i = 0; i < ace; i++) {
            if (score + 10 <= 21) {
                score += 10;
            }
        }
        return score;
    }

    public String getHand() {
        return String.join(", ", hand.stream().map(c -> c.toString()).toList());
    }
}

package com.mycompany.app;

import java.util.List;
import java.util.Scanner;

public class Player extends BlackJackPlayer {
    public Player(List<Card> deck) {
        super(deck);
    }

    @Override
    public void play() {
        var scanner = new Scanner(System.in);
        String res;
        do {
            System.out.println("Player(" + this.score() + "): " + this.getHand());
            System.out.print("draw? y/n > ");
            res = scanner.nextLine();
            System.out.println(res);
            if (res.equals("y")) {
                this.drawCard();
            } else {
                break;
            }
        } while (this.score() <= 21);
        scanner.close();
    }
}

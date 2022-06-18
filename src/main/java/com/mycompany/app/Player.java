package com.mycompany.app;

import java.util.List;
import java.util.Scanner;

public class Player extends BlackJackPlayer {
    public Player(List<Card> deck) {
        super(deck);
        super.name = "Player";
    }

    @Override
    public void play() {
        var scanner = new Scanner(System.in);
        String res;
        do {
            System.out.print("draw? y/n > ");
            res = scanner.nextLine();
            if (res.equals("y")) {
                this.drawCard();
                System.out.println(this.status(false));
            } else {
                break;
            }
        } while (super.score() <= 21);
        scanner.close();
    }
}

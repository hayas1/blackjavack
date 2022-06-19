package com.mycompany.app;

import java.util.List;
import java.util.Scanner;

public class Player extends BlackJackPlayer {
    public Player(List<Card> deck) {
        super(deck);
        this.name = "Player";
    }

    @Override
    public void play() {
        var scanner = new Scanner(System.in);
        String res;
        do {
            System.out.print("draw? y/n > ");
            res = scanner.nextLine();
            if (res.equals("y")) {
                drawCard();
                System.out.println(status(false));
            } else {
                break;
            }
        } while (score() <= 21);
        scanner.close();
    }
}

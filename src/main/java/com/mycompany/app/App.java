/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        playBlackjack();
    }

    public static void playBlackjack() {
        var deck = Dealer.initDeck();

        System.out.println("##### start blackjack #####");
        var dealer = new Dealer(deck);
        System.out.println(dealer.status(true));
        var player = new Player(deck);
        System.out.println(player.status(false));

        System.out.println("##### player's turn #####");
        player.play();
        if (player.score() > 21) {
            System.out.println("Bust!");
        }

        System.out.println("##### dealer's turn #####");
        dealer.play();
        if (dealer.score() > 21) {
            System.out.println("Bust!");
        }

        System.out.println("##### game end #####");
        System.out.println(player.status(false));
        System.out.println(dealer.status(false));
        if (player.score() == dealer.score() || (player.score() > 21 && dealer.score() > 21)) {
            System.out.println("Draw");
        } else if (player.score() > 21 || (dealer.score() <= 21 && player.score() < dealer.score())) {
            System.out.println("You Lose");
        } else if (dealer.score() > 21 || (player.score() <= 21 && dealer.score() < player.score())) {
            System.out.println("You Win");
        } else {
            System.out.println("Unexpected Game Result");
        }
    }

}

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
        System.out.println("---first hand---");
        var dealer = new Dealer(deck);
        System.out.println(dealer.status(true));
        var player = new Player(deck);
        System.out.println(player.status(false));
        System.out.println("---start blackjack---");
        player.play();
    }

}

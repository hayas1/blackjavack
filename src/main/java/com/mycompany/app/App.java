/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        var deck = Dealer.initDeck();
        var dealer = new Dealer(deck);
        System.out.println(dealer.getHand(true));
        var player = new Player(deck);
        player.play();

    }

}

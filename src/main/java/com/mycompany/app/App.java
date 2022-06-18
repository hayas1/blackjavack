/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;


public class App {
    public static void main(String[] args) {
        var dealer = new Dealer(Dealer.initDeck());
        System.out.println(dealer.deck);
        var p1 = new BlackJackPlayer(dealer.deck);
        System.out.println(p1.score());
        System.out.println( p1.getHand());
        System.out.println(p1.deck);

    }
}

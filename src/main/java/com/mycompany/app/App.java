/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        for (Suit s: Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(s, i));
            }
        }
        Collections.shuffle(deck);
        System.out.println(deck);
        var p1 = new BlackJackPlayer(deck);
        System.out.println(p1.score());
        System.out.println( p1.getHand());

    }
}

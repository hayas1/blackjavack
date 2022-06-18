/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        var card = new Card(Card.CLUB, 10);
        System.out.println(card);
        var card2 = new Card(Card.CLUB, 1);
        System.out.println(card2);
    }
}

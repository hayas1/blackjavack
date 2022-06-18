package com.mycompany.app;


enum Suit {
    SPADE, CLUB, DIAMOND, HEART;
    public String toString() {
        switch(this) {
            case SPADE:
                return "♠";
            case CLUB:
                return "♣";
            case DIAMOND:
                return "♦";
            case HEART:
                return "♥";
            default:
                return "J";
        }
    }

}

public class Card {
    public static Suit SPADE = Suit.SPADE;
    public static Suit CLUB = Suit.CLUB;
    public static Suit DIAMOND = Suit.DIAMOND;
    public static Suit HEART = Suit.HEART;

    private Suit suit;
    private int number;

    public Card(Suit suit, int number) {
        if (number < 1 || 13 < number) {
            throw new IllegalArgumentException();
        }
        this.suit = suit;
        this.number = number;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getNumber() {
        return this.number;
    }

    public String toString() {
        return String.format("%s%2d", getSuit(), getNumber());
    }
}

package com.deckofcards;

public class Main {

    public static void main(String[] args) {
        String temp1;
        int k = 0;
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] combine = new String[suits.length * ranks.length];

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                combine[k] = ranks[j].concat(suits[i]);
                k++;
            }
        }

        for (int i = 0; i < combine.length; i++) {
            int random = (int)Math.floor(Math.random() * 10) % combine.length;
            temp1 = combine[i];
            combine[i] =combine[random];
            combine[random] = temp1;
        }

        int h = 1;
        for (int i = 0; i < 4; i++) {
            System.out.println("Player" + h);
            for (int j = 0; j < 9; j++) {
                System.out.println(combine[j]);
            }
            h++;
        }
    }
}

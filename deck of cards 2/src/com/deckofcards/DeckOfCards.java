package com.deckofcards;

public class DeckOfCards {

    public static void main(String[] args) {
        String[] suits = {" Club", " Diamond", " Heart", " Spade"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] combine = new String[suits.length][ranks.length];
        String temp;
        int k = 0;

        //shuffling suits
        for (int i = 0; i < suits.length; i++) {
            int random = (int) Math.floor(Math.random() * 10) % suits.length;
            temp = suits[i];
            suits[i] = suits[random];
            suits[random] = temp;
        }

        //Shuffling ranks
        for (int i = 0; i < ranks.length; i++) {
            int random = (int) Math.floor(Math.random() * 10) % ranks.length;
            temp = ranks[i];
            ranks[i] = ranks[random];
            ranks[random] = temp;
        }

        //Displaying cards
        for (int i = 1; i <= suits.length; i++) {
            System.out.println("\nplayer" + i + " cards are:");
            for (int j = 0; j < 9; j++) {
                int random = (int) Math.floor(Math.random() * 10) % suits.length;
                combine[random][j] = ranks[j] + suits[random];
                System.out.println(combine[random][j]);
            }
        }


    }
}

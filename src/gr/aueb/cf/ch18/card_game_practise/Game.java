package gr.aueb.cf.ch18.card_game_practise;

import java.util.Scanner;

public class Game {
    private String player;
    int points;
    private final int[] houses = new int[4];
    private final Deck deck = new Deck();
    private final Scanner scanner = new Scanner(System.in);


    public Game(String player) {
        this.player = player;
    }

    public void startGame() {

        System.out.println("Welcome to our House of Cards Game " + player + "! You need to pick a card from the deck and place it on one of our Four piles or Houses.");
        System.out.println("The Goal of the game is for you to add points to each House in order to get 31 points to each House. If you exceed 31 points the House is Closed");
        System.out.println("Each card has unique points. Every face card offers 10 points, an Ace gives you 11 while the rest give you their written number for points.");
        System.out.println("Have fun!");
        System.out.print("Points: ");
        for (int i = 0; i < houses.length; i++) {
            System.out.print("House " + (i + 1) + " points : ," + houses[i] + " ");
        }
        System.out.println();

        while (true) {
            boolean cardUsed = false;
            if (winCondition()) break;
            if(loseCondition()){
                System.out.println("You lose :/");
                break;
            }
            checkHouse31();

            Card card = deck.removeCard();
            int point = deck.getPoint(card);
            System.out.println("You drew the " + point + " of " + card.getSuit()+ ". Please type the corresponding number of house (1-4) you would like to place it into");
            String choice = scanner.nextLine();
            while (!cardUsed) {
                switch (choice) {
                    case "1" : if(houses[0] < 31) {
                        houses[0] += point;
                        cardUsed = true;
                        break;
                    }
                    case "2" : if(houses[1] < 31){
                        houses[1] += point;
                        cardUsed = true;
                        break;
                    }
                    case "3" : if(houses[2] < 31){
                        houses[2] += point;
                        cardUsed = true;
                        break;
                    }
                    case "4" : if (houses[3] < 31){
                        houses[3] += point;
                        cardUsed = true;
                        break;
                    }
                    default:
                        System.out.println("Invalid choice, try again");
                }

            }

            for (int i = 0; i < houses.length; i++) {
                System.out.print("House " + (i + 1) + "points = " + houses[i] + " ");
            }
            System.out.println();

        }


    }

    public boolean winCondition() {
        if (deck.isEmpty()) {
            System.out.println("Congratulations, you win!");
            return true;
        }
        return false;
    }

    public boolean loseCondition() {
        for (int house : houses) {
            if (house <= 31) return false;
        }
        return true;
    }

    public void checkHouse31() {
        for (int house : houses) {
            if (house == 31) {
                points += 100;
                house = 0;
                System.out.println("Congrats " + player + "for getting 31 to the house " + house + ", you get 100 points");
            }
        }
    }

}



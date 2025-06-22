package basics.card_game;

import java.util.Scanner;

public class Game {
    private final String player;
    private final Deck deck = new Deck();
    private final Scanner scanner = new Scanner(System.in);
    int[] houses = new int[4];
    int points;


    public Game(String player) {
        this.player = player;
    }


    public void startGame() {
        System.out.println("Welcome to our House of Cards Game " + player+"! You need to pick a card from the deck and place it on one of our Four piles or Houses.");
        System.out.println("The Goal of the game is for you to add points to each House in order to get 31 points to each House. If you exceed 31 points the House is Closed");
        System.out.println("Each card has unique points. Every face card offers 10 points, an Ace gives you 11 while the rest give you their written number for points.");
        System.out.println("Have fun!");
        System.out.print("Points: ");
        for (int i = 0; i < houses.length; i++) {
            System.out.print("House " + (i + 1) + ": " + houses[i] + "  ");
        }
        System.out.println();

        while (true) {
            if (loseCondition()) {
                System.out.println("All the houses are closed and you lose the game :(");
                break;
            }
            if (winCondition()) break;
            checkHouse31();

            Card card = deck.drawCard();
            int points = deck.cardPoints(card);
            System.out.println("The card you drew is "+ card.getRank()+" of " +card.getSuit() +" that can give the house " + points+ " points");

            boolean cardUsed = false;

            try {
                while (!cardUsed) {
                    System.out.print("In which house would you like the add the card? Type the corresponding number of the house : ");
                    String choice = scanner.nextLine();
                    switch (choice){
                        case "1" : if (houses[0] < 31){
                            houses[0] += points;
                            cardUsed = true;
                            break;
                        } else System.out.println("This house is closed and you need to pick another house");
                        case "2" : if(houses[1] < 31){
                            houses[1] += points;
                            cardUsed = true;
                            break;
                        } else System.out.println("This house is closed and you need to pick another house");
                        case "3" : if(houses[2] < 31){
                            houses[2] += points;
                            cardUsed = true;
                            break;
                        } else System.out.println("This house is closed and you need to pick another house");
                        case "4" : if(houses[3] < 31){
                            houses[3] += points;
                            cardUsed = true;
                            break;
                        } else System.out.println("This house is closed and you need to pick another house");
                        default:
                            System.out.println("Invalid input, choose a house 1-4");
                    }

                }
            } catch (NumberFormatException e){
                System.out.println("Invalid choice, try again");
            }
            System.out.print("Points: ");
            for (int i = 0; i < houses.length; i++) {
                System.out.print("House " + (i + 1) + ": " + houses[i] + "  ");
            }
            System.out.println();
        }


    }


    public boolean winCondition() {
        if (deck.isEmpty()) {
            System.out.println("Congratulations " + player + "! The deck is empty and you win the game!");
            return true;
        }
        return false;
    }

    public void checkHouse31() {
        for(int i = 0; i < houses.length; i++){
            if(houses[i] == 31){
                points += 100;
                houses[i] = 0;
                System.out.println("Congratulations " + player + "! You got 31 points for House " + (i + 1));
            }
        }
    }

    public boolean loseCondition() {
        for(int house : houses){
            if(house <= 31) return false;
        }
        return true;
    }
}

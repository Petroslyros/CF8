package gr.aueb.cf.ch18.card_game_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final String[] ranks = {"Diamonds", "Hearts", "Clubs", "Spades"};
    private final String[] suits = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final List<Card> deck = new ArrayList<>();

    public Deck(){
        for(String suit : suits){
            for(String rank : ranks){
                deck.add(new Card(rank,suit));
            }
        }
        Collections.shuffle(deck);
    }

    public Card removeCard(){
        if (!isEmpty()){
            return deck.remove(0);
        }
        return null;
    }

    public int getPoint(Card card){
        return switch (card.getRank()) {
            case "Ace" -> 11;
            case "King", "Queen", "Jack" -> 10;
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            default -> -1;
        };
    }

    public boolean isEmpty(){
        return deck.isEmpty();
    }
}

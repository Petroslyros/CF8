package gr.aueb.cf.ch18.card_game_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final String[] suits =  {};
    private final String[] ranks = {};
    List<Card> deck  = new ArrayList<>();


    public Deck(){
        for(String suit : suits){
            for(String rank : ranks){
                deck.add(new Card(suit,rank));
            }
        }
        Collections.shuffle(deck);
    }

    public Card removeCard(){
        if(!isEmpty()){
            return deck.remove(0);
        }
        return null;
    }

    public int getPoints(Card card){
        switch (card.getRank()){
            case "10" : return 10;
            case "Jack","King","Queen" : return 10;
            case "2" : return 2;
            case "3" : return 3;
            case "4" :return 4;
            case "5" : return 5;
            case "6" : return 6;
            case "7" : return 7;
            case "8" : return 8;
            case "9" : return 9;
            default: return -1;
        }


    }


    public boolean isEmpty(){
        return deck.isEmpty();
    }




}

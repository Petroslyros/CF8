package gr.aueb.cf.ch18.sets;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {

        Set<String> bag = new HashSet<>();

        bag.add("apple");
        bag.add("orange");
        bag.add("apple");

        if(bag.contains("apple")){
            bag.remove("apple");
        } else {
            System.out.println("");
        }

        bag.forEach(System.out::println);
    }
}

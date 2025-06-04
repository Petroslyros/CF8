package gr.aueb.cf.ch19.streams;

import java.util.List;

public class MatchMain {
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Costas", "Denis");

        boolean allAreDenis = names.stream()
                .allMatch(name -> name.equals("Denis"));

        boolean nonIsDenis = names.stream()
                .noneMatch(name -> name.equals("Denis"));
    }

}

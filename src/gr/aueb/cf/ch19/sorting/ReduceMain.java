package gr.aueb.cf.ch19.sorting;

import gr.aueb.cf.ch19.streams.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceMain {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<gr.aueb.cf.ch19.streams.Product> products = new ArrayList<>(List.of(new gr.aueb.cf.ch19.streams.Product("Apples" , 12.5, 100),
                new gr.aueb.cf.ch19.streams.Product("Oranges", 8.2,100)
                , new Product("Honey", 8.2, 100)));


        int totalSum = numbers.stream().reduce(0, Integer::sum);

        int sumOfQuantities = products.stream()
                .map(Product::getQuantity)
                .reduce(0, Integer::sum);

        var sortedByDescription = products.stream()
                .filter(p -> p.getQuantity() == 100)
                .sorted(Comparator.comparing(Product::getDescription))
                .map(Product::getDescription)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}

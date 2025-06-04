package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products =new ArrayList<>(List.of(new Product("Apples", 12.5, 10),
                new Product("Orange", 8.2, 35)));

        products.sort(Comparator.naturalOrder()); //interface Comparable ascending
        products.sort(Comparator.reverseOrder()); //interface Comparable descending

        products.sort(Comparator.comparing(Product::getPrice));
        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getQuantity, Comparator.reverseOrder()));

        products.forEach(System.out::println);

        products.sort(
                Comparator.comparing(Product::getDescription)
                        .thenComparing(Product::getQuantity)
                        .thenComparing(Product::getPrice)
                        .reversed()  //to get ascending sorting
        );
    }
}

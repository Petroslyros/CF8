package gr.aueb.cf.ch18.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Apples" , 12.5, 10),
                new Product("Oranges", 8.2,15)
                , new Product("Honey", 8.2, 35)));

        ArrayList<String> listOfProductsDescriptions = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.toCollection(ArrayList::new));
        listOfProductsDescriptions.forEach(System.out::println);

        String listOfProductsDescriptions2 = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));
        System.out.println(listOfProductsDescriptions2);

        int totalQuantities = products.stream()
                .mapToInt(Product::getQuantity)
                .sum(); // total of the array

        double totalPrice = products.stream()
                .mapToDouble(Product::getPrice)
                .sum(); //total of the array(stream)

    }
}

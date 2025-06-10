package gr.aueb.cf.ch18.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MainMap {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        // add
        countries.put("GR", "Greece");
        countries.put("US", "United States");
        countries.put("EN", "England");

        //update
        countries.put("US", "U. States");

        //get
        String value = countries.get("GR"); //GREECE

        //remove
        countries.remove("GR");

        //iterate
        for (Map.Entry<String, String> entry: countries.entrySet()){
            System.out.println("Key : " + entry.getKey() + "Value" + entry.getValue());
        }

        countries.forEach((k,v) -> System.out.println("Key " + k + "Value: " + v));

        var filteredCountries = countries.entrySet().stream()
                .filter(e -> e.getKey().length() <= 2)
                .collect(Collectors.toSet());

        filteredCountries.forEach(System.out::println);
    }
}

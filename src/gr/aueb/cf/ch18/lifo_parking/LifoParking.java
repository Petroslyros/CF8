package gr.aueb.cf.ch18.lifo_parking;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Utilizes parking logic
 * with last in first out
 */
public class LifoParking {
    private final Deque<String> parking = new LinkedList<>();

    public LifoParking(){}

    public List<String> getParking() {
        return List.copyOf(parking);
    }

    public void addCar(String carId) {
        parking.push(carId);
        System.out.println(LocalDateTime.now() + ", Car id: " + carId);
    }

    public String removeCar(){
        String carId = parking.pop();
        System.out.println(LocalDateTime.now() + ", Exit " + carId);
        return carId;
    }

    public boolean isEmpty(){
        return parking.isEmpty();
    }

    public void traverse(){
        parking.forEach(System.out::println);
    }

}

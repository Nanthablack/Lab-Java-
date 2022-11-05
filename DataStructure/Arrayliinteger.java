import java.util.*;

public class Arrayliinteger {

    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<>();
        cars.add(5);
        cars.add(7);
        cars.add(50);
        cars.add(16);
        cars.add(24);
        for (Integer i : cars) {
            System.out.println(i);
        }
    }
}

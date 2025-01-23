package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Toyota");
        cars.add("Vinfast");
        cars.add(1, "Volvo");
        System.out.println(cars);
        // System.out.println(cars.get(0));
        cars.set(0, "BMW");
        cars.remove(1);
        cars.size();
        cars.clear();
    }
}

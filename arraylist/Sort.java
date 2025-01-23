package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Vinfast");

        Collections.sort(cars);
//        Collections.sort(cars, Collections.reverseOrder());        

        for (String i: cars) {
            System.out.println(i);
        }
    }
}

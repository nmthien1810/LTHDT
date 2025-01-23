package arraylist;
import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Vinfast");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String i: cars) {
            System.out.println(i);
        }
    }
}

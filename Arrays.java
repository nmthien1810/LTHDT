import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            String[] cars = {"BMW", "Mer", "RR"};
            int[][] nums = {{0, 1, 2} , {3, 4, 5}};

            System.out.println(cars[0]);           
            System.out.println("Length of cars: " + cars.length);

            for (String i: cars){
                System.out.println(i);
            }
            for (int[] row: nums){
                for (int j: row){
                    System.out.println(j);
                }                
            }         
        }
    } 
}

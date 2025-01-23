import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();

            System.out.println("Length = " + str.length());
            System.out.println("UpperCase: " + str.toUpperCase());
            System.out.println("LowerCase: " + str.toLowerCase());
            System.out.println("Index: " + str.indexOf('h'));
            System.out.println("Char at index: " + str.charAt(3));
            System.out.println("Substring: " + str.substring(0, 5));
        }       
    }
}

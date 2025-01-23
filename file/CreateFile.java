package file;

import java.io.File;  
import java.io.IOException; 

public class CreateFile {
    public static void main(String[] args) {
    try {
        File myObj = new File("filename.txt");  // File myObj = new File("C:\\Users\\ADMIN\\Downloads\\"filename.txt");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  }
}
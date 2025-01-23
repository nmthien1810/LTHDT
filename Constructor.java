public class Constructor {
    int x;

    public Constructor(){
        x = 5;
    }

    // public Main(int y)

    public static void main(String[] args) {
        Constructor myObj = new Constructor();
        // Main myObj = new Main(5);
        System.out.println(myObj.x);
    }
}

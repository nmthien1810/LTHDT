package innerclass;

class OuterClass2 {
    int x = 10;
  
    static class InnerClass2 {
        int y = 5;
    }
}
  
public class Main2 {
    public static void main(String[] args) {
      OuterClass2.InnerClass2 myInner = new OuterClass2.InnerClass2();
      System.out.println(myInner.y);
    }
}

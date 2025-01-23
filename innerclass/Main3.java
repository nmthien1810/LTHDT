package innerclass;

class OuterClass3 {
    int x =5;

    class InnerClass3 {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        OuterClass3 myOuter = new OuterClass3();
        OuterClass3.InnerClass3 myInner = myOuter.new InnerClass3();

        System.out.println(myInner.myInnerMethod());
    }
}

package innerclass;

class OuterClass {
    int x = 5;

    class InnerClass { // private class InnerCLass
        int y = 9;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myOuter.x + myInner.y);
    }
}

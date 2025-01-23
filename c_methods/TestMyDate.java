package c_methods;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(26, 10, 2024);
        MyDate md2 = new MyDate(26, 10, 2024);
        System.out.println(md1.toString());
        System.out.println(md1.equals(md2));
        System.out.println(md1.hashCode());
        System.out.println(md2.hashCode());
    }
}

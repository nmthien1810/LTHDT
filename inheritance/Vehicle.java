package inheritance;

class Vehicle {
    protected String brand = "Ford";

    public void honk(){
        System.out.println("Tuut Tuut");
    }
}

class Car extends Vehicle {
    private String name = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.name);
    }
}
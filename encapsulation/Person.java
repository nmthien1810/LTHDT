package encapsulation;

public class Person {
    private String name; // private String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
    
    public static void main(String[] args) {
        Person my = new Person();
        my.setName("John");
        System.out.println(my.getName());
    }
}

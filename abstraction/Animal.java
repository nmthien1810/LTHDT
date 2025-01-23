package abstraction;

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow bow");
    }
}

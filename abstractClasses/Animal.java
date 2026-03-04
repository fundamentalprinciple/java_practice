abstract class Animal {
    public abstract void animalSound();
    public static void sleep() {
        System.out.println("zzzzzzzzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("weeee weeee");
    }
}

class Main {
    public static void main(String[] args) {
        Pig peppa = new Pig();
        peppa.animalSound();
        Pig.sleep();
    }
}

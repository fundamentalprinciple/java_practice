interface Body {
    public void bodyColor();
}

interface Animal {
    public void animalSound();
    public void sleep();
}

class Pig implements Body, Animal {
    public void bodyColor() {
        System.out.println("pink");
    }
    public void animalSound() {
        System.out.println("weee weee");
    }
    public void sleep() {
        System.out.println("zzzzzzzzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig peppa = new Pig();
        peppa.bodyColor();
        peppa.animalSound();
        peppa.sleep();
    }
}

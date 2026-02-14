class Animal {
    public void speak() {
        System.out.println("Animal sound");
    }
}

class Lion extends Animal {
    @Override
    public void speak() {
        System.out.println("**Roars**");
    }
}

class AnimalSounds {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Lion(); //declared as animal, runtime object (instance) is lion
        //Lion c = new Animal(); Not possible
        a.speak();
        b.speak();
        c.speak();
    }
}

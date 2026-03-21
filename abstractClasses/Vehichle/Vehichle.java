public abstract class Vehichle {
    public abstract void Seats();

    public void Move() {
        System.out.println("moved");
    }
}

class Car extends Vehichle {
    @Override
    public void Seats() {
        System.out.println(4);
    }
}

class Main {
    public static void main(String[] args) {
        Car A = new Car();
        A.Seats();
        A.Move();
    }   
}

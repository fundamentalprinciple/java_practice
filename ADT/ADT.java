class Counter {
    public int value;
    
    public void increment() {
        value++;
    }
    
    public void reset() {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void set(int val) {
        this.value = val;
    }
}

class Number extends Counter {
    public void divideBy(int val) {
        this.value = this.value / val;
    }
}

public class ADT {
    public static void main(String[] args) {
        System.out.println("Hi");
        //Counter c = new Counter();
        Number c = new Number();
        System.out.println(c.getValue());
        c.increment();
        System.out.println(c.getValue());
        c.set(10);
        System.out.println(c.getValue());
        c.divideBy(5);
        System.out.println(c.getValue());
    }
}


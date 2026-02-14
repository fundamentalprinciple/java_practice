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

class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public double add(double a, double b) {
        return a+b;
    }
}

class Number extends Counter {
    public void divideBy(int val) {
        this.value = this.value / val;
    }
}

public class ADT {
    public static void main(String[] args) {
        //Counter c = new Counter();
        Number c = new Number();
        System.out.println(c.getValue());
        c.increment();
        System.out.println(c.getValue());
        c.set(10);
        System.out.println(c.getValue());
        c.divideBy(5);
        System.out.println(c.getValue());
        
        Calculator cal = new Calculator();
        System.out.println(cal.add(5,5));
        System.out.println(cal.add(4.9999,4.9999)); 
    }
}


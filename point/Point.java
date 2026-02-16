class Point {
    private int x;
    private int y;
    
    public void set(int a, int b) {
        this.x = a;
        this.y = b;
    }
    
    public void get() {
        System.out.println(this.x);
        System.out.println(this.y);
    } 
}

class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.get();
        p.set(1,2);
        p.get();
    }
}


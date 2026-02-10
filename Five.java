public class Five {
    void f(int a) {
            a = 20;
    }

    public static void main(String[] args) {       
        Five obj = new Five();
        int x = 10;
        obj.f(x);
        System.out.println(x);
        System.out.println("Call by value");
    }
}

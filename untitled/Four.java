public class Four {
    static void g(int m) {
        for (int x = 0; x < m; x++) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        g(10);
        System.out.println("\n");
        Four obj = new Four();
        obj.g(10); 
       
    }
}

import java.io.Console;

class Main {
    public static void main(String[] args) {
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");
        
        System.out.println(username);
        System.out.println(passwd);
    }
}

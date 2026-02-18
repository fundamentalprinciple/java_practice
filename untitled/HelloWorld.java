class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        for(int count = 0; count < args.length; count++) {
            System.out.println(args[count]);
        }
    }
}


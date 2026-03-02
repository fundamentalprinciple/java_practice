public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John",100000);
        Manager vohn = new Manager("Vohn",200000, john);
        System.out.println(john.getSalary());
        System.out.println(vohn.getSalary());
        System.out.println(vohn.getSecretary().getName());
        Employee e = new Manager("Ron", 300000, vohn);
        if (e instanceof Manager) {
            System.out.println("Yes");
        }
        System.out.println(e.getName());
        Manager Ron = (Manager) e;
        System.out.println(Ron.getSecretary().getName());
        return;
    }
}

public class Employee {
    private String name;
    private double salary;
    
 
    //constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String a) {
        this.name = a;
    }
    public void setSalary(double x) {
        this.salary = x;
    }

    public String getName() {
        return this.name;
    }
    public double getSalary() {
        return this.salary;
    }
}

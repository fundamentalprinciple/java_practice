public class Manager extends Employee {
    private Employee secretary;

    public Manager(String name, double salary, Employee sec) {
        super(name,salary);
        this.secretary = sec;
    }
    
    public void setSecretary(Employee e) {
        this.secretary = e;
        return;
    }
    public Employee getSecretary() {
        return this.secretary;
    }
}

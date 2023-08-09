public class Employee1 {
    private String name;
    protected double salary;
    private int age;
    
    public Employee1(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void raiseSalary() {
        this.salary *= 1.2;
    }
}

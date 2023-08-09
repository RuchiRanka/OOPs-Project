public class Employee {
    public String name;
    public int age;
    public int salary;
    public String location;

    public Employee(String name, int age, int salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public void raiseSalary(int raiseAmt) {
        System.out.println("Previous Salary: " + this.salary);
        this.salary += raiseAmt;
        System.out.println("Current Salary: " + this.salary);
    }
}

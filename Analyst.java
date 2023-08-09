public class Analyst extends Employee1 {

    public Analyst(String name, double salary, int age) {
        super(name, salary, age);
    }

    public double getAnnualBonus() {
        return super.salary * 0.05;
    }
}

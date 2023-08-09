public class Salesperson extends Employee1 {
    private double commissionPercentage;
    
    public Salesperson(String name, double salary, int age, double commissionPercentage) {
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }
    
    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void raiseCommission() {
        if(this.commissionPercentage < 0.30) {
            this.commissionPercentage *= 1.2;
        }
    }
}

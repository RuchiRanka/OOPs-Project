public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    } 

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }
}

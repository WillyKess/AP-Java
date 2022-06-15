public class BankAccount {
    private double balance;
    private String name;

    public BankAccount() {
        balance = 0;
        name = "Guest";
    }

    public BankAccount(String n, double b) {
        balance = b;
        name = n;
    }

    public void deposit(double depositVal) {
        balance += depositVal;
    }

    public void withdraw(double withdrawVal) {
        balance -= withdrawVal;
    }

    public String toString() {
        return "Name: " + name + "\nBalance: $" + balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}

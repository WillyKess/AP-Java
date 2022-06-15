import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        // part1();
        part2();
    }

    public static void part1() {
        Scanner readin = new Scanner(System.in);
        System.out.print("Account holder name: ");
        String name = readin.next();
        System.out.print("Initial account balance: $");
        double initialVal = readin.nextDouble();
        BankAccount myAccount = new BankAccount(name, initialVal);
        myAccount.deposit(505.22);
        System.out.println("Current balance: " + myAccount.getBalance());
        myAccount.withdraw(100);
        System.out.println("Account details: " + myAccount.toString());
        readin.close();
    }

    public static void part2() {

    }
}
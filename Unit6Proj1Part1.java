import java.io.File;
import java.util.Scanner;

class Unit6Proj1Part1 {
    public static void main(String[] args) {
        BankAccount[] bankA = new BankAccount[30];
        try {
            File file = new File("accounts.txt");
            Scanner sc = new Scanner(file);
            for (int i = 0; i < 30; i++) {
                String n = sc.next();
                double b = sc.nextInt();
                bankA[i] = new BankAccount(n, b);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Could not read the file");
        }
        for (BankAccount bA : bankA) {
            System.out.println(bA.toString());
        }
    }

    public static BankAccount searchByName(String toBeSearched, BankAccount[] accounts) {
        for (BankAccount bA : accounts) {
            if (bA.getName().equals(toBeSearched)) {
                return bA;
            }
        }
        return null;
    }

    public static BankAccount findHighestBalance(BankAccount[] accounts) {
        BankAccount highest = accounts[0];
        for (BankAccount bA : accounts) {
            if (bA.getBalance() > highest.getBalance()) {
                highest = bA;
            }
        }
        return highest;
    }

    public static boolean goodStanding(BankAccount[] accounts, double minimum) {
        for (BankAccount bA : accounts) {
            if (bA.getBalance() < minimum) {
                return false;
            }
        }
        return true;
    }

    public static BankAccount[] reverseOrder(BankAccount[] accounts) {
        BankAccount[] reversed = new BankAccount[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            reversed[i] = accounts[accounts.length - 1 - i];
        }
        return reversed;
    }

    public static boolean hasDuplicates(BankAccount[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            for (int j = i + 1; j < accounts.length; j++) {
                if (accounts[i].getName().equals(accounts[j].getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(BankAccount[] accounts) {
        for (int i = accounts.length - 1; i > 0; i--) {
            accounts[i] = accounts[i - 1];
        }
    }

    public static void deleteAccount(BankAccount[] accounts, int index) {
        for (int i = index; i < accounts.length - 1; i++) {
            accounts[i] = accounts[i + 1];
        }
        accounts[accounts.length - 1] = null;
    }
}
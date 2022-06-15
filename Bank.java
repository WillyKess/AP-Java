import java.time.LocalDate;

public class Bank {
    private String name;
    private LocalDate date = LocalDate.now();
    private BankAccount bankaccount1;
    private BankAccount bankaccount2;
    private BankAccount bankaccount3;

    public Bank() {
        name = "unnamed";
        bankaccount1 = new BankAccount("Guest", 0);
        bankaccount2 = new BankAccount("Guest", 0);
        bankaccount3 = new BankAccount("Guest", 0);
    }

    public Bank(String bn, BankAccount ba1, BankAccount ba2, BankAccount ba3) {
        name = bn;
        bankaccount1 = ba1;
        bankaccount2 = ba2;
        bankaccount3 = ba3;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date.toString();
    }

    public int getAccount(String accn) {
        int accountNo = bankaccount1.getName().equals(accn) ? 1
                : bankaccount2.getName().equals(accn) ? 2 : bankaccount3.getName().equals(accn) ? 3 : null;
        return accountNo;
    }

    public String depositAndPrint(String accn, int dv) {
        int accountNo = getAccount(accn);
        String returnVal = "";
        switch (accountNo) {
            case 1:
                bankaccount1.deposit(dv);
                returnVal = "Your " + getName() + " account inf\n" + bankaccount1.toString();
                break;
            case 2:
                bankaccount2.deposit(dv);
                returnVal = "Your " + getName() + " account inf\n" + bankaccount2.toString();
                break;
            case 3:
                bankaccount3.deposit(dv);
                returnVal = "Your " + getName() + " account inf\n" + bankaccount3.toString();
                break;
            default:
                break;
        }
        return returnVal;
    }

    public void withdrawAndPrint() {

    }
}
/*
 * A bank has the following instance variables (attributes) name current date
 * three bank accounts
 * 
 * It has the following methods: Constructor/s Returns its name Returns the
 * current date Searches for account according to customer’s name that is passed
 * to it as a String, returns 1 if it is the first account, 2 if it is the
 * second and so on Searches then deposits to the correct account, displays
 * account info with bank’s name Searches , withdraws, displays account info
 * with bank’s name
 * 
 */
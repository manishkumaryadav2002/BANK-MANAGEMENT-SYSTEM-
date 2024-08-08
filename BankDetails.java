package bank;
import java.util.Scanner;

class BankDetails {
    private String accNo;
    private String name;
    private String accType;
    private long balance;
    Scanner sc = new Scanner(System.in);

    // Method to open a new account
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accNo = sc.next();
        System.out.print("Enter Account type: ");
        accType = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    // Method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accNo);
        System.out.println("Account type: " + accType);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    // Method to withdraw money
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

    // Method to search an account number
    public boolean search(String ac_no) {
        if (accNo.equals(ac_no)) {
            showAccount();
            return true;
        }
        return false;
    }
}

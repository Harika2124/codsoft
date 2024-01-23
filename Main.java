import java.util.Scanner;
interface ATM {
    void withdraw(int amount);
    void deposit(int amount);
    void checkBalance();
}
class Bank implements ATM {
    private int balance;

    public Bank(int initialBalance) {
        this.balance = initialBalance;
    }
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Please collect the money\n");  // Add \n for a new line
        } else {
            System.out.println("Insufficient balance\n");  // Add \n for a new line
        }
    }
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Your money has been deposited\n");  // Add \n for a new line
    }
    public void checkBalance() {
        System.out.println("Balance: " + balance + "\n");  // Add \n for a new line
    }
}
public class Main {
    public static void main(String[] args) {
        ATM bank = new Bank(100000);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.println("Choose the operation you want to do");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to withdraw");
                    int withdrawAmount = sc.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit");
                    int depositAmount = sc.nextInt();
                    bank.deposit(depositAmount);
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }
    }
}

import java.util.Scanner;

public class ATMsimulation {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double balance = 1000.0;
            int choice;
            double amount;

            do {
                System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

    case 1 -> {
        System.out.println("Current Balance: ₹" + balance);
    }

    case 2 -> {
        System.out.print("Enter amount to deposit: ₹");
        amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    case 3 -> {
        System.out.print("Enter amount to withdraw: ₹");
        amount = sc.nextDouble();

        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    case 4 -> {
        System.out.println("Thank you for using the ATM!");
    }

    default -> {
        System.out.println("Invalid choice! Please try again.");
    }
}

            } while (choice != 4);

        } 
    }
}
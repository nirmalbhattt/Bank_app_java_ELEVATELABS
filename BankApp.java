import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("123456", "User");
        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 4:
                    for (String t : account.getTransactions()) {
                        System.out.println(t);
                    }
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}

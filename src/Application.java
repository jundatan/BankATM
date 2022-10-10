import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        int choice = 0;
        String account_name = "";
        Scanner sc = new Scanner(System.in);
        DataStorage dt = new DataStorage();
        System.out.println("Enter account name: ");
        Account ac;
        account_name = sc.nextLine();
        if(dt.searchBank(account_name) == null) {
            ac = new Account(account_name);
            dt.input(ac, account_name);
        } else {
            ac = dt.searchBank(account_name);
        }
        System.out.println("Welcome to simple Banking System: ");
        while (true) {
            System.out.println("Please Choose your choice:");
            System.out.println("0 - Quit");
            System.out.println("1 - Change Accounts");
            System.out.println("2 - Withdraw money");
            System.out.println("3 - Deposit money");
            System.out.println("------------------------");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0) {
                System.out.println("Thank you for using BankATM. Goodbye!");
                break;
            } else if (choice == 1) { 
                System.out.println("Enter account name: ");
                account_name = sc.nextLine();
                if(dt.searchBank(account_name) == null) {
                    ac = new Account(account_name);
                    dt.input(ac, account_name);
                } else {
                    ac = dt.searchBank(account_name);
                }
            }  else if (choice == 2) {
                System.out.println("Withdraw amount: ");
                ac.withdraw(sc.nextInt());
                System.out.println("------------------------");
                System.out.println(ac.toString());
            } else if (choice == 3) {
                System.out.println("Deposit amount: ");
                ac.deposit(sc.nextInt());
                System.out.println("------------------------");
                System.out.println(ac.toString());
            } else {
                System.out.println("Please choose a valid choice.");
                System.out.println("------------------------");
            }
            dt.input(ac, account_name);
        }
        sc.close();
    }
}

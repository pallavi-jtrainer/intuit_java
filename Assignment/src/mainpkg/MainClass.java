package mainpkg;

import java.util.Scanner;

import model.SavingsAccount;

public class MainClass {
	private void mainmenu(SavingsAccount[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Show Account Details");
        System.out.println("4. Exit");

        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.println("Exiting");
                System.exit(0);
            default:
                System.out.println("Wrong choice");
                break;
        }
        mainmenu(arr);
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        SavingsAccount arr[] = new SavingsAccount[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = new SavingsAccount();
        }

        MainClass obj = new MainClass();
        obj.mainmenu(arr);
    }

    private void deposit(SavingsAccount[] arr) {

    }
}

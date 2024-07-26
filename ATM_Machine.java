/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task_3;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author HP
 */
public class ATM_Machine {

    Scanner input = new Scanner(System.in);

    private Bank_Account account;

    public ATM_Machine() {
    }

    public ATM_Machine(Bank_Account account) {
        this.account = account;
    }

    public void menu() {
        System.out.println("     Welcome to ATM    ");
        System.out.println("Enter 1 for Withdraw ");
        System.out.println("Enter 2 for Deposit");
        System.out.println("Enter 3 for Check balance");
        System.out.println("Enter 4 for Exit");

    }

    public void checkBalance() {
        double balance = account.getbalance();
        System.out.println("Your current balance is: $" + balance);
    }

    public void run_process() {

        while (true) {
            try {
                menu();
                System.out.print("Choose the operation: ");
                int number = input.nextInt();

                if (number == 1) {
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw = input.nextDouble();

                    account.withdraw(withdraw);
                    System.out.println();
                } else if (number == 2) {
                    System.out.print("Enter the amount to Deposit: ");
                    double Deposit = input.nextDouble();
                    account.Deposit(Deposit);
                    System.out.println();
                } else if (number == 3) {
                    checkBalance();
                    System.out.println();

                } else if (number == 4) {
                    System.out.println("  Thank you for using the ATM. Goodbye!");
                    System.out.println();
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println("Erorr: please Enter numeric value.\n ");
                input.next(); // clear the invalid input
            }
        }
    }
}

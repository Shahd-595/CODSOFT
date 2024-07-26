/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task_3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Bank_Account {

    Scanner input = new Scanner(System.in);
    private double balance;

    public Bank_Account() {

    }

    public Bank_Account(double balance) {
        this.balance = balance;
    }

    public void setbalance() {
        this.balance = balance;
    }

    public double getbalance() {
        return balance;
    }

    public void Deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Deposited $" + money);
        } else if (money == 0) {
            System.out.println("your money is still " + balance);
        }
    }

    public void withdraw(double money) {
         while (money > balance || money < 0) {
            System.out.print("Invalid amount, please input the right amount: ");
            money = input.nextDouble();                  
        }

        balance -= money;
        System.out.println("Withdrew $" + money);
    }

}

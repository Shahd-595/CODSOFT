/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_3;

/**
 *
 * @author HP
 */
public class Task_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank_Account b = new Bank_Account(5000);
        ATM_Machine A = new ATM_Machine(b);
        A.run_process();

    }

}

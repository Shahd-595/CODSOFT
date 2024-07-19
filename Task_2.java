/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Task_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> calculator = new ArrayList<Double>();

        System.out.print("Enter the number of subjects: ");
        int num_of_subjects = input.nextInt();
        System.out.println();

        double sum = 0;
        double marks;

        System.out.println("Enter the marks for each subject: ");
        for (int i = 0; i < num_of_subjects; i++) {
            while (true) {

                if (input.hasNextDouble()) {
                    marks = input.nextDouble();

                    if (marks >= 0 && marks <= 100) {
                        calculator.add(marks);
                        sum += marks;
                        break; // Exit the loop when a valid input is received
                    } else {
                        System.out.println("Invalid input, please enter a number between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input, please enter a valid number.");
                    input.next(); // Consume the invalid input
                }
            }
        }

        double average = sum / num_of_subjects;

        String grade;
        if (average >= 90) {
            grade = "A";
        }
       else if (average >= 80 && average < 90) {
            grade = "B";
        }
       else if (average >= 70 && average < 80) {
            grade = "C";
        }
       else if (average >= 60 && average < 70) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println();
        System.out.println("Total marks: " + sum);
        System.out.printf("Average: %.2f%n", average); // we can put r instead of n
        System.out.println("Grade: " + grade);
        
    }
}

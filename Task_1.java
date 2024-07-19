/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_1;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

/**
 *
 * @author HP
 */
public class Task_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean playagain = true; //we make it true as if he dosenot want to play we will make it false
        int totalrounds = 0;
        int totalAttempts = 0; // all the attempts he collects from the rounds
        int totalScore = 0;

        while (playagain) {
            int randomNumber = random.nextInt(100 - 1 + 1) + 1; //generate a number between 0,99 but with adding 1 it generates number between 1,100 
            int maxAttempts = 5; // all the attempts he will use
            int attempts = 0; // count the num of attempts he has
            boolean guessedCorrectly = false;

            System.out.println("     Welcome to the Game of Guessing Numbers\n    ");
            System.out.println("you should guess a random number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                try {
                    System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                    int guess = input.nextInt();

                    if (guess < 1 || guess > 100) {
                        System.out.println("This number is out of the range, please try again ");
                        System.out.println("------------------------------------------------------------\n");

                    } else {
                        attempts++;
                        totalAttempts++;

                        if (guess < randomNumber) {
                            System.out.println("the number is too low. please try again");
                            System.out.println("------------------------------------------------------------\n");

                        } else if (guess > randomNumber) {
                            System.out.println("the number is too high. please try again");
                            System.out.println("------------------------------------------------------------\n");
                        } else {
                            System.out.println("Congratulations!,you gussed the correct number." + randomNumber);
                            guessedCorrectly = true;
                            totalScore += (maxAttempts - attempts + 1);
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erorr: please Enter numeric value.\n ");
                    input.next(); // clear the invalid input
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you used all the " + maxAttempts + " attempts.");
            }

            totalrounds++;
            System.out.println("Your score for this round: " + (guessedCorrectly ? (maxAttempts - attempts + 1) : 0));
            System.out.println("Total score: " + totalScore);

            System.out.println("Do you want to play again?  yes = 1    No = 2 ");
            int answer = input.nextInt();

            if (answer == 1) {
                playagain = true;
            } else {
                playagain = false;
                System.out.println("\nGame Over!");
                System.out.println("Total rounds played: " + totalrounds);
                System.out.println("Your final score: " + totalScore);

            }

        }
    }
}

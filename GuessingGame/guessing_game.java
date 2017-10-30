/**
 * Name: Jesus Leon
 * Class: CST-105 Computer Programming I
 * Instructor: Mohamed Mneimneh
 * Exercise 3 
 * 
 * TITLE: Guessing Game (JAVA).
 * 
 */

package GuessingGame;

import java.util.Scanner;

public class guessing_game {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {

			// Whether the user wins or not they'll be presented with this options to either
			// play again or not.
			if (guess(input)) {
				System.out.println("You WIN!\nPlay again soon!");
				break;
			} else {
				System.out.println("Play again? Enter yes or no: ");
				if (playAgain(input) == false) {
					break;
				}
			}

		}
		// If the user's input is "no" then the program will stop and display the
		// message.
		System.out.println("Thank you for playing!");
		input.close();

	}

	// This boolean variable is here if the user wants to play again.
	private static boolean guess(Scanner in) {

		System.out.println(
				"Welcome to the Guessing Game!\nYou have 5 guesses to" + " enter the correct number 1-10000.\n");

		int theNum = randomNum();
		int guess = 0;

		for (int guesses = 0; guesses < 5; guesses++) {

			if (guesses != 4) {
				System.out.printf("You have the %d tries remaining.\n", 5 - guesses);
			} else {
				System.out.println("You have 1 try remaining.");
			}

			System.out.print("Enter a number: ");

			guess = in.nextInt(); // This will tell the user (true) if they won.
			if (guess == theNum) {
				return true;
				// This will tell us if the number entered is too high.
			} else if (guess > theNum) {
				System.out.println("The number entered is too high!");
			} else {
				System.out.println("The number entered is too low!");
			}

		}

		System.out.println("You lose!");
		System.out.printf("The number was %d.\n", theNum);
		return false;

	}

	// Random numbers using this method.
	private static int randomNum() {
		return (int) ((Math.random() * 10000) + 1);

	}

	// If the user enters "yes" to play again.
	private static boolean playAgain(Scanner in) {
		in.nextLine();
		String response = in.nextLine();
		if (response.toLowerCase().equals("yes")) {
			return true;
		}
		return false;
	}

}

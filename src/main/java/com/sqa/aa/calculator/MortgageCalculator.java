/**
 *   File Name: MortgageCalculator.java<br>
 *
 *   Antonyan, Anna<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 25, 2016
 *   
 */

package com.sqa.aa.calculator;

import java.util.Scanner;

/**
 * MortgageCalculator //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

public class MortgageCalculator {

	public static void main(String[] args) {
		// Declare local variables
		String propertyID;
		String input;
		double principle;
		double interest;
		int termMonths;
		double monthlyPayment;
		Scanner scanner = new Scanner(System.in);
		// Wellcome user to the application
		System.out.println("Welcome to the Mortgage Calculator");
		boolean hasMoreHomes = false;
		do {
			// Ask the user what the propertyID is
			System.out.println("Which property would you like to calculate the mortgage on:");
			// Get the property ID and store it in a variable propertyID
			propertyID = scanner.nextLine();
			// Ask the user what what the principle is
			System.out.println("What is the principle:");
			// Get the principle and store it in a variable input
			input = scanner.nextLine();
			// Convert input String to a double type variable
			principle = Double.parseDouble(input);
			// Ask the user what what the interest is
			System.out.println("What is the interest:");
			// Get the interest and store it in a variable input
			input = scanner.nextLine();
			// Convert input String to a double type variable
			interest = Double.parseDouble(input);
			// Ask the user what the term in months is
			System.out.println("What is the term in months:");
			// Get the termMonths and store it in a variable input
			input = scanner.nextLine();
			// Convert input String to a double type variable
			termMonths = Integer.parseInt(input);
			// Calculate monthly payments
			monthlyPayment = (principle * interest / 12) / (1 - Math.pow(1 + interest / 12, -termMonths));
			// output information to the user
			System.out.println("Your monthly payments for " + propertyID + " will be " + Math.round(monthlyPayment)
					+ " for a total of " + termMonths / 12 + " years and " + termMonths % 12 + " months.");

			while (true) {
				System.out.print("Would you like to calculate mortgage for another home? (Yes/Y or No/N)");
				input = scanner.nextLine();
				if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y")) {
					hasMoreHomes = true;
					break;
				} else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("N")) {
					hasMoreHomes = false;
					break;
				} else {
					System.out.println("Invalid Input");
				}
			}

		} while (hasMoreHomes);
		// Say farewell to the user
		System.out.println("Thank you for using the Mortgage Calculator application.  \nGood Bye");
		// Close the Scanner object
		scanner.close();
		System.exit(0);
	}
}

package lab8arrays;
/*
 * 
 * @Author Kyle Warchuck
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayLab {

	public static void main(String[] args) {

		try {
			boolean tryAgain = true;
			while (tryAgain) {

				Scanner scnr = new Scanner(System.in);

				System.out.println("What student would you like to learn about? (enter a number 1-10): ");

				int userInput = (scnr.nextInt() - 1);

				String name = WhatStudent(userInput);
				System.out
						.println("You chose " + name + ", what would you like to know? hometown or favourite food?: ");
				System.out.println(HomeOrFood(name, userInput));
				System.out.println("Would you like to learn about a different student y/n?: ");
				tryAgain = scnr.next().toLowerCase().startsWith("y");

			}
			System.out.println("Goodbye!");

		} catch (InputMismatchException e) {
			System.out.println("Invalid input, reset and try again");
		} catch (IndexOutOfBoundsException a) {
			System.out.println("Invalid input, reset and try again");
		}

	}

	public static String WhatStudent(int i) {
		String names1[] = { "Josh", "Beth", "James", "Jerri", "Jerry", "Kyle", "Kile", "Kiley", "Jamestwo",
				"Jamesthree" };

		String names = names1[i];
		return names;

	}

	public static String HomeOrFood(String name, int i) {

		Scanner scnr = new Scanner(System.in);
		String hometown[] = { "Detroit", "Lansing", "Detroit", "Lansing", "Detroit", "Lansing", "Detroit", "Lansing",
				"Detroit", "Lansing" };
		String favfood[] = { "Cake", "Cake", "Cake", "Pie", "Pie", "Pie", "Cheese", "Cheese", "Cheese", "Human flesh" };

		String choice = null;
		String choice1 = null;

		choice = scnr.next();
		while (!(choice.equals("hometown")) && (!(choice.equals("favourite")))) {
			System.out.println("You did not pick hometown or favourite food, try again: ");

			choice = scnr.next();
		}
		if (choice.equals("hometown"))
			choice1 = (name + "'s hometown is " + hometown[i]);
		else
			choice1 = (name + "'s favourite food is " + favfood[i]);
		return choice1;

	}

}

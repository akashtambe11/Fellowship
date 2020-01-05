package com.BridgeLabz.Fellowship.Utility;

import java.util.Scanner;

public class Utility {
	static Scanner obj = new Scanner(System.in); // Scanner Object

	public static int integerInput() { // Input Integer
		return obj.nextInt();
	}

	public static float floatInput() { // Input Float
		return obj.nextFloat();
	}

	public static long longInput() { // Input Long
		return obj.nextLong();
	}

	public static double doubleInput() { // Input Double
		return obj.nextDouble();
	}

	public static String stringInput() { // Input String
		return obj.nextLine();
	}

	/* ==============================BASIC================================= */
	/*-----------------------------Flip Coin--------------------------------*/
	public static void flipCoin(int flips) {
		double head = 0, tail = 0;
		for (int i = 0; i < flips; i++) {
			// To make 50-50 Condition for head and tail at one time
			if (Math.random() < 0.5)
				head++;
			else
				tail++;
		}
		System.out.println("Percentage of Heads " + (head / flips) * 100);
		System.out.println("Percentage of Heads " + (tail / flips) * 100);
	}

	/*--------------------------Replace String-------------------------------*/
	public static String stringReplace(String str1, String str2, String str3) {
		// String 3 will go to at the place String 2
		// All changes are done in string 1
		return str1.replace(str2, str3);
	}

	/*----------------------------Leap Year----------------------------------*/
	public static void isLeapYear(int year) {
		int counter = 0;
		int new_Year = year;
		while (new_Year != 0) {
			new_Year /= 10;
			counter++;

		} // To check whether input number is 4 digit or not?
		if (counter != 4) {
			System.out.println("You have to Enter 4 digit number");
			System.out.println("Enter Leap Year again");
			year = Utility.integerInput();
			isLeapYear(year);
		} else

		// To Check Enter year is leap year or not?
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 00) {
			System.out.println(year + " is leap Year");
		} else {
			System.out.println(year + " is NOT leap Year");
		}
	}

	/*---------------------------Power of Two---------------------------------*/
	public static void powerOfTwo(int n) {
		// To ensure the input power is grater than 0 and less than 31
		if (n > 0 && n < 31) {

			for (int i = 1; i <= n; i++) {
				int power = (int) Math.pow(2, i);
				System.out.println("2 * " + i + " = " + power);
			}
		} else {
			// To call same function again util user enter right power of 2
			System.out.println("Invalid Input (Enter Again)");
			System.out.println("Range: 0 < Power < 31");
			int new_n = Utility.integerInput();
			Utility.powerOfTwo(new_n);
		}
	}

	/*---------------------------Harmonic Number------------------------------*/
	public static void harmonicSeries(int num) {
		double harmonic = 0;
		if (num > 0)
			// Calculations
			for (double i = 1; i <= num; i++) {
				harmonic = harmonic + (1 / i);
			}
		System.out.println(harmonic);
	}

	/*----------------------------Prime Factor--------------------------------*/
	public static void primeFactorCalculation(int num) {
		System.out.println("\nPrime factors are ");
		for (int i = 2; i < num; i++) {
			while (num % i == 0) {
				System.out.println(i);
				num = num / i;
			}
		}
		// Case 1 : If number came after while loop then it will be 2
		// case 2 : if not then number will always greater than 2
		if (num > 2)
			System.out.println(num);

	}

	/* ============================FUNCTIONAL=============================== */
	/*------------------------------2D Array---------------------------------*/
	public static void twoDArray(int row, int column) {
		int[][] array = new int[row][column];
		// Taking input for Elements
		System.out.println("Enter " + row * column + " Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = Utility.integerInput();
			}
		}
		// Display
		System.out.println("Displaying 2D Array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

	/*-----------------------Sum of Three is Zero---------------------------*/
	public static void sumOfThreeIntigerZero(int size) {
		// Input Array
		System.out.println("Enter " + size + " Elements");
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = Utility.integerInput();
		}
		// Computation
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = j + 1; k < size; k++) {
					if (num[i] + num[j] + num[k] == 0) {
						System.out.println("\nFound 3 elements whoes addition is zero");
						System.out.println("Elements : " + num[i] + " " + num[j] + " " + num[k]);
					}
				}
			}
		}
	}

	/*-------------------------Euclidean Distance---------------------------*/
	public static void euclideanDistance(int x, int y) {
		// Computation
		double distance = (double) (Math.sqrt(x * x + y * y));
		System.out.println("\nEuclidean Distance =  \n" + distance);
	}

	/*-------------------------Quadratic Equation---------------------------*/
	public static void quadraticEquation(double a, double b, double c) {
		// Computation
		double delta = b * b - 4 * a * c;
		double root_1 = ((-b + Math.sqrt(delta)) / (2 * a));
		double root_2 = ((-b - Math.sqrt(delta)) / (2 * a));
		// Display
		System.out.println("\nValue of Root 1 = " + root_1);
		System.out.println("Value of Root 2 = " + root_2);
	}

	/*-------------------------Wind Chill---------------------------*/
	public static void windChillcalculation(int temp, int vel) {
		if (temp > 50 || vel < 3 || vel > 120) {
			// Run if entered values are not in Range
			System.out.println("Invalid Input (Enter Again)");
			System.out.println("Enter Value for Temperture (T < 50)");
			int new_temp = Utility.integerInput();

			System.out.println("Enter Value for Velocity (3 < V < 120)");
			int new_vel = Utility.integerInput();

			Utility.windChillcalculation(new_temp, new_vel);
		} else {
			// Computation
			double w = 35.74 + (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(vel, 0.16);
			System.out.println("Wind Chill = " + w);
		}
	}

	/* ============================FUNCTIONAL=============================== */
	/*------------------------------Gambler---------------------------------*/
	public static void gamblerSimulator(int stakes, int goals, int trials) {
		int bet = 0;
		int win = 0;
		double winner;
		for (int i = 0; i < trials; i++) {
			int cash = stakes;
			while (cash > 0 && cash < goals) {
				bet++;
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;

			}
			if (cash == goals)
				win++;
		}
		//output
		System.out.println("Number of bets"+bet);
		System.out.println("You win "+win+" out of "+trials);
		winner=(double)((win/trials)*100);
		System.out.println(winner);
		System.out.println("Percentage of Win = "+(double)((win/trials)*100));
	}
	
	/*------------------------------Add Check---------------------------------*/
	public static void add(int a, int b) {
		int ans = a + b;
		System.out.println("Addition =");
		System.out.println(ans);
	}
}

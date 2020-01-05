package com.BridgeLabz.Fellowship.Functional;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
		// Input
		System.out.println("Enter Value for A");
		double a = Utility.doubleInput(); // a

		System.out.println("Enter Value for B");
		double b = Utility.doubleInput(); // b

		System.out.println("Enter Value for C");
		double c = Utility.doubleInput(); // c
		//Method Call
		Utility.quadraticEquation(a, b, c);
	}
}

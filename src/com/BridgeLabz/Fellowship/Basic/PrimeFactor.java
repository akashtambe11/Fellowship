package com.BridgeLabz.Fellowship.Basic;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class PrimeFactor {
	public static void main(String[] args) {
		//Input
		System.out.println("Enter the Number");
		int num = Utility.integerInput();
		//Method Call
		Utility.primeFactorCalculation(num);
	}
}

package com.BridgeLabz.Fellowship.Basic;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class PowerOfTwo {
	public static void main(String[] args) {
		//Input
		System.out.println("Enter Power for number two");
		int n = Utility.integerInput(); //Where '2' is power of 2
		Utility.powerOfTwo(n);
	}
}

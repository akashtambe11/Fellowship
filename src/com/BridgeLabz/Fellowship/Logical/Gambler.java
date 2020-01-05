package com.BridgeLabz.Fellowship.Logical;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class Gambler {
public static void main(String[] args) {
	//Input
	System.out.println("Enter Value for Stake (Cash)");
	int stakes = Utility.integerInput();
	
	System.out.println("Enter Value for Goals (Cash)");
	int goal = Utility.integerInput();
	
	System.out.println("Enter Value for Trials");
	int trials = Utility.integerInput();
	//Method Call
	Utility.gamblerSimulator(stakes, goal, trials);
}
}

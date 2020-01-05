package com.BridgeLabz.Fellowship.Functional;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		//Input
		System.out.println("Enter Value for Temperture (T < 50)");
		int temp = Utility.integerInput();
		
		System.out.println("Enter Value for Velocity (3 < V < 120)");
		int vel = Utility.integerInput();
		
		Utility.windChillcalculation(temp, vel);
	}
}

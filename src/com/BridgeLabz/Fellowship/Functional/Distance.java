package com.BridgeLabz.Fellowship.Functional;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class Distance {
	public static void main(String[] args) {
		//Input
		System.out.println("Enter value for cooradinate X");
		int x = Utility.integerInput(); //X
		
		System.out.println("Enter value for cooradinate Y");
		int y = Utility.integerInput(); //Y
		
		Utility.euclideanDistance(x,y);
	}
}

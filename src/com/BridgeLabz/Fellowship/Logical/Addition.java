package com.BridgeLabz.Fellowship.Logical;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class Addition {
public static void main(String[] args) {
	System.out.println("Enter one number");
	int a = Utility.integerInput();
	System.out.println("Enter second number");
	int b = Utility.integerInput();
	//Method Call
	Utility.add(a, b);
}
}

package com.BridgeLabz.Fellowship.Logical;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class Addition {
public static void main(String[] args) {
	System.out.println("Enter two number");
	int a = Utility.integerInput();
	int b = Utility.integerInput();
	
	Utility.add(a, b);
}
}

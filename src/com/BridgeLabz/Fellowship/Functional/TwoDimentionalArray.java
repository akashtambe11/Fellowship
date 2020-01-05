package com.BridgeLabz.Fellowship.Functional;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		//Input
		System.out.println("Enter value  for Row");
		int row = Utility.integerInput(); //row
		
		System.out.println("Enter value  for Column");
		int column = Utility.integerInput(); //column
		
		Utility.twoDArray(row, column);
	}
}

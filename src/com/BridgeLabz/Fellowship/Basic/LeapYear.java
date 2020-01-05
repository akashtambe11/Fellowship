package com.BridgeLabz.Fellowship.Basic;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter the Year ");
		int year = Utility.integerInput();
		Utility.isLeapYear(year);
	}
}

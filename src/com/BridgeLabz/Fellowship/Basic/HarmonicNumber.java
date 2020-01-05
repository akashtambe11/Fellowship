package com.BridgeLabz.Fellowship.Basic;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class HarmonicNumber {
	public static void main(String[] args) {
		//Input
		System.out.println("Enter the nth number for Harmonic series");
		int num = Utility.integerInput();
		Utility.harmonicSeries(num);
		
	}
}
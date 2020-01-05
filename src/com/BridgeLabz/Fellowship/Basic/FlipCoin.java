package com.BridgeLabz.Fellowship.Basic;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("Enter Number of flips");
		int flips = Utility.integerInput();
		
		Utility.flipCoin(flips);
	}
}

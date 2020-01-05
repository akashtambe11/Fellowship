package com.BridgeLabz.Fellowship.Basic;

import com.BridgeLabz.Fellowship.Utility.Utility;

public class ReplaceString {
	public static void main(String[] args) {
		System.out.println("Enter your string (Sentence) ");
		String str1 = Utility.stringInput();

		System.out.println("Enter the word you want replce ");
		String str2 = Utility.stringInput();

		System.out.println("Enter the word you want replce with ");
		String str3 = Utility.stringInput();

		String str4 = Utility.stringReplace(str1, str2, str3);
		System.out.println("New String is = " + str4);
	}
}

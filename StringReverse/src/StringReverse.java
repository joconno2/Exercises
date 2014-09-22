// Jim O'Connor
//
// This program will reverse a String without using API functionality, as an exercise.
// It will break on edge cases, but is left as is to preserve simplicity.

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String string = new String();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a string to be reversed: ");
		string = scanner.next();
		scanner.close();
		
		System.out.print("\nThe reversed string is: "+recursiveStringReversal(string));		
	}
	
	// This function will recursively reverse the given string
	public static String recursiveStringReversal(String string){
		if(string.length() < 2) // Base case
			return string;
		else
			return recursiveStringReversal(string.substring(1))+string.charAt(0); //Recursive call
	}

}

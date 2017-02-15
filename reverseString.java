package javaRepos;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// Reverse a given string
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string that you want reversed: ");
		String my_str = scanner.nextLine();
		
		System.out.println("The string you entered: " + my_str);
		int strLen = my_str.length();
		System.out.println("Len of the string is: "+ strLen);
		String revString = "";
		for (int i = strLen-1; i >=0; i--){
			revString = revString + my_str.charAt(i);
		}
		System.out.println("The reverse string is : " + revString);

	}

}

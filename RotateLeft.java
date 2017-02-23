package javaRepo.javaRepo;

import java.util.Scanner;

public class RotateLeft {

	public static void main(String[] args) {
		// Given an array of  integers and a number, , perform  left rotations on the array. 
		// Then print the updated array as a single line of space-separated integers.
		Scanner console = new Scanner(System.in);
		int[] userInput = readuserInput(console, "init", 2);
		System.out.println(userInput[0] + " " + userInput[1]);
		//System.out.println("ArrayLen: " + userInput[0] + " and # of rotations" + userInput[1]);
		int lenArray = userInput[0];
		int num_of_rotations = userInput[1];
		
		userInput = readuserInput(console, "array", lenArray);
		//printArray(userInput);
		
		shift(userInput, num_of_rotations);
		
		console.close();
	}
	
	public static void shift(int[] arr, int d){
		int tmp = 0;
		int j;
		for(int i = 0; i <= (d-1); i++){
			tmp = arr[0];
			for (j = 0; j < (arr.length - 1); j++){
				arr[j] = arr[j+1];
			}
			arr[j] = tmp;
		}
		printArray(arr);
		
	}
	
	//prints array
	public static void printArray(int[] ar){
		System.out.println();
		System.out.print(" " + ar[0]);
		for(int j = 1; j< ar.length; j++){
			System.out.print(" " + ar[j]);
		}
	}
	
	// reads user input for len of array and num of rotations
	public static int[] readuserInput(Scanner console, String type, int arrLen){
		int[] userInput;
		
		//System.out.println("ENTER: readuserInput()");
		if ( type.equals("init")){
			userInput = new int[2];
			//System.out.println("Enter array len and num of rotations ");
			userInput[0] = console.nextInt();
			//System.out.println("Enter num of rotations: ");
			userInput[1] = console.nextInt();
		}else{
			userInput = new int[arrLen];
			//System.out.println("Enter array elements of len " + arrLen + ": ");
			for(int i=0; i<=(arrLen - 1); i++){
				userInput[i] = console.nextInt();
			}
		}
		return userInput;
	}
}

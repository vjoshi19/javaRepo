package javaRepo.javaRepo;

import java.util.Scanner;

public class sorting1 {
	
	// Searches for a value in a given array
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int j;
		
		//System.out.print("Enter value to be searched: ");
		int value = console.nextInt();
		
		//System.out.print("Enter len of array : ");
		int aLen = console.nextInt();
		int A [] = new int [aLen];
		for(int i = 0; i <= (aLen - 1); i++){
			//System.out.println(i);
			A[i] = console.nextInt();
		}
		
		for(j = 0; j < A.length; j++){
			if(A[j] == value){
				break;
			}
		}
		System.out.println(j);
	}

}

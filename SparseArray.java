package javaRepo.javaRepo;

import java.util.Scanner;

public class SparseArray {

	//There are  strings. Each string's length is no more than  characters. There are also  queries. For each query, you are given a string, 
	// and you need to find out how many times this string occurred previously.
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int matched;
		
		//System.out.print("Enter num of lines : ");
		int num_of_line = console.nextInt();
		console.nextLine();
		String[] data = readUserInput(console, num_of_line);
		//printArray(data);
		//System.out.print("Enter num of lines : ");
		int num_of_regex = console.nextInt();
		console.nextLine();
		String[] regex = readUserInput(console, num_of_regex);
		//printArray(regex);

		for(String rex : regex){
			matched = 0;
			for(String d : data){
				if(d.equals(rex)){
					++matched;
				}
			}
			System.out.println(matched);
		}
		System.out.println();
		
	}
	
	// reads the strings from console
	public static String[] readUserInput(Scanner scn, int n){
		String[] dataArr = new String[n];
		for(int i = 0; i < n; i++){
			dataArr[i] = scn.nextLine();
		}
		return dataArr;
	}
	
	// prints the array
	public static void printArray(String[] strArr){
		System.out.print(strArr[0]);
		for(int j =1; j< strArr.length; j++){
			System.out.print("," + strArr[j]);
		}
		System.out.println();
	}

}

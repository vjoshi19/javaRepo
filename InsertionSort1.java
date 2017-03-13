package javaRepo.javaRepo;

import java.util.Scanner;

public class InsertionSort1 {
	// Inserts a value at the end of array in the correct location of a sortedlist.
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int n = console.nextInt();
		int a[] = new int [n];
		for(int i = 0; i< n; i++){
			a[i] = console.nextInt();
		}
		//System.out.println("len of arry: " + a.length);
		insertSorted(a);
	}
	
	public static void insertSorted(int[] a){
		
		int tmp = a[a.length -1];
		//System.out.println("len of arry: " + a.length);
		for(int i = 0; i < a.length; i++){
			if(tmp <= a[i]){
				for(int j=(a.length - 2); j>=i; j--){
					System.out.println("j="+j);
					a[j+1] = a[j];
					printArray(a);
				}
				System.out.println("i="+i);
				System.out.println("temp=" + tmp);
				a[i] = tmp;
				printArray(a);
				break;
			}
		}
	}
	
	public static void printArray(int[] arr){
		System.out.print(arr[0]);
		for(int k = 1; k < arr.length; k++){
			System.out.print(" " + arr[k]);
		}
		System.out.println();
	}

}

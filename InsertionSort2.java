package javaRepo.javaRepo;

import java.util.Scanner;

public class InsertionSort2 {
	// Inserts a value at the end of array in the correct location of a sortedlist.
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int n = console.nextInt();
		int a[] = new int [n];
		for(int i = 0; i< n; i++){
			a[i] = console.nextInt();
		}
		//System.out.println("len of arry: " + a.length);
		insertionSortPart2(a);
	}
	
	public static void insertionSortPart2(int[] a){
		
		int tmp, j, shift = 0;
		//System.out.println("len of arry: " + a.length);
		for(int i = 1; i < a.length; i++){
			tmp = a[i];
			j = i -1;
			while( (j >= 0) && ( a[j] > tmp)  ){
				//System.out.println("j=" + j);
				//System.out.println("a[j]="+a[j]);
				//System.out.println("a[j+1]="+a[j+1]);
				a[j+1] = a[j];
				++shift;
				j = j -1;
				//System.out.println("j=" + j);
			}
			a[j+1] = tmp;
			//System.out.println("i="+i);
			//System.out.println("temp=" + tmp);
		//printArray(a);
		
		}
		System.out.println(shift);
	}
	
	public static void printArray(int[] arr){
		System.out.print(arr[0]);
		for(int k = 1; k < arr.length; k++){
			System.out.print(" " + arr[k]);
		}
		System.out.println();
	}

}

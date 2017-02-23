package javaRepo.javaRepo;

import java.util.Scanner;

public class CompareTriplets {
	
	// Print two space-separated integers denoting the respective comparison scores
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int alice = 0, bob = 0;
		//System.out.println("Enter 6 integers: ");
		int a0 = console.nextInt();
		int a1 = console.nextInt();
		int a2 = console.nextInt();
		int b0 = console.nextInt();
		int b1 = console.nextInt();
		int b2 = console.nextInt();
		
		int[] a = {a0, a1, a2};
		int[] b = {b0, b1, b2};
		
		for(int i = 0; i < a.length; i++){
			if (a[i] > b[i]){
				++alice;
			}else if(a[i] < b[i]){
				++bob;
			}
		}
		System.out.print(alice + " ");
		System.out.println(bob);
	}
}

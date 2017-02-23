package javaRepo.javaRepo;

import java.util.Scanner;

public class Staircase {
	
	// prints a staircase pattern
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int n = console.nextInt();
		
		for(int i = 1; i <= n; i ++){
			for (int j = 1; j <= (n-i); j++){
				System.out.print(" ");
			}
			for(int k = i; k > 0; k--){
				System.out.print("#");
			}
			System.out.println();
		}

	}

}

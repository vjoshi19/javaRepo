package javaRepo.javaRepo;

public class fizzbuzz {

	public static void main(String[] args) {
		/**
		 * This program plays the game "Fizzbuzz".  It counts to 100, replacing each
		 * multiple of 5 with the word "fizz", each multiple of 7 with the word "buzz",
		 * and each multiple of both with the word "fizzbuzz".  It uses the modulo
		 * operator (%) to determine if a number is divisible by another.
		 **/
		Boolean fizz = false;
		Boolean buzz = false;
		System.out.println("Fizz Buzz Java");
		
		for(int i = 1; i <= 100; i ++){
			if(i % 5 == 0 && i % 7 == 0){
				System.out.println("FizzBuzz");
			}else if (i % 5 == 0){
				System.out.println("Fizz");
				fizz = true;
			}else if(i % 7 == 0){
				System.out.println("Buzz");
				buzz = true;
			}else{
				System.out.print(i+ " ");
				fizz = false;
				buzz = false;
			}
			
		}

	}

}

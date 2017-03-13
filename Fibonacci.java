package javaRepo.javaRepo;

public class Fibonacci {

	public static void main(String[] args) {
		// Non Recursive Fibonacci
		
		int n = 10;
		int fibo = 1;
		int fiboPrev = 1;
		System.out.print(fiboPrev + ", " + fibo);
		for(int i = 2; i < n; ++i){
			int temp = fibo;
			fibo += fiboPrev;
			fiboPrev = temp;
			System.out.print(", " + fibo );
		}

	}

}

package javaRepo.javaRepo;

public class factorial_recursive {

	public static void main(String[] args) {
		// Recursive
		int n = 5;
		int sol = factorial(n);
		System.out.printf("Factorial of %d is %d", n, sol);
	}
	
	public static int factorial(int n){
		if (n == 1){
			return n;
		}else{
			return (n * factorial(n-1));
		}
	}

}

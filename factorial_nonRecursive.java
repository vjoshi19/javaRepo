package javaRepo.javaRepo;

public class factorial_nonRecursive {

	public static void main(String[] args) {
		// Write a method that calculates the factorial of a given number.
		// Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
		// TIP: To make it more interesting, try to do it recursively.TODO Auto-generated method stub
		
		int n = 4;
		int factorial = 1;
		for(int i = 1; i <= n; i++){
			factorial *= i * 1;
		}
		System.out.printf("Factorial of %d is %d", n, factorial);
	}

}

package javaRepo.javaRepo;

import java.util.Scanner;

public class AlgoCrush2 {

	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        int M = scan.nextInt();
	        
	        /* Save interval endpoint's "k" values in array */
	        long [] array = new long[N + 1];
	        for (int m = 0; m < M; m++) {
	            int a = scan.nextInt();
	            int b = scan.nextInt();
	            int k = scan.nextInt();
	            array[a-1] += k;
	            array[b]   -= k;
	        }
	        scan.close();
	        
	        /* Find max value */
	        long sum = 0;
	        long max = 0;
	        for (int i = 0; i < N; i++) {
	            sum += array[i];
	            max = Math.max(max, sum);
	        }
	        
	        System.out.println(max);
	    }

}

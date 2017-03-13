package javaRepo.javaRepo;

import java.util.Scanner;

public class AlgoCrush {
	
	// You are given a list of size , initialized with zeroes. You have to perform  operations on the list and 
	// output the maximum of final values of all the  elements in the list. For every operation, you are given 
	//three integers ,  and  and you have to add value  to all the elements ranging from index  to (both inclusive).
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String line1 = console.nextLine();
		Scanner ln1 = new Scanner(line1);
		
		
		long nElements = ln1.nextLong();
		long mOps = ln1.nextLong();
		String [] line = new String[(int) mOps];
		// initializing and declaring array to 0
	    long[] eleArray = new long[(int) (nElements + 1)];
	    
		for(int i = 0; i < mOps; i++){
			line[i] = console.nextLine();
			Scanner ln = new Scanner(line[i]);
			long a = ln.nextLong();
			long b = ln.nextLong();
			long k = ln.nextLong();
			//System.out.println("a=" + a);
			//System.out.println("b=" + b);
			//System.out.println("k=" + k);
			for (long j = a; j <= b; j++){
				eleArray[(int) j] += k;
			}
			//print_array(eleArray);
		}
		
		System.out.println(findMax(eleArray));
	}
	
	public static long findMax(long[] a){
		long max;
		max = (int) a[0];
		for(int i = 1; i < a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
		}
		return max;
	}
		
	public static void print_array(int[] a){
		System.out.println();
		for(int k = 0; k < a.length;  k++){
			System.out.print(a[k] + ", ");
		}
		
		System.out.println();
	}

}

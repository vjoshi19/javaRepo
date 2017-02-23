package javaRepo.javaRepo;

public class PlusMinus {
	
	// Given an array of integers, calculate which fraction of its elements are positive, 
	// which fraction of its elements are negative, and which fraction of its elements are zeroes, 
	// respectively. Print the decimal value of each fraction on a new line.
	public static void main(String[] args) {
		int n = 6;
		int [] arr = {-4, 3, -9, 0, 4, 1};
		
		int positveNos = 0;
		int negativeNos = 0;
		int zeros = 0;
		
		for(int i : arr){
			if( i > 0){
				++positveNos;
			}else if( i < 0){
				++negativeNos;
			}else{
				++zeros;
			}
		}
		
		System.out.println(String.format("%.6f",(double)positveNos/n));
		System.out.println(String.format("%.6f",(double)negativeNos/n));
		System.out.println(String.format("%.6f",(double)zeros/n));
		
	}

}

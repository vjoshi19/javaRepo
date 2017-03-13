package javaRepo.javaRepo;

public class FindMinMaxSum {

	public static void main(String[] args) {
		// finds min and max of 4 numbers of a 5 num array
		//
		int [] arr = {1, 2, 3, 4, 5};
		
	
		long maxSum = 0;
		int minSum = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			sum = 0;
			for ( int j = 0; j < arr.length; j++){
				if (i != j){
					sum += arr[j];
				}
			}
			if ( i == 0 ){
				maxSum = sum;
				minSum = sum;
			}
			//System.out.println(sum);
			if ( sum < minSum){
				minSum = sum;
			}
			if(sum > maxSum){
				maxSum = sum;
			}
			
		}
		System.out.print(minSum + " ");
		System.out.print(maxSum);
	}

}

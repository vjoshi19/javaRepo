package javaRepo.javaRepo;

public class FindArraySum {

	public static void main(String[] args) {
		// This program finds the matching numbers to add up to a sum provided.
		
		//int[] arr = {1, 2, 4, 4, 5};
		int[] arr = {1, 2, 3, 9};
		Boolean found = false;
		int sum = 8;
		int newSum;
		int j = arr.length - 1;
		for (int i = 0; i <= arr.length - 1; i++){
			if( j > i){
				System.out.println("Adding :" + arr[i] + "+" + arr[j]);
				newSum = (arr[i] + arr[j]);
				if(newSum == sum){
					found = true;
					break;
				}else if( newSum > sum){
					j--;
				}
			}
			
		}
		if(found == false){
			System.out.println("The pair adding up to sum not found");
		}
	}

}

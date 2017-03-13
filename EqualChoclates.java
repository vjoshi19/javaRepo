package javaRepo.javaRepo;

public class EqualChoclates {
	// Input: 
	// 1 = # of TCs
	// 4 = # of coworkers
	// 2 2 3 7 = # of choclates each one has
	public static void main(String[] args) {
		
		int sum = 8;
		int tcs;
		int cow;
		int [] arrChoc = {2, 2, 3, 7};
		
		tcs = 1;
		cow = 4;
		
		int max = 0;
		for(int i = 0; i < arrChoc.length; i++){
			if( arrChoc[i] > max){
				max = i;
			}
		}
		System.out.println("max: " + arrChoc[max]);
		int diff = sum - arrChoc[max];
		System.out.println("diff: " + diff);
		
		// add diff to all except the 
	}

}

package javaRepo.javaRepo;

public class HourGlassSum {

	// There are  lines of input, where each line contains  space-separated integers describing 2D Array ; 
	// every value in  will be in the inclusive range of  to .
	public static void main(String[] args) {

		//int[][] A = {{1,1,1,0,0,0}, {0,1,0,0,0,0}, {1,1,1,0,0,0}, {0,0,2,4,4,0},{0,0,0,2,0,0}, {0,0,1,2,4,0}};
		int[][] A  = {{-1, -1, 0, -9, -2, -2}, {-2, -1, -6, -8, -2, -5}, {-1, -1, -1, -2, -3, -4}, {-1, -9, -2, -4, -4, -5},{-7, -3, -3, -2, -9, -9}
		,{-1, -3, -1, -2, -4, -5}};
		int sumhg = 0;
		int maxhg = 0;
		
		for(int i=0; i<=3; i++){
			for(int j=0; j<=3; j++){
				sumhg = A[i][j] + A[i][j+1] + A[i][j+2]
						+ A[i+1][j+1]
						+ A[i+2][j] + A[i+2][j+1] + A[i+2][j+2];
				System.out.println("HR Sum: " + sumhg);
				if(i == 0 && j == 0){
					maxhg = sumhg;
				}
				if (maxhg < sumhg){
					maxhg = sumhg;
				}
			}
		}
		System.out.println("Max Hour glass sum is : " + maxhg);

	}

}

package javaRepo.javaRepo;

public class DiagonalDiff {
	// Calculates the diff between two diagonals of a 2D matrix
	public static void main(String[] args) {
		int [][] A = {{11, 2, 4}, {4,5,6}, {10,8,-12}};
		int n = 3;
		int rtDiag = 0;
		int ltDiag = 0;
		
		int j = n - 1;
		for(int i = 0; i < n; i++){
			rtDiag += A[i][i];
			ltDiag += A[i][j--];
		}
		System.out.println(Math.abs(rtDiag - ltDiag));
	}

}

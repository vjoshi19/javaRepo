package javaRepo.javaRepo;

public class ABSeries {
	//The first line contains an integer, q, denoting the number of queries. 
	//Each line i of the  q subsequent lines contains three space-separated integers 
	//describing the respective ai,bi , 
	//and  n values for that query.
	public static void main(String[] args) {
		//2
		//0 2 10
		//5 3 5
		
		int q = 2;
		int a = 0, b = 2, n = 10;
		int term = a;
		int [] sum = new int[10];
		for(int i = 0; i < n; i++){
			term += b * ( Math.pow((double)2, (double)i));
			sum[i] = term;
			System.out.print(term + ", ");
		}
		
		

	}

}

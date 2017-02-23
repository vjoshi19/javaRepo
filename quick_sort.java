package javaRepo.javaRepo;

public class quick_sort {

	public static void main(String[] args) {
		// Partition and recursive sort
		int a[] = {34, 22, 87, 99, 56, 76};
		//int a[] = {34, 22, 87, 99};
		System.out.println("Unsorted Array: ");
		int arrLen = a.length - 1;
		System.out.println("of Len = " + arrLen );
		print_array(a);
		System.out.println("\n*****************");
		
		quickSort(a, 0, arrLen);
		System.out.println("Sorted Array: ");
		print_array(a);
	}
	
	public static void quickSort(int a[], int begin, int end){
		System.out.println("begin= " + begin + " end= " + end);
		if (begin < end){
			System.out.println("Partion is called with above begin and end");
			int q = partition(a, begin, end);
			System.out.println("q = " + q);
			//print_array(a); 
			int qend = q - 1;
			System.out.println("1Quick Sort called with= "+ begin + " and " + qend);
			quickSort(a, begin, q - 1);
			//int qbegi = q + 1;
			//System.out.println("2Quick Sort called with= "+ qbegi+ " and " +end);
			quickSort(a, q + 1, end);
		}else{
			System.out.println("begin is greater than end or equal to - out of QS");
		}
		
	}
	
	public static int partition(int a[], int begIndx, int endEndx){
		int pivot = a[endEndx];
		System.out.println("pivot is " + pivot + "End Index:" + endEndx);
		print_array(a);
		int i = begIndx - 1;
		System.out.println("initial i is set to = "+ i);
		
		for ( int j = begIndx; j < endEndx; j++ ){
			//System.out.println("j is set to = " + j);
			if (a[j] <= pivot ){
				i = i + 1;
				System.out.println("i in the loop is set to = "+ i);
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp1 = a[i+1];
		a[i+1] = a[endEndx];
		a[endEndx] = temp1;
		System.out.println("partion returning i value as = " +(i+1));
		return (i+1);
	}
	
	public static void print_array(int[] a){
		//System.out.println();
		for(int k = 0; k < a.length;  k++){
			System.out.print(a[k] + ", ");
		}
		//System.out.println("\n*****************");
	}

}

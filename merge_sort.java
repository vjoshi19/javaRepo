package homework;

public class merge_sort {
	public static final int MAXINT = 2147483647;
	public static void main(String[] args) {
		// Out of place sorting
		int a[] = {34, 22, 87, 99, 56, 76};
		
		System.out.println("Unsorted Array: ");
		int arrLen = a.length - 1;
		System.out.println("of Len = " + arrLen );
		print_array(a);
		System.out.println("\n*****************");
		mergeSort(a, 0, arrLen);
		System.out.println("Sorted Array: ");
		print_array(a);
		
		System.out.println("\n\nWorst Case Time complexity: O(nlogn)");
		System.out.println("Best Case Time complexity: Omega(nlogn)");
		System.out.println("Average Case Time complexity: Thita(nlogn)");
		System.out.println("Space complexity: O(n)");//same as bubble sort
		
	}
	
	public static void mergeSort(int arr[], int p, int r){
		//System.out.println("Calling MS on " + p + "," + r);
		if (p < r){ // starting pos is less than the end of arr
			int q = (p + r) / 2;
			mergeSort(arr, p, q);
			mergeSort(arr, q + 1, r);
			merge(arr, p, q , r);
		}
		/*else{
			System.out.println("mergeSort exited");
		}*/
	}
	
	public static void merge(int marr[], int p, int q, int r){
		int i, j;
		int n1;
		n1 = (q - p + 1);
		int n2 = (r - q);
		
		int s = (n1 + 1);
		int leftArr[] = new int[s];
		s = (n2 + 1);
		int rightArr[] = new int[s];
		/*System.out.print("\nMerge called on ");
		System.out.print("p=" +p);
		System.out.print("q=" +q);
		System.out.print("r=" +r);
		System.out.println("\nn1 is q-p+1=" +n1);
		System.out.print("n2 is r-q=" +n2 + "\n");
		System.out.println("Len of leftArr: " + leftArr.length);*/
		
		for ( i = 0; i < n1; i++){
			leftArr[i] = marr[p+i];
			//System.out.println(i + "->" + leftArr[i]);
		}
		
		//System.out.println("Len of rightArr: " + rightArr.length);
		for ( j = 0; j < n2; j++){
			/*if (q == 0){
				q = 1;
			}*/
			rightArr[j] = marr[q+j+1];
			//System.out.println(j + "->" + rightArr[j]);
		}
		// Set the last element of each array to a very large number
		//
		leftArr[n1] = MAXINT;
		rightArr[n2] = MAXINT;
		
		// Set i and j = 1
		i = 0;
		j = 0;
		
		for (int k = p; k <= r; k++){
			if (leftArr[i] < rightArr[j]){
				marr[k] = leftArr[i];
				i++;
			}else{
				marr[k] = rightArr[j];
				j++;
			}
		}
		//print_array(marr);
		
	}
	public static void print_array(int[] a){
		System.out.println();
		System.out.print(a[0]);
		for(int k = 1; k < a.length;  k++){
			System.out.print( ", " + a[k]);
		}
		System.out.println();
		//System.out.println("\n*****************");
	}
}

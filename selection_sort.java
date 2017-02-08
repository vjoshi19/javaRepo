package homework;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {34, 22, 87, 99, 56, 76};
		int min, i, j, temp;
		int arrLen = a.length;
		System.out.println("Unsorted - and arrlen = " + arrLen);
		print_array(a);
		System.out.println("******************");
		
		for(i = 0; i < arrLen -1; i++){
			min = i;
			for(j = i+1; j < arrLen; j++){
				if (a[j] < a[min]){
					min = j;
				}
			}
			//System.out.print("val of j=" + j);
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			//System.out.print(" a[min]="+a[min]);
			//print_array(a);
		}
		System.out.println("Sorted");
		print_array(a);
		
		System.out.println("\n\nWorst Case Time complexity: O(n^2)");
		System.out.println("Best Case Time complexity: O(n^2)");
		System.out.println("Average Case Time complexity: O(n^2)");
		System.out.println("Space complexity: O(1)");//same as bubble sort
	}
	
	public static void print_array(int[] a){
		System.out.println();
		for(int k = 0; k < a.length;  k++){
			System.out.print(a[k] + ", ");
		}
		
		System.out.println();
	}

}

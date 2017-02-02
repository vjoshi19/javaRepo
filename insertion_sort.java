package homework;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {34, 22, 87, 99, 56, 76};
		int key, i;
		int arrLen = a.length;
		System.out.println("Unsorted");
		print_array(a);
		System.out.println("******************");
		
		for ( int j = 1; j < arrLen; j++){
			key = a[j];
			
			i= j - 1;
			System.out.print("\nj=" + j);
			System.out.print("\ti=" + i);
			System.out.print("\tKey=" + key);
			System.out.print("\ta[i]=" + a[i]);
			while( i >= 0 && a[i] > key){
				System.out.print("\ta[i+1]=" + a[i+1]);
				a[i+1] = a[i];
				System.out.print("\ta[i+1]=" + a[i+1]);
				i = i - 1;
					
			}
			System.out.print("\t before key insertion i=" + i);// if i = -1 which is fine a[1] is where the key was removed from
			a[i+1] = key;
			System.out.print("\ta[i+1]=" + a[i+1]);
			print_array(a);
		}
		print_array(a);

	}
	
	public static void print_array(int[] a){
		System.out.println();
		for(int k = 0; k < a.length;  k++){
			System.out.print(a[k] + ", ");
		}
		
		System.out.println();
	}

}

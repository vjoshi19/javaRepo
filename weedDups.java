package javaRepos;

public class weedDups {

	public static void main(String[] args) {
		// Weed out duplicates from a sorted list of numbers:
		int a[] = {9, 8, 6, 6, 5, 5, 4, 3, 3, 2, 1, 1};
		int arrLen = a.length;
		
		
		int i = 0;
		int j = 0;
		System.out.println("Original Array");
		System.out.print(a[0]);
		for(int k = 1; k < a.length; k++){
			System.out.print("," + a[k]);
		}
		
		while(i < arrLen){
			if(a[i] == a[j]){
				i++;
			}else{
				a[++j] =a[++i];
			}
		}
		int b[] = new int[j+1];
		for(int k = 0; k < b.length; k++){
			b[k] = a[k];
		}
		//Array with no dups
		System.out.println("\nArray with no dups");
		System.out.print(b[0]);
		for(int k = 1; k < b.length; k++){
			System.out.print("," + b[k]);
		}
		
	}

}

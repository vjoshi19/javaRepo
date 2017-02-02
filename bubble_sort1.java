package homework;


public class bubble_sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5, 1, 6, 2, 4, 3};
		
		sort("ascending", a);
		
		sort("decending", a);
		
		}
		
		public static void sort(String wSort, int[] a){
			int temp;
			int arrLen = a.length;
			System.out.println("List has "+ (arrLen - 1) + " elements" );
			System.out.println("Performing a " + wSort + "sort");
			for(int i = 0; i < arrLen; i++){
				for(int j = 0; j < arrLen-i-1; j++){ // the arrLen -i -1 is to account for n - 1 comparisions for each loop.
					if (wSort == "ascending"){
						if (a[j] > a[j+1]){
							temp = a[j];
							a[j] = a[j+1];
							a[j+1] = temp;
						}
					}else{
						if (a[j] < a[j+1]){
							temp = a[j];
							a[j] = a[j+1];
							a[j+1] = temp;
						}
					}
					
				}
				System.out.print(i + "->");
				for(int k = 0; k < arrLen;  k++){
					System.out.print(a[k] + ", ");
				}
				
				System.out.println();
		}

	}

}

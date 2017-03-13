package javaRepo.javaRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class quickSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
         /*int n = in.nextInt();
         int[] ar = new int[n];
         for(int i=0;i<n;i++){
            ar[i]=in.nextInt(); 
         }*/
		 int n = 7;
		 int[] ar = {5, 8, 1, 3, 7, 9, 2};
		 //printArray(ar, 0, 7);
		 quicksort(ar, 0, 6);
         
     }    
	
	static void quicksort(int [] ar, int begIndx, int endIndx){
		if(begIndx >= endIndx){
			return;
		}
		int pivot = ar[begIndx];
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		
		for( int i = begIndx+1; i <= endIndx; i++){
			if(ar[i] > pivot){
				right.add(ar[i]);
			}else {
				left.add(ar[i]);
			} 
		}
		int ppos = begIndx;
		for(int num: left){
			ar[ppos++] = num;
		}
		ar[ppos++] = pivot;
		for(int num: right){
			ar[ppos++] = num;
		}
		quicksort(ar, begIndx, (begIndx+left.size() - 1));
		quicksort(ar, (begIndx + left.size()+1), endIndx);
		printArray(ar, begIndx, endIndx);
		
	}


	static void printArray(int[] ar, int b, int e) {
		//System.out.println("b=" + b + "e="+e);
	    for(int n=b; n <= e; n++){
	       System.out.print(ar[n]+" ");
	    }
	      System.out.println("");
	 }
	  
	static void partition(int[] ar, int endIndx) {
	    int partitionLen = ar.length - 1;
		System.out.println("endIndx len: " + endIndx);
		int left[] = new int [endIndx];
		int [] right = new int [endIndx];
		int pivot = ar[0];
		System.out.println("pivot= " + pivot);
		int li = 0, rj = 0;
		
		for(int i = 1; i < endIndx; i++){
			System.out.println("a[i]=" + ar[i]);
			if(pivot > ar[i]){
				left[li] = ar[i];
				++li;
			}else if(pivot <= ar[i]){
				
				right[rj] = ar[i];
				++rj;
			}
		}
		 
	}   
	

}

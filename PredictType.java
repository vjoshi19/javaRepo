package javaRepo.javaRepo;

import java.util.Scanner;

public class PredictType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long lowInt = getPowerOf2(31);
		long highInt = lowInt -1;
		long lowLong = getPowerOf2(63);
		long highLong = lowLong - 1;
		//int lowInt = (int) Math.pow((double)(2), (double)31);
		//int highInt = (int) (Math.pow((double)2, (double)31)-1);
		//long lowLong = (long) Math.pow((double)(2), (double)63);
		//long highLong = (long)(Math.pow((double)2, (double)63)-1);
		 try
         {
             long x=sc.nextLong();
             System.out.println(x+" can be fitted in:");
             if(x>=-128 && x<=127)System.out.println("* byte");
             //Complete the code
             if(x>=-32768 && x<=32767)System.out.println("* short");
             
             if(x>=-lowInt && x<=highInt)System.out.println("* int");
             
             if(x>=-lowLong && x <=highLong)System.out.println("* long");
                 
         }
         catch(Exception e)
         {
             System.out.println(sc.next()+" can't be fitted anywhere.");
         }
	}
	
	public static long getPowerOf2(int pow){
		long pow_of_two = 1;
		
		for(int i = 1; i <= pow; i++){
			pow_of_two = pow_of_two * 2;
		}
		return pow_of_two;
	}

}

package javaRepo.javaRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadInputLine {

	public static void main(String[] args) {
		   Scanner console = new Scanner(System.in);
	        
	        ArrayList <String> list = new ArrayList<String>();
	        
	        while(console.hasNextLine()){
	        	String s1 = console.nextLine();
	        	list.add(s1);
	        	if(s1.contentEquals("Read me until end-of-file.")){
	        		break;
	        	}
	        }
	        
	        for(int i = 0; i < list.size(); i++){
	        	int line = i + 1;
	        	System.out.println( line + " "+list.get(i));
	        }

	}

}

package javaRepo.javaRepo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringManip {

	public static void main(String[] args) {
		String userInput = "a";
		
		Scanner console = new Scanner(System.in);
		
		while(!userInput.equals("q")){
			userInput = display_menu(console);
			if (!userInput.equals("q")){
				System.out.println("UserInput: " + userInput);
				read_line_reverse_words(userInput);
			}
		}
	}
	
	// Reverses the order of the words.
	public static void read_line_reverse_words(String userAction){
		//System.out.println("\n\nIn reverse_words() : " + userAction);
		Scanner inputFile = null;
		int lineCount = 0;
		try {
			inputFile = new Scanner(new File("data/B-small-practice.in"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Contents of input file");
		while(inputFile.hasNext()){
			String line = inputFile.nextLine();
			++lineCount;
			if(lineCount > 1){
				if(userAction.equals("r")){
					line = reverse_words(line);
				}else if(userAction.equals("c")){
					line = reverse_chars(line);
				}else if(userAction.equals("a")){
					line = alternateCase(line);
				}else if(userAction.equals("u")){
					line = line.toUpperCase();
				}else if(userAction.equals("l")){
					line = line.toLowerCase();
				}
				
				System.out.println("Case #" + (lineCount+1) + ": " + line);
			}
		}
		inputFile.close();
	}
	
	// returns the alternateCase of the line
	public static String alternateCase(String aline){
		String altLine = "";
		String ulcase; 
		System.out.println("Line Passed: " + aline);
		for(int i = 0; i < aline.length(); i++){
			ulcase = "";
			ulcase = ulcase + aline.charAt(i);
			if(i % 2 == 0){
				ulcase = ulcase.toUpperCase();
			}else{
				ulcase = ulcase.toLowerCase();
			}
			altLine += ulcase;
		}
		return altLine;
	}
	
	// reverses chars in rline
	public static String reverse_chars(String rline){
		String revLine = "";
		System.out.println("Line passed: " + rline);
		for(int i = (rline.length()-1); i >= 0; i--){			
			revLine = revLine + rline.charAt(i); 
		}
		return revLine;
	}
	
	// reverse words in a rline
	public static String reverse_words(String rline){
		String revLine = "";
		System.out.println("Line passed: " + rline);
		String[] words = rline.split(" ");
		//System.out.println("how many words: " + words.length);
		for(int i = (words.length-1); i >= 0; i--){
			//System.out.println("i=" +i);
			//System.out.println(words[i]);
			words[i] = words[i] + " ";
			revLine += words[i];
		}
		//System.out.println(revLine);
		return revLine;
	}

	// Displays menu
	public static String display_menu(Scanner scn){
		String userAction = "";
		Boolean validInput = false;
		
		System.out.println("In display_menu()");
		while(!validInput){
			System.out.println();
			System.out.println("Enter (r/R) to Word reverse: ");
			System.out.println("Enter (c/C) to Char reverse: ");
			System.out.println("Enter (a/A) to Alternate Case: ");
			System.out.println("Enter (u/U) to uppercase: ");
			System.out.println("Enter (l/L) to lowercase: ");
			System.out.print("Enter (q/Q) to quit: ");
			userAction = scn.nextLine();
			userAction = userAction.toLowerCase();
			if(userAction.equals("q")
					|| userAction.equals("r") || userAction.equals("c") || userAction.equals("a")
					|| userAction.equals("l") || userAction.equals("u")){
				validInput = true;
				break;
			}
		}
		return userAction;
	}
}

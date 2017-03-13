package javaRepo.javaRepo;

import java.util.HashMap;

public class Anagrams {
	
	public static Boolean isAnagram(String s1, String s2){
		String copyOfs1 = s1.replaceAll("\\s", ""); // Removes the blank spaces
		String copyOfs2 = s2.replaceAll("\\s", "");
		copyOfs1 = copyOfs1.toLowerCase();
		copyOfs2 = copyOfs2.toLowerCase();
		System.out.println("s1= "+ copyOfs1);
		System.out.println("s2= "+ copyOfs2);
		Boolean status = true;
		// Initially setting status as true
		if(copyOfs1.length() != copyOfs2.length()){
			System.out.println("Lens of strings are diff");
			status = false;
		}else{
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			
			for(int i = 0; i < copyOfs1.length(); i++){
				char charAsKey = copyOfs1.charAt(i);
				int charCountAsValue = 0;
				if ( map.containsKey(charAsKey)){
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, ++charCountAsValue);
				charAsKey = copyOfs2.charAt(i);
				charCountAsValue = 0;
				if( map.containsKey(charAsKey)){
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, --charCountAsValue);
			}
			
			for(int value : map.values()){
				if(value != 0){
					status = false;
					break;
				}
			}
		}
		
		if(status){
			System.out.println(s1 + " and " + s2 + " are anagrams");
		}else{
			System.out.println(s1 + " and " + s2 + " are NOT anagrams");
		}
		
		
		return null;
		
	}

	public static void main(String[] args) {
		// Checks and tells if two strings are anagrams
		
		isAnagram("Mother In Law", "Hitler Woman");
		 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");
	}

}

package javaRepo.javaRepo;

import java.util.Scanner;

public class MilitaryTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        //String time = in.next();
        String time = "12:45:54PM";
        //System.out.println("Entered time is: " + time);
        int hour = Integer.parseInt(getTime(time, "hour"));
        int min = Integer.parseInt(getTime(time, "min"));
        int sec = Integer.parseInt(getTime(time, "sec"));
        String ampm = getTime(time, "ampm");
        
        if(ampm.equals("AM")){
        	if(hour == 12){
        		hour = 0;
        	}
        }else if(ampm.equals("PM")){
        	if(hour < 12){
        		hour = hour + 12;
        	}
        }
        
        System.out.printf("%02d",hour); 
        System.out.printf(":");
        System.out.printf("%02d",min);
        System.out.printf(":");
        System.out.printf("%02d",sec);
	}
	
	public static String getTime(String t, String type){
		String[] clockParts = t.split(":");
		String retStr;
        String sthour = clockParts[0];
        String stmin = clockParts[1];
        String stsecond = clockParts[2].substring(0, 2);
        String ampm = clockParts[2].substring(2);
        
        if(type == "hour"){
        	//System.out.println("hour: " + sthour);
        	retStr = sthour;
        }else if(type == "min"){
        	 //System.out.println("min: " + stmin);
        	 retStr = stmin;
        }else if(type == "sec"){
       	 //System.out.println("sec: " + stsecond);
       	 retStr = stsecond;
       }else{
    	   //System.out.println("sec: " + ampm);
         	 retStr = ampm;
       }
       
	   return retStr;
	}

}

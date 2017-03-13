package javaRepo.javaRepo;

import java.util.Scanner;

public class JavaSII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        //scan.next();
        double d = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();
        //scan.next();
        // Write your code here.

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}

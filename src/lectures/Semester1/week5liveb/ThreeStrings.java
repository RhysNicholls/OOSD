package lectures.Semester1.week5liveb;

import java.util.Scanner;

/** @author JuliaD */

public class ThreeStrings {

    public static void main(String[] args) {
        String s1, s2, s3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 3 words: ");
        
        s1 = scan.next();
        s2 = scan.next();
        s3 = scan.next();
        
        System.out.println("s1 is " +s1);
        System.out.println("s2 is " +s2);
        System.out.println("s3 is " +s3);
    } //main

} //class

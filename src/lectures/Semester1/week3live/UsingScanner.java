package lectures.Semester1.week3live;

import java.util.Scanner;

/* @author je-dawson  */
public class UsingScanner {

  public static void main(String[] args) {
    int i;
    double d;
    String s;

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter an integer, a double aND  a String: ");
    i = scan.nextInt();
    d = scan.nextDouble();
    s = scan.nextLine();
    
    

    System.out.println("");
  } // main

} // class

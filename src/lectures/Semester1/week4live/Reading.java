package lectures.Semester1.week4live;

import java.util.Scanner;

/* @author je-dawson  */
public class Reading {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double d1, d2;
    String str;

//     System.out.print("Enter a name and a double: ");
//    str = scan.nextLine();
//    d1 = scan.nextDouble();
//    System.out.println("Got " + str + " and " + d1);
    System.out.print("Enter a numbef (String): ");
    str = scan.next();
    d2 = Double.parseDouble(str);
       
    System.out.println("Number is " + d2);
        
    
    
    
  } // main

} // class

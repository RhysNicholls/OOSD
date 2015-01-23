package lectures.week4live;

import java.util.Scanner;

/* @author je-dawson  */
public class Operations {

  public static void main(String[] args) {
    double d1, d2;
    int i1 = 2, i2 = 5;

    Scanner scan = new Scanner(System.in);
//
//    System.out.println(i1 + i2 + " is Ans " );
//    System.out.println("Ans " + i1 + i2  );
//    System.out.println("Ans " + (i1 + i2)  );
//    
//    System.out.println("Line1 " + "Line2");
//    
//    System.out.println("Total " + (i1/i2));
//    System.out.println("Total i1% i2: " + (i1%i2));
//    
//    System.out.print("Enter a double: ");
//    d1 = scan.nextDouble();
//    
//    System.out.println("You said: " + d1);

    int i3 = 10;
    System.out.println("i3 is " + i3);

    i3 += 2;
    // i3 = i3+ 2;
    System.out.println("i3 is " + i3);

    i3++; // i3 = i3+1;
    System.out.println("i3 is " + i3);
    ++i3;

    int i4;
    i3 = 9;
    i4 = ++i3;
    System.out.println("i4 = " + i4);

    i3 = 9;
    i4 = i3++;
    System.out.println("i4 = " + i4);

  } // main

} // class

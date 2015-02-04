package lectures.Semester1.week4live;


/**
 *
 * @author Julia
 */
public class Remainder1 {

  public static void main(String[] args) {
    // Example of Integer arithmetic. Modulus. 
    // Convert a number of pennies to pounds, 50p 20p 10p 5p 1p
    // ideal use of Remainder or mod or modulo(%) operator
    // Sensible to find the number of pounds first !!

    int pound, fifty, twenty, ten, five, pence;
    pence = 418; // pick a test value
    
    System.out.println("Input = " +pence+" pence");
    // find pounds and remainder
    pound = pence / 100;
    pence = pence % 100;

    fifty = pence / 50;
    pence = pence % 50;

    twenty = pence / 20;
    pence = pence % 20;
    
    ten = pence / 10;
    pence = pence % 10;
    
    five = pence / 5;
    pence = pence % 5;


    System.out.println("Pounds: " + pound);
    System.out.println("Fifty: " + fifty);
    System.out.println("twenty: " + twenty);
    System.out.println("ten: " + ten);
    System.out.println("five: " + five);
    System.out.println("pence: " + pence);
    
    


  } // main
} // Remainder

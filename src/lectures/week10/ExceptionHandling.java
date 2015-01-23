package lectures.week10;

/* @author je-dawson  
 *  An advanced example showing how to handle Exceptions gracefully
 using try/catch
 */
public class ExceptionHandling {

  public static void main(String[] args) {
    //String numString = "17";
    String numString = "17x";
    int num = 0;

    // first let the program crash!! but note the exception.
//    try {
//      num = Integer.parseInt(numString);
//    } catch (NumberFormatException e) {
//      System.err.println(e + "\nO dear ... " + numString
//          + " is not a number");
//      System.exit(0);
//    }

    System.out.println("Num is " + num);
  } // main

} // class

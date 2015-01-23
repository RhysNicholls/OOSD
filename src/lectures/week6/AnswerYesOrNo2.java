package lectures.week6;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class AnswerYesOrNo2 {

  public static void main(String[] args) {
    // Keeping asking user until they answer yes or no version 2
    Scanner scan = new Scanner(System.in);
    String s;
    
    do {
      System.out.print("Enter yes or no: ");
      s = scan.nextLine();
    } while (!s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("no"));

    System.out.println("You entered: " + s);
  } // main
} // AnswerYesOrNo2

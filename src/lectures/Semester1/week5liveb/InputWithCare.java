package lectures.Semester1.week5liveb;

import java.util.Scanner;

/**
 *
 * @author Julia
 *
 * What's going on here? 
 * It seems that we can enter a String then an int 
 * but not the other way round?
 */
public class InputWithCare {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i;
    String str;
    
        System.out.print("Please enter a book title: ");
    str = scan.nextLine();

    System.out.print("Please enter an integer: ");
    i = scan.nextInt();



    System.out.println("You entered: " + i + " : " + str);
  }
} // InputWithCare

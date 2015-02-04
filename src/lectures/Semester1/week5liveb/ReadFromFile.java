package lectures.Semester1.week5liveb;

import java.util.Scanner;

/* @author je-dawson  */
public class ReadFromFile {

  public static void main(String[] args) {
//    //1. class
    Scanner sc = new Scanner(ReadFromFile.class.getResourceAsStream("/resources/input.txt"));

    while (sc.hasNextLine()) {
      System.out.println("Line: " + sc.nextLine());
    }
  
    
  } // main
} // class

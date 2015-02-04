package lectures.Semester1.week6;

import java.util.Scanner;
/*
  This is a short version see course book for full version
*/

public class ChineseZodiac5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String animal;

    System.out.print("Enter a year: ");
    int year = input.nextInt();

    switch (year % 12) {
      case 0:
        animal = "monkey";
        break;
      case 1:
        animal = "rooster";
        break;
      case 2:
        animal = "dog";
        break;
      case 3:
        animal = "pig";
        break;
      case 4:
        animal = "rat";
        break;
      case 5:
        animal = "ox";
        break;
      default:
        animal = "What?";
    }
    
    System.out.println("You are a " + animal);
  }
}

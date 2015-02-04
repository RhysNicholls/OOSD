package lectures.Semester1.week9;


import java.util.Scanner;

public class TestMax2 {

  /**
   * Main method
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(TestMax2.class.getResourceAsStream("numbers.txt"));
    int n1 = scan.nextInt();
    int n2 = scan.nextInt();
    int n3 = scan.nextInt();

    int j = max(n1, n2, n3);
    System.out.println("Max is " + j);
  }

  /**
   * Return the max between two numbers
   */
  private static int max(int num1, int num2) {
    return num1 > num2 ? num1 : num2;
  }

  /**
   * Return the max between three numbers
   */
  private static int max(int num1, int num2, int num3) {
    return max(max(num1, num2), num3);
  }
}

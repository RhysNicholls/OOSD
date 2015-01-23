package lectures.week9;
/*
  How to find the maximum of 3 numbers. ( ... or more)
  Embed one method call into another ...
*/

public class TestMax {

  public static void main(String[] args) {

    int n1 = 5, n2 = 2, n3 = 9;
//    int k = max(n1, n2);
    int j = max(n1, n2, n3);
    System.out.println("Max is " + j);
  }

  /**
   * Return the max of the two numbers
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

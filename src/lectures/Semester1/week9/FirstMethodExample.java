package lectures.Semester1.week9;

/** @author JuliaD */

public class FirstMethodExample {

    public static void main(String[] args) {
      int x = 67, y = 93;
        int z = max(x,y);
        
        System.out.println("Biggest is " + z);
    } //main

  private static int max(int num1, int num2) {
   int result = num1>num2? num1: num2;
   return result;
  }

} //class

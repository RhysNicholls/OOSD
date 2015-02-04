package lectures.Semester1.week6;

import java.util.Random;

/* @author je-dawson  */
public class UseRandom {

  public static void main(String[] args) {
    int n;
    Random gen = new Random();

//    for (int i = 0; i < 10000; i++) {
//      n = gen.nextInt(10);
//      if (n > 9 || n < 0) {
//        System.out.println(n + " is out of range");
//      }
//    }

    for (int i = 0; i < 100; i++) {
      n = gen.nextInt(10);
      if ( n % 2 == 1) { // number an odd 
        System.out.println(n + " is odd");
      }
    }

    System.out.println("Finished");
  } // main
} // class

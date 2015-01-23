package lectures.week7;

import java.util.Random;

/**
 * @author JuliaD
 */
public class GenerateThreeDigitNumber {

  public static void main(String[] args) {

    // 3 digit number .. max = 999, min =100
    // Need to generate a number from 0 - 899 then add 100
    // PROTOTYPE
    
    Random gen = new Random();
    int j;
    for (int i = 0; i < 1000; i++) {
      j = gen.nextInt(900)+100;
      
      // check for interesting  (boundary condition) numbers only!
      if (j < 104 || j > 990)
      System.out.println(j); // does the algorithm work?
    }

  } //main

} //class

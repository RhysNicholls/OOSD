package lectures.week6;

import java.util.Random;

/**
 * @author JuliaD
 *
 * Generate some random numbers
 * See: 
 * http://docs.oracle.com/javase/7/docs/api/java/util/Random.html#nextInt()
 * Using a low limit lets us see what inclusive/exclusive means
 */
public class GenerateNumbers2 {

  public static void main(String[] args) {
    int numberOfNumbers = 100, limit = 4, lineLength = 10;
    Random generator = new Random();

    // loop - output random numbers
    for (int i = 0; i < numberOfNumbers; i++) {
      System.out.println(generator.nextInt(limit)+ " ");
    }

//    // As above but putting several numbers on the same line
//    int count = 0;
//    for (int i = 0; i < numberOfNumbers; i++) {
//      System.out.print(generator.nextInt(limit) + " ");
//      count++;
//      if (count >=10) {
//        count = 0;
//        System.out.println("");
//      }
//    }
//    
    System.out.println("");

  } //main

} //class

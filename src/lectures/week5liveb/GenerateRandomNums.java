package lectures.week5liveb;

import java.util.Random;

/**
 *
 * @author Julia
 */
public class GenerateRandomNums {

    public static void main(String[] args) {
       Random gen = new Random();
       
       for (int i = 0; i < 100; i++) {
         System.out.println(gen.nextInt(300));
        
      }
       
    } // main

} // GenerateRandomNums

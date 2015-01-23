package lectures.week10;

import java.util.Random;

/* @author je-dawson  
   Generate 100 random number 10 -110 inclusive 
*/
public class ArrayRandom1 {

  public static void main(String[] args) {
    int[] allInts = new int[100];
    Random gen = new Random();

    for (int i = 0; i < 100; i++) {
      allInts[i] = gen.nextInt(100 + 1) + 10;
    }

////    for (int i = 0; i < 100; i++) {
////      System.out.println("N: " + allInts[i]); 
////    }
    
    

  } // main
} // class

/*

 LOOP for i 0 to < 100
 SET allInts[i] to random number  
 ENDLOOP
 */

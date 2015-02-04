package lectures.Semester1.week10;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Julia
 * 
 * Create an  array of 100 random numbers between 0 -999. Filter out any duplicate numbers. 
 * See Lecture notes for details
 */
public class ArrayRandom {

  public static void main(String[] args) {
    Random gen = new Random();
    final int SIZE = 100;
    int[] allInts = new int[SIZE];
    int[] noDupsTemp = new int[SIZE];
    int[] noDups;
    int dupsCounter = 0;

    // generate numbers
    for (int i = 0; i < allInts.length; i++) {
      allInts[i] = gen.nextInt(1000);
    }
    
    // copy unique numbers to new array
    for (int i = 0; i < allInts.length; i++) {
      if (!contains(allInts[i], noDupsTemp, dupsCounter)) {
        noDupsTemp[dupsCounter++] = allInts[i];
      }
    }

    System.out.println("Counter = " + dupsCounter);

    // create new array of correct size and copy numbers
    noDups = new int[dupsCounter];
    // see System.arraycopy()
    for (int i = 0; i < dupsCounter; i++) {
      noDups[i] = noDupsTemp[i];
    }

    // Sort array (useful to debug)
    Arrays.sort(noDups);

    System.out.println("Array noDups");
    for (int i = 0; i < noDups.length; i++) {
      System.out.println(noDups[i]);
    }

  } // main

  private static boolean contains(int i, int[] noDupsTemp, int dupsCounter) {
    // return true if array noDupsTemp contains value i
    for (int j = 0; j <= dupsCounter; j++) {
      if (noDupsTemp[j] == i) {
        return true;
      }
    }
    return false;

  }

} // ArrayRandom

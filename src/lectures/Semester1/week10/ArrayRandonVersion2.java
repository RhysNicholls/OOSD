package lectures.Semester1.week10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author JuliaD
 */
public class ArrayRandonVersion2 {

  public static void main(String[] args) {
    Random gen = new Random();
    int random, count = 0, range = 1000;
    int[] array = new int[100];
    
    while(count < 100) {
      random = gen.nextInt(range);
      if (! MyMethods.contains(random, array,count)) {
       // if (! contains(random, array,count)) {
        array[count] = random;
        count++;
      }
    }
    
    // Sort array (useful to debug)
    Arrays.sort(array);

    System.out.println("Array noDups");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    
  } //main
 

} //class



package lectures.Semester1.week10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author JuliaD
 * Generate a number of unique integers into an ArrayList
 */
public class ArrayListRandom {

  public static void main(String[] args) {
    // generate unique random numbers
    final int REQUIRED = 100;
    int count = 0, range = 1000, num;
    Random gen = new Random();

    // java Generics <> - this list is for Integers only!
    ArrayList<Integer> list = new ArrayList();
    
    while (count < REQUIRED) {
      num = gen.nextInt(range);
      if (! list.contains(num)) { // num is unique
        list.add(num);
        count++;
      }
    } // while
    
    Collections.sort(list); // An ArrayList is a collection, c.f. Arrays for arrays
    System.out.println("Amount = " + list.size());
    System.out.println(list);
    
  } //main

} //class



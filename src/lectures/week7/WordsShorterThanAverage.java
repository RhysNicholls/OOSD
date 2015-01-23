package lectures.week7;

import java.util.Scanner;

/**
 * @author JuliaD
 */
public class WordsShorterThanAverage {

  public static void main(String[] args) {
    Scanner scan = new Scanner(WordsShorterThanAverage.class.getResourceAsStream("trombones.txt"));

    int numWords = 0, wordAverage, totalChars = 0;
    String word;
    
    while (scan.hasNext()) {
      word = scan.next();
      numWords++;
      totalChars += word.length();     
    }
    
    wordAverage = totalChars/numWords;
    System.out.println("Word Average is " + wordAverage);
    
    scan.close();
    scan = new Scanner(WordsShorterThanAverage.class.getResourceAsStream("trombones.txt"));
    
    while (scan.hasNext()) {      
      word = scan.next();
      if (word.length() < wordAverage) {
        System.out.println(word);
      }
    }
    
    
  } //main

} //class


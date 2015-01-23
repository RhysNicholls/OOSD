package lectures.week6;

import java.util.Scanner;

/** @author JuliaD 
 This program reads words from a file until it reaches a key word
 */

public class StopOnKeyWord {

    public static void main(String[] args) {
       String keyWord = "shape", word;
       boolean found = false;
       
       Scanner scan = new Scanner(
           StopOnKeyWord.class.getResourceAsStream("trombones.txt"));
       
       while (scan.hasNext() && !found) {
         word = scan.next();
         if (word.equals(keyWord)) {
           found = true;
         }
         System.out.println(word);
       }
       System.out.println("");
       
    } //main

} //class

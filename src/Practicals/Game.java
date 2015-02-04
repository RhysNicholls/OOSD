package practicals;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author JuliaD
 */
public class Game {

  public static void main(String[] args) {
    Scanner scan = new Scanner(Game.class.getResourceAsStream("words.txt"));
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList();
    Random gen = new Random();
    String word, guess1, guess2;
    boolean guessed;

    while (scan.hasNext()) {
      list.add(scan.next());
    }

    for (int i = 0; i < 3; i++) {
      word = list.get(gen.nextInt(list.size()));
      System.out.print("Please enter 2 characters: ");
      guess1 = sc.next();
      guess2 = sc.next();

      System.out.printf("%s\"%s\", so ", "Word is ", word);
      System.out.println("your guess was " + (word.contains(guess1) || word.contains(guess2)));
    }
  } //main

} //class


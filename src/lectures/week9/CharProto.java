package lectures.week9;

import java.util.Random;

/**
 *
 * @author Julia
 */
public class CharProto {

  public static void main(String[] args) {
    Random gen = new Random();
    int n1 = 4, n2 = 9;

    for (int i = 0; i < 200; i++) {
      System.out.println(gen.nextInt(n2 - n1 + 1) + n1);
    }

  } // main
} // CharProto

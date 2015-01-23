
package lectures.week10;

/**
 *
 * @author je-dawson
 * This has no "main" method because it does not run!
 */
public class MyMethods {

  public static boolean contains(int num, int[] array, int count) {
    for (int i = 0; i < count; i++) {
      if (array[i] == num) {
        return true;
      }
    }
    return false;
  }


}

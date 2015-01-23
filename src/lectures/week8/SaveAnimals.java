package lectures.week8;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class SaveAnimals {

  public static void main(String[] args) {

    Scanner animals = new Scanner(
        SaveAnimals.class.getResourceAsStream("animals.txt"));
    Scanner protectedAnimals = new Scanner(
        SaveAnimals.class.getResourceAsStream("protected.txt"));

    String animal, protectedAnimal;
    boolean isProtected;

    while (animals.hasNextLine()) {
      animal = animals.nextLine();
      isProtected = false;
      while (protectedAnimals.hasNextLine()) {
        protectedAnimal = protectedAnimals.nextLine();
        if (protectedAnimal.equals(animal)) {
          isProtected = true;
        }
      }
      System.out.println((isProtected ? "" : "NOT ") + 
          "PROTECTED: " + animal);
      protectedAnimals.close();
      protectedAnimals = new Scanner(SaveAnimals.class.getResourceAsStream(
          "protected.txt"));
    }

  } // main
} // SaveAnimals

//VARS
// Scanner animals = Scanner to animals file
// Scanner protectedAnimals = Scanner to protected list
// String animal, protectedAnimal
// boolean isProtected
//
//LOOP while animals has line
//   SET animal = next line from animals
//   SET protected = false
//   LOOP while protectedAnimals has lines
//      SET protectedAnimal = next line from protectedAnimals
//      IF protectedAnimal = animal (ignore case)
//        SET isProtected = true
//      ENDIF
//   ENDLOOP 
//   IF isProtected 
//      PRINT animal is protected
//   ELSE
//      PRINT animal is not protected
//   ENDIF 
//
//   REOPEN protectedAnimals
//ENDLOOP

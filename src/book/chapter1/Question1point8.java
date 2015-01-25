/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.chapter1;

/**
 *
 * @author Shiftyllama
 */
public class Question1point8 {

    public static void main(String[] args) {
        
        double pi = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        double radius = 3.7;
        
        System.out.println("perimeter = " + 2 * radius * pi);
        System.out.println("area = " + radius * radius * pi);

    }
}
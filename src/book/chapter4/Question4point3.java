/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.chapter4;

/**
 *
 * @author Shiftyllama
 */
public class Question4point3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
     int grams;
    System.out.println("Kilograms            Grams");
    for(int kilograms = 0; kilograms <= 25; kilograms ++)
        
     { 
         grams = kilograms *1000;
         System.out.println(kilograms + "                    " + grams); 
     }
}
}
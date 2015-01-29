/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.chapter2;

/**
 *
 * @author Shiftyllama
 */
public class Question2point23 {
    public static void main(String args[])
    {
        long time = System.currentTimeMillis();
        long value = 65L + time % 26L;
        System.out.print((char)(int)value);
    }
}

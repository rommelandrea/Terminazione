/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.andrearomanello.collatz;

/**
 *
 * @author rommel
 */
public class Collatz {

    public static void scriviSequenzaCollatz(int n) {
        System.out.println("Stampo la sequenza di collatz per " + n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }

            System.out.print(n + " --> ");
        }
    }
}

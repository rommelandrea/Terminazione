/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.andrearomanello;

import static it.andrearomanello.collatz.Collatz.*;
import static it.andrearomanello.haltingproblem.HaltingProblem.*;
import static it.andrearomanello.selfprinting.SelfPrinting.*;

/**
 *
 * @author rommel
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean b;

        //scriviSequenzaCollatz(10);
        //Stampa();
        b = controllaTerminazione("src/ProvaTerminazione.java");
        if(b)
            System.out.println("il programma termina");
        else
            System.out.println("il programma NON termina");
    }
}

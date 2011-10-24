/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.andrearomanello.haltingproblem;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author rommel
 */
public class HaltingProblem {

    public static boolean controllaTerminazione(String file) {
        String str;
        String wt = "[\\s]*+while+[\\s]*+[(]+[\\s]*+true+[\\s]*+[)]+[\\s]*+[;]+[\\s]*";
        String fi = "[\\s]*+for+[\\s]*+[(]+[\\s]*+[;]+[\\s]*+[;]+[\\s]*+[)]+[\\s]*+[;{]+[\\s]*";

        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream in = new DataInputStream(fis);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            while ((str = br.readLine()) != null) {
                System.out.println(str);
                if(str.matches(wt) || str.matches(fi))
                    return false;
            }
        } catch (Exception e) {
            System.out.println("Errore: " + e);
        }

        return true;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.andrearomanello.selfprinting;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author rommel
 */
public class SelfPrinting {
    public static void Stampa(){
        try{
            FileInputStream fis = new FileInputStream("src/it/andrearomanello/selfprinting/SelfPrinting.java");
            
            DataInputStream in = new DataInputStream(fis);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String str;
            
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            
            in.close();
            
        }catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
}

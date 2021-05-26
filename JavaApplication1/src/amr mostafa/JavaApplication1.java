/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Lenovo
 */
public class JavaApplication1 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String d=new String("192.2.2.2");
        
        String[] s=d.split("\\.");
        System.out.println (s[0]);
        System.out.println (s[1]);
        System.out.println (s[2]);
        System.out.println (s[3]);
                
               
                       
    }
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author hyper
 * Date of Edit: 22/05
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] x = new char[5];
        x[0] = 'H';
        x[1] = 'e';
        x[2] = 'l';
        x[3] = 'l';
        x[4] = 'o';
        
        for(int dex = 0; dex < x.length; dex++){
            System.out.print(x[dex]);
        }
        
        // TODO code application logic here
    }
    
}

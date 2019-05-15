/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author hyper
 */
public class exercise2 {
    public static void main(String[] args){
        
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word.");
        str = in.nextLine();
        char[] word = new char[str.length()];
        for(int dex = 0;dex < str.length(); dex++){
            word[dex] = str.charAt(dex)
        }
        for(int ctr = word.length - 1;ctr>=0; ctr--){
            System.out.print(word[ctr]);
        }
        }
        
        
        
    }
    


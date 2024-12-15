/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prettyy;
import javax.swing.JOptionPane;
/**
 *
 * @author Eric Rodriguez
 */
public class PRETTYY {
public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ANSI_RED+"* ");
            }
            System.out.print(" ");
        }
    }
}

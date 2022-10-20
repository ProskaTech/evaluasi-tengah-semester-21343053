//Created by 21343053_KhalilulAfwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.prakpbo.uts.java.khalilul_afwan;

import javax.swing.JOptionPane;

/**
 *
 * @author KHALILUL
 */
public class UTS03 {
    public static void main(String[] args) {
        int number;
        String a;
        
        a = JOptionPane.showInputDialog("Masukkan Angka: ");
        number =Integer.parseInt(a);
        
        if(number>0){
            JOptionPane.showMessageDialog(null, "Angka " +number + " Merupakan Bilangan Positif");
        }
        
        else if (number<0){
            JOptionPane.showMessageDialog(null, "Angka " +number + " Merupakan Bilangan Negatif");
        }
        else{
            JOptionPane.showMessageDialog(null, "Angka " +number + " Merupakan Bilangan Nol");
        }
    }
}

//Created by 21343053_KhalilulAfwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.uts.java.khalilul_afwan;

import java.util.Scanner;

/**
 *
 * @author KHALILUL
 */
public class UTS02 {
    public static void main(String[] args){
        int i, j, k;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Baris: ");
        int baris = in.nextInt();
        
        for(i = 0 ; i <=baris ; i++){
            for (j = 1 ; j<i; j++){
                System.out.print(" ");
            }
            for (k = 1; k<=baris-i; k++){
                System.out.print(" #");
            }
            System.out.println();
        }
        
        for(i = 1; i <= baris ; i++){
            for(j = 1; j <=baris-i; j++){
                System.out.print(" ");
            }
            for(k = 1; k <=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

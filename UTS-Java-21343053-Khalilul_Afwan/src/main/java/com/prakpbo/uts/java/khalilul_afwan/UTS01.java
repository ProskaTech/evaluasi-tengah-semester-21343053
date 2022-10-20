/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.uts.java.khalilul_afwan;

/**
 *
 * @author KHALILUL
 */
public class UTS01 {
    public static void main(String[] args){
        int blankspace,k;
        int total = 9;
        int numnow = 4;
        int total2 = 9;
        int numnow2 = 9;

        while(numnow<9){
            blankspace = (total - numnow) / 4;
            for(k=0;k<blankspace;k++){
                System.out.print(" ");
            }
            for(k=blankspace+1;k<numnow/2+blankspace+1;k++){
                System.out.print(k);
            }
            for(k=0;k<blankspace;k++){
                System.out.print(" ");
            }
            System.out.print(" ");
            for(k=0;k<blankspace;k++){
                System.out.print(" ");
            }
            for(k=blankspace+1+numnow/2;k<numnow/2+blankspace+1+numnow/2;k++){
                System.out.print(k);
            }
            System.out.println(" ");
            numnow = numnow * 2;
        }

        while(numnow2>0){
            blankspace = (total2-numnow2) / 2;
            for(k=0;k<blankspace;k++){
                System.out.print(" ");
            }
            for(k=1;k<numnow2+1;k++){
                System.out.print(k);
            }
            for(k=0;k<blankspace;k++){
                System.out.print(" ");
            }
            System.out.println(" ");
            numnow2 = numnow2-2;
        }
    }
}

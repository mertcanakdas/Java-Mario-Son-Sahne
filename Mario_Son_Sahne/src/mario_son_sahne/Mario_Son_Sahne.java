/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mario_son_sahne;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Mario_Son_Sahne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int uzunluk;
        System.out.print("bir sayı giriniz:");
            uzunluk = input.nextInt();
           
        do {            
            
            if(uzunluk<1){
                System.out.print("pozitif bir sayı giriniz:");
                uzunluk = input.nextInt();
            }
        } while (uzunluk<1);
            for(int i=0;i<uzunluk;i++){
                if(i==0){
                    for(int m=0;m<uzunluk-1;m++){
                        System.out.print(" ");
                    }
                   for(int j=0;j<uzunluk*2;j++){
                       System.out.print(" ");
                   }System.out.println("<|");
                }else{
                    for(int k=(uzunluk-i)*2;k>0;k--){
                        System.out.print(" ");                    
                    }for(int l=0;l<i*2;l++){
                        System.out.print("*");
                    }for(int m=0;m<uzunluk;m++){
                        System.out.print(" ");
                    }System.out.println("|");
                }
                }
            }
        
        
        }
    

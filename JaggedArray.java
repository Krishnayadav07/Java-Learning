/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author krish
 */
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter no of Row in array:");
        int r=sc.nextInt();
        int a[][]; 
        a=new int[r][];
        int c=0;
        //geting no of cols in rows
  
        for (int i = 0; i < r; i++) {
            System.out.println("Enter Column in row "+(i+1));
            c=sc.nextInt();
            a[i]=new int[c];
            }
            
          //get array values  
           System.out.println("Enter Array data:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter column element in " +(i+1) +" Row & "+(j+1)+" Column: ");
                a[i][j]=sc.nextInt();
            }
            System.out.println();
       
        }
        
           //display aray
        System.out.println("Array data are:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
              }
            System.out.println();
        }
        
    }
        
 } 
   


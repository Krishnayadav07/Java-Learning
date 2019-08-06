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
public class Array1D {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter max size of Array: ");
        int n=sc.nextInt();
        //initz & decl array  
        int a[];
        a= new int[n];
         int sum=0;

        //get values in array
         System.out.println("Enter values in array");
         for (int i = 0; i < n; i++) {
             
             System.out.println("Enter: " +(i+1)+ " Element of array");
            //values in array
             a[i]=sc.nextInt();  
             sum = sum+a[i];
         }
         //Add array data
        
        System.out.println();
        //display array 
        System.out.println("Araay Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println("");
        System.out.println("\n Sum of array data is:" +sum);
      }
}

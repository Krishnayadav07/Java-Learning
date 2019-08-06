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
public class TwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Rows &Column in array:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int s[][]=new int[r][c];
        
       //getting valus in matrix a[][]
       System.out.println("Enter values in matrix a[][]"); 
       for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter Column value "+(j+1)+" Element of "+(i+1)+" Row:");
                a[i][j]=sc.nextInt();
                
            }System.out.println("");
            
        }System.out.println("");
        
        
        //getting values in matrix b[][]
        System.out.println("Enter values in matrix b[][]");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter Column "+(j+1)+" Element of "+(i+1)+" Row:");
                b[i][j]=sc.nextInt();
            }System.out.println("");
        }
                
         //Addition of matrix
         for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
            s[i][j]=a[i][j]+b[i][j];   
            }
       }
         
        //Display Array
               System.out.println(" matrix a[][]"); 
       for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j]+"\t");
               
            }System.out.println("");
       }
       
       
           System.out.println(" matrix b[][]"); 
       for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j]+"\t");
                
            }System.out.println("");
       }
       
       //Display Sum of Array
       System.out.println("Addition of Matrix a[][] + b[][] is");
          System.out.println(" matrix s[][]"); 
       for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(s[i][j]+ "\t");
                
            }System.out.println("");
       }
       
    }
    
}

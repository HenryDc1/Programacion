/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

// * @author hedo0495

import java.util.Scanner;

//Programar un algoritme recursiu que calculi la suma dels n primers números. Exemple: Entrada: 6 -- Sortida: 21 (1+2+3+4+5+6)


public class Exercici_Recursivitat_1 
{
     public static void main(String[] args) 
    {
        int n=3,suma;
        suma=Suma_recursiva(n);
        System.out.println(  "La suma es " + suma );

        
        
    }
    private static int Suma_recursiva(int n)
    {
    
        if(n==1) //Caso base
        {
            return 1;
        }
        else if(n==0)
        {           
            return 0;
        }
        else 
        {
             System.out.print( n + " + ");
            return n+Suma_recursiva(n-1);
       
        }
    }
    
    
}

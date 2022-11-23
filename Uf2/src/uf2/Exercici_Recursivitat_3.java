/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import java.util.Scanner;

// @author hedo0495
// * Programa que calculi la suma de tots els numeros parells, desde el numero que s'ha introduit fins a 2. Si s'ha introduît un numero senar, no ha de fer la suma i retornar -1 directament.

public class Exercici_Recursivitat_3 
{
    public static void main(String[] args) 
    {
        int n,calcul; 
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero");
        n=entrada.nextInt();
        calcul=Parells(n);
        System.out.println(calcul);
        
        
    }
    
    private static int Parells(int n)
    {
    
        if(n%2==0)
        {
        if(n==2) //Caso base
        {
            return 2;
        }
        else
        {
            
            return n+Parells(n-2);
        }
        }
        else
        {
            return -1;
        }
        
          
    }
    
}

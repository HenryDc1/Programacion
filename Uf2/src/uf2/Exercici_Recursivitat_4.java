/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;
import java.util.*;

//Realitza un algoritme recursivament , on es llegeixen dos valors enters per teclat i realitza la suma de tots els valors entre els dos números.

public class Exercici_Recursivitat_4 
{
    public static void main(String[] args) 
    {
        int min,max,calcul;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un valor minimo");
        min=entrada.nextInt();
        System.out.println("Introduce un valor minimo");
        max=entrada.nextInt();
        calcul=Suma_Between(min,max);
        System.out.println(calcul);
        
        
        
        
    }
     private static int Suma_Between(int min,int max)
    {
      if(max==min) //Caso base
        {
            return min;
        }
      
        else 
        {
           return max+Suma_Between(min,max-1);
       
        }
    }
}

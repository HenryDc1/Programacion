/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;
import java.util.*;

/**
 *
 * @author hedo0495
 */
public class Exercici_Recursivitat_2 
{
      public static void main(String[] args) 
    {
        int p,base,calcul; 
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce una base");
        base=entrada.nextInt();
        System.out.println("Introduce una potencia ");
        p=entrada.nextInt();
        calcul=Potencia(p, base);
        System.out.println(calcul);
        
    }
    
    private static int Potencia(int p,int base)
    {
    
        if(p==0) //Caso base
        {
            return 1;
        }
        else
        {
            
            return base*Potencia(p-1,base);
        }
       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author hedo0495
 */
public class Exercici_arañas_1 
{
    public static void main(String[] args) 
    {
          int aranyes,potes;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el numero de aranyas que hay");
        aranyes=entrada.nextInt();
        potes=Suma_potes(aranyes);
        System.out.println("Les potes de les " + aranyes + " aranyes sumen " + potes); 
        
    }
     private static int Suma_potes(int aranyes)   
    {
    
        if(aranyes==1) //Caso base
        {
            return 8;
        }
        else if(aranyes==0)
        {           
            return 0;
        }
        else 
        {
             
            return 8+Suma_potes(aranyes-1);
       
        }
    }    
}

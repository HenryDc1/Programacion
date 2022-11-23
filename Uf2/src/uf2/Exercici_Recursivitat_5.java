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
public class Exercici_Recursivitat_5 
{
    public static void main(String[] args) 
    {
        int numero,invert;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero ");
        numero=entrada.nextInt();
        invert=invertNumero(numero);
        System.out.println(invert%10);
        System.out.println(invert%10);

        
    }
    private static int invertNumero(int numero)
    {
        if(numero<10)
        {
            return numero;
        }
        else
        {
            return invertNumero(numero/10);
        }
    }
   
}

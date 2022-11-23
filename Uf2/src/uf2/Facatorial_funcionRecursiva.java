/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

/**
 *
 * @author hedo0495
 */
public class Facatorial_funcionRecursiva 
{
    public static void main(String[] args) 
    {
        int valor=5;
        System.out.println(valor + "!=" + factorial(valor));
        
    }
    private static int factorial(int n)
    {
    
        if(n==1) //Caso base
        {
            System.out.println("caso base 1:retorno 1");
            return 1;
        }
        else if(n==0)
        {
            
            return 1;
        }
        else 
        {
            System.out.println("Crido a " + n + "*factorial(" + (n-1) + ")");
            return n*factorial(n-1);
        }
    }
    
}

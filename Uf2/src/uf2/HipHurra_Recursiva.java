/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

/**
 *
 * @author hedo0495
 */
public class HipHurra_Recursiva 
{
    public static void main(String[] args) 
    {
        int num=4;
        salut(num);
        
    }
    private static void salut(int n)
    {
        
        if(n==0)//Caso base
        {
            System.out.println("Hurraaa!!");
        }
        else
        {
            System.out.print(" Hip ");
            salut(n-1);
        }
    }
    
}

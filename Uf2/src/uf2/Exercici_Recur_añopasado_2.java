/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

/**
 *
 * @author hedo0495
 */
public class Exercici_Recur_añopasado_2
{
    public static void main(String[] args)
    {
        int dia=2,virus;
        virus=Triplex(dia);
        System.out.println(virus);
        
        
    }
    private static int Triplex(int dia)
    {
        if(dia==1)
        {
            return 1;
        }
        else if(dia>1)
        {
            return 3*Triplex(dia-1);
        }
        return -1;
    }
    
}

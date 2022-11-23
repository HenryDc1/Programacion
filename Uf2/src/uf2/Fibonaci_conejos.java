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
public class Fibonaci_conejos 
{
     public static void main(String[] args) 
    {
        int mes,n;
        Scanner entrada=new Scanner(System.in);
        System.out.println("En quin mes vols saber cuants conills hi ha??");
        mes=entrada.nextInt();
        n=ConejosFibonacci(mes);
        System.out.println("En el mes " + mes + " hi han " + n + " parelles de conills");
        
        
        
    }
    private static int ConejosFibonacci(int mes)
    {
    
        if(mes<=1) //Caso base
        {
            return 1;
        }
        else if(mes>1)
        {           
            return ConejosFibonacci(mes-1)+ConejosFibonacci(mes-2);
        }
        return -1;
    }
    
}

    


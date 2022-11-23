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
public class Exercici_arañas_3 
{
    public static void main(String[] args) 
    {
         int files,bitlles;
         Scanner entrada=new Scanner(System.in);
         System.out.println("Cuantes files tens?");
         files=entrada.nextInt();
         bitlles=contarBitlles(files);
         System.out.println(files + " tenen " + bitlles + " bitlles ");
         
    }
    private static int contarBitlles(int files)
    {
        int bitlles;
        if(files==1)
        {
            bitlles=1;
            return bitlles;
        }
        else if(files>1)
        {
            return files+contarBitlles(files-1);
        }
        return-1;
    }
    
}

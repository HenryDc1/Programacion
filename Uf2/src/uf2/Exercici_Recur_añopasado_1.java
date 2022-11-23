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
public class Exercici_Recur_añopasado_1 
{
    public static void main(String[] args) 
    {
        int Trozos,dia,cal;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Dime el dia que queires saber cuantos turrones has comido hasta ese dia");
        dia=entrada.nextInt();
        Trozos=calculCal(dia);
        cal=calculDia(dia);
        System.out.print("El dia " + dia + " se comio " + Trozos + " trozos ");
        System.out.print("y todos estos trozos tienen " + cal + " calorias ");
        
       
  
        
    }
      private static int calculCal(int dia)
      {
          if(dia==0)
          {
              return 0;
          }
          else if(dia==1)
          {
              return 4;
          }
           else if(dia%3==0)
          {
              return 1+calculCal(dia-1);
          }
          else if(dia>1)
          {
              return 4+calculCal(dia-1);
          }
          return -1;
      }
       private static int calculDia(int dia)
      {
          int calorias=91;
          if(dia==0)
          {
              return 0;
          }
          else if(dia==1)
          {
              return 4*calorias;
          }
           else if(dia%3==0)
          {
              return 1*calorias+calculDia(dia-1);
          }
          else if(dia>1)
          {
              return 4*calorias+calculDia(dia-1);
          }
          return -1;
      }
    
    
}
   
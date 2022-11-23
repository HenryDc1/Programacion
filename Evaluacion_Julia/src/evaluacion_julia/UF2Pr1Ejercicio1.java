/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion_julia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class UF2Pr1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc= new Scanner(System.in);
        
        final int monedas_base= 10;
        int apuesta;
        
        apuesta = Quantitat_apostada(monedas_base);  //Llamo al metodo Quantitat_apostada    
        
        char disco1;
        char disco2;
        char disco3;
        
        //Llamo al metodo tirada_disc 3 veces
        disco1 = tirada_disc();
        disco2 = tirada_disc();
        disco3 = tirada_disc();
        
        
        mostrar_tirada (disco1, disco2, disco3); //Llamo al metodo mostrar_tirada
        
        // Para que en el método Calcular_premi lleguen los char
        int conversion1, conversion2, conversion3;
       
        // Para el disco1
        if (disco1=='a')
        {
            conversion1=0;
        }
        
            else if (disco1=='b')
            {
                conversion1=1;
            }

            else 
            {
                conversion1=2;
            }
        
        // Para el disco2
        if (disco2=='a')
        {
            conversion2=0;
        }
        
            else if (disco2=='b')
            {
                conversion2=1;
            }

            else 
            {
                conversion2=2;
            }
        
        // Para el disco3
        if (disco3=='a')
        {
            conversion3=0;
        }
        
            else if (disco3=='b')
            {
                conversion3=1;
            }

            else 
            {
                conversion3=2;
            }
        
        int premio = Calcular_premi (conversion1, conversion2, conversion3, apuesta); // Llamo al metodo Calcular_premi
        
        int jugada = (monedas_base-apuesta)+premio;
        
        System.out.println("Con esta tirada has ganado " + premio + " monedas");
        System.out.println("Te quedan " + jugada + " monedas");
        
        boolean num_tirada;
        
        num_tirada = Seguir_jugant (apuesta); // Llamo al metodo Seguir_jugant
        
        
    }
    
    public static int Quantitat_apostada (int saldo)
    {
        Scanner sc= new Scanner(System.in);
        int dinero=0;
        
        do {
        System.out.println("Cuanto dinero quieres apostar?");
        dinero= sc.nextInt();
        } while (dinero<=0 || dinero>10);
        
        return dinero;
    }
    
    public static char tirada_disc ()
    {
       Random rd= new Random();
       int tirada;
       char opcion= 'a';
        
       tirada= rd.nextInt(3);
       
       if (tirada==0)
       {
           opcion= 'a';
       }
       
       else if (tirada==1)
       {
           opcion= 'b';
       }
       
       else if (tirada==2)
       {
           opcion= 'c';
       }
       
           
       return opcion;
    }
    
    public static void mostrar_tirada (char a, char b, char c)
    {
       System.out.println("**************");
       System.out.println("* "+ a + " - "+ b + " - " + c + " *");
       System.out.println("**************");
        
    }
    
    
    public static int Calcular_premi (int a, int b, int c, int d)
    {
        int premio;
        if (a==0 && b==0 && c==0)
        {
            premio=5+d;
        }
        
        else if (a==1 && b==1 && c==1)
        {
            premio= 2+d;
        }
        
        else if (a==2 && b==2 && c==2)
        {
            premio=2*d;
        }
        
        else 
        {
            premio=0;
        }
        return premio;
    }
    
    public static boolean Seguir_jugant (int a)
    {
        boolean seguir= true;
        
        if (a<25 || a>0)
        {
            seguir= true;
        }
        
        else
        {
            seguir= false;
        }
        
        return seguir;
    }
    

}


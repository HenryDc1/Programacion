/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion_julia;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UF2Pr1Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double altura;
        double peso;
        
        altura = usuarioAltura (); //Llamo al metodo usuarioAltura
        peso = usuarioPeso (); //Llamo al metodo usuarioPeso
    
        boolean entrada_datos = datosCoherentes (altura, peso);
        
        if (entrada_datos==true)
        {
        
        double IMC = calculoIndiceIMC (altura, peso);
        
        System.out.println("La IMC es " + IMC);
        
        interpretarIndiceIMC (IMC);
        }
        
    }
    // Funcion que calcula el IMC
    public static double calculoIndiceIMC (double a, double b)
    {
        double altura= a*a;
        double IMC= (double) altura/b;
                
        return IMC;
    }
    
    //Funcion que recoge la altura del usuario por teclado
    public static double usuarioAltura ()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tu altura");
        double altura= sc.nextDouble();
        return altura;
    }
    
    
    //Funcion que recoge el peso del usuario por teclado
    public static double usuarioPeso ()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tu peso");
        double peso= sc.nextDouble();
        return peso;
    }
    
    public static void interpretarIndiceIMC (double a)
    {
        
        if (a<18.50)
        {
            System.out.println("Baix Pes");
        }
        
        else if (a>18.50 && a<24.99)
        {
            System.out.println("Normal");
        }
        
        else if (a>25.0)
        {
            System.out.println("Sobre Pes");
        }
    }
    
    public static boolean datosCoherentes(double a, double b)
    {
       
        boolean datos= true;
        
        if (a>2.75)
        {
            System.out.println("Error. La altura no puede superar los 2.75");
            datos = false;
        }
        
        if (b>635)
        {
            System.out.println("Error. El peso no puede superar los 635");
            datos = false;
        }
        return datos;
    }
}

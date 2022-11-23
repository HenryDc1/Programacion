/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author portatil
 */
public class Refractorizado {
//https://www.youtube.com/watch?v=xHZbOBztQ2k
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float b, h, perimetre;
        int option;
        System.out.println("Dona'm la base del rectangle");
        b=Float.parseFloat(br.readLine());
        System.out.println("Dona'm l'alçada del rectangle");
        h=Float.parseFloat(br.readLine());
        imprimirMenu();
        do{
            option=Integer.parseInt(br.readLine());
            
            switch(option){
                case 1:
                    System.out.println("\nCalculem area");
                    System.out.println(calculArea(b,h));
                    break;
                case 2:
                    System.out.println("\nCalculem perimetre");
                     System.out.println(calculPerimetre(b,h));
                    break;
                case 3:
                    imprimirMenu();
                    break;
                case 4:
                    System.out.println("Sortim del programa");
                    break;
            }
        }while(option!=4);
        
    }
    
    private static void imprimirMenu(){
         System.out.println("Què vols calcular?");
         System.out.println("1.-Area");
         System.out.println("2.-Perimetre");
         System.out.println("3.-Ajuda");
         System.out.println("4.-Sortir");   
    }
    
    private static void imprimirMenuFigura(){
         System.out.println("Sobre quina figura vols fer càlculs?");
         System.out.println("1.-Rectangle");
         System.out.println("2.-Triangle");
         System.out.println("3.-Cercle");
         System.out.println("4.-Sortir");   
    }
    
    private static float calculArea(float b, float h){
        return b*h;
        
    }
    private static float calculPerimetre(float b, float h){
        return 2*b+2*h;
        
    }
    
}

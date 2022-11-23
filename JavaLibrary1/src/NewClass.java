
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hedo0495
 */
    
public class NewClass {
  
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);{
        int numeros;
        int count_positive=0;
        int count_negative=0;
        do{
        System.out.println("Pon numeros, escribe 0 para terminar");
        numeros=entrada.nextInt();
        if (numeros>0)
        {
            ++count_positive;
        }
        else if (numeros<0
                ) 
        {
            count_negative++;
        }    
     
        }while (numeros!=0); 
        System.out.println("Escribiste 0 termino...");
        System.out.println("Positivos " + count_positive);
 }
 }
}



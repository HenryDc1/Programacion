package refactorizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * SinRefractorizar. Refracciona aquest programa seguint la guia del video. Cal:
 * -Canviar el Nom de la classe.
 * -El nom de la variable o1 per opcioMenu.
 * -Crear mètodes per a calcular l'àrea i el perímetre.
 * -Crear un mètode per imprimir el menu per pantalla. Invocar-lo en els llocs
 * que faci falta.
 * -Organitzar l'indentació del codi amb una dreçera
 * @author portatil
 */
public class SinRefractorizar {
//https://www.youtube.com/watch?v=xHZbOBztQ2k
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       BufferedReader br = 
                new BufferedReader( 
                        new InputStreamReader(System.in));
      
       float b, h, perimetre;
        int o1;
        System.out.println("Dona'm la base del rectangle");
        b=Float.parseFloat(br.readLine());
            System.out.println("Dona'm l'alçada del rectangle");
            h=Float.parseFloat(br.readLine());
        
                System.out.println("Què vols calcular?");
        System.out.println("1.-Area");
            System.out.println("2.-Perimetre");
        System.out.println( "3.-Ajuda");
                     System.out.println("4.-Sortir");
         
        do {
            
            o1=Integer.parseInt(br.readLine());
            
            switch(o1){
                case 1:
                    System.out.println("\nCalculem area");
                            System.out.println(b*h);
                    break;
                case 2:
                    System.out.println("\nCalculem perimetre");
                     System.out.println(2*b+2*h);
                    break;
                case 3:
                    System.out.println("Què vols calcular?");
                        System.out.println("1.-Area");
                            System.out.println("2.-Perimetre");
                    System.out.println("3.-Ajuda");
                        System.out.println("4.-Sortir");
                    break;
                case 4:
                        System.out.println("Sortim del programa");
                    break;
            }
        } while(o1!=4);
    }

}

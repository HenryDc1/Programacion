package sol_pt_funciones;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


/**
 * Joc del JackPot
 * @author Jose
 */
public class Ex01 {

    public static void main(String[] args) {
        //punts inicials
        int saldo = 10;
        do {
            //aposta
            int aposta = quantitatApostada(saldo);
            //tirar discs
            char d1 = tiradaDisc();
            char d2 = tiradaDisc();
            char d3 = tiradaDisc();
            //mostrar tirada
            mostrarTirada(d1, d2, d3);
            //calcular premi
            int premi = calcularPremi(d1, d2, d3, aposta);
            //acumular premi a saldo
            saldo += premi;
            System.out.println("Premi: "+premi+" Saldo: "+saldo);
        }while (seguirJugant(saldo));
        //partida finalitzada
        System.out.println("Partida finalitzada amb saldo: "+saldo);        
    }
    
    /**
     * demana al jugador quant vol apostar
     * @param saldo el saldo del jugador
     * @return l'aposta
     */
    private static int quantitatApostada(int saldo) {
        Scanner lector = new Scanner(System.in);
        int aposta = 0;
        boolean apostaValida;
        do {
                System.out.print("Aposta com a maxim " + saldo);
                aposta = lector.nextInt();
        } while (!((aposta>0) && (aposta<=saldo)));
        return aposta;
    }
    
    /**
     * genera una lletra aleatòria per a la tirada d'un disc
     * @return lletra aleatòria
     */
    private static char tiradaDisc() {
        
        Random rnd = new Random();
        int aleat = rnd.nextInt(3);
        if (aleat==0)
            {
                    return 'A';
            }
        else if (aleat==1)
            {
                    return 'B';
            }
        else
            {
                    return 'C';
            }
        //opció més complexa però correcta    
//        String lletres = "ABC";
//        return lletres.charAt(aleat);
    }
    
    /**
     * mostra la tirada dels 3 discos
     * @param c1 1r disc
     * @param c2 2n disc
     * @param c3 3r disc
     */
    private static void mostrarTirada(char c1, char c2, char c3) {
        System.out.println("**************");
        System.out.println("* " + c1 + " - " + c2 + " - " + c3);
        System.out.println("**************");
    }
    
    /**
     * calcula el premi
     * @param c1 1r disc
     * @param c2 2n disc
     * @param c3 3r disc
     * @param aposta quantitat apostada
     * @return el premi
     */
    private static int calcularPremi(char c1, char c2, char c3, int aposta) {
        int premi = 0;

        if ( (c1=='A' || c1 == 'a') && 
             (c2=='A' || c2 == 'a') && 
             (c3=='A' || c3 == 'a') ) {
            premi = 5 + aposta;
        }
        else if ( (c1=='B' || c1 == 'b') && 
             (c2=='B' || c2 == 'b') && 
             (c3=='B' || c3 == 'b') ) {
            premi = 2 + aposta;
        }
        else if ( (c1=='C' || c1 == 'c') && 
             (c2=='C' || c2 == 'c') && 
             (c3=='C' || c3 == 'c') ) 
         {
            premi = 2 * aposta;
        }
        return premi;
    }
    
    /**
     * determina si es continua jugant
     * @param saldo el saldo
     * @return true o false.
     */
    private static boolean seguirJugant(int saldo) {
        return (saldo<25) && (saldo>0);
    }
    
}

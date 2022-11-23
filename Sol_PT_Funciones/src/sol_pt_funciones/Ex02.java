package sol_pt_funciones;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calcula i informa de l'índex de massa corporal segons l'estatura i el pes
 * @author Jose
 */
public class Ex02 {

    public static void main(String[] args) {

        double estatura = 0.0;
        double pes = 0.0;

            estatura = preguntarAltura();
            pes = preguntarPes();


            double imc = calculIMC(estatura, pes);
            System.out.println("El teu índex de massa corporal es " + imc);
            String interpretacio = interpretarIMC(imc);
            System.out.println("El teu diagnòstic és: "+interpretacio);

    }
    


    /** Pregunta alçada que ha de ser positiva i no superior a 2,75

     */
    private static double preguntarAltura()
    {
        Scanner lector = new Scanner(System.in);
        double altura = 0;
        
        do {
                System.out.print("Fica alçada : ");
                altura = lector.nextDouble();
        } while(!altura>0 && (altura<=2,75));
        return altura;
    }

    /** Pregunta Pes que ha de ser positiva i no superior a 635

    */
    private static double preguntarPes()
    {
        Scanner lector = new Scanner(System.in);
        double pes = 0;
        
        do {
                System.out.print("Fica Pes : ");
                pes = lector.nextDouble();
        } while (!((pes>0) && (pes<=635)));
        return pes;
    }


    /**
     * calcula l'índex de massa corporal
     * @param estatura l'estatura
     * @param pes el pes
     * @return l'índex de massa corporal
     */
    private static double calculIMC(double estatura, double pes) {
        return (pes/(estatura*estatura));
    }
    
    /**
     * fa el diagnòstic segons l'imc
     * @param imc l'índex de massa corporal
     * @return el diagnòstic
     */
    private static String interpretarIMC(double imc) {

        //tambe podria ser void i ficar aquí el sout, és correcte.
        String diagnostic;
        if (imc < 18.5) {
            diagnostic = "baix pes";
        } else {
            if (imc >= 25) {
                diagnostic = "sobrepes";
            } else {
                diagnostic = "normal";
            }
        }
        return diagnostic;
    }
    
}

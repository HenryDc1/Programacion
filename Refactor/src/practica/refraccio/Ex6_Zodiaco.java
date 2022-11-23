package practica.refraccio;

import java.util.Scanner;

public class Ex6_Zodiaco {

    /**
     *  6) Obre la classe Ex6_Zodiaco i aplica les següents refraccions:
        1. Canvia el nom de la classe per Ex6_ZodiacoRefractorizado
        2. Canvia el nom de dues variables, les que vulguis.
        3. Converteix el número 31 i el número 12 en constants.
        4. Ubica el codi al voltant de la fase 3 en un mètode apart.
     */
    public static void main(String[] args) {
        //Fase uno (Coge los datos del usuario)
        System.out.println("Adivina tu signo del Zodiaco.");
        Scanner sc = new Scanner(System.in);
        boolean respuestasOK = true;
        
        System.out.println("¿Que dia naciste?(1-31)");
        int diaN = sc.nextInt();

        System.out.println("¿En que mes naciste?(1-12)");
        int mesN = sc.nextInt();

        //Fase dos (Verifica los datos del usuario)
        respuestasOK = diaN > 0 && diaN <= 31;
        respuestasOK = respuestasOK && mesN > 0 && mesN <= 12;

        System.out.println();
        String Signo="";
        if (respuestasOK) {
            //Fase tres (Calculando datos)
            System.out.println("Calculando");
            if (diaN >= 21 && mesN == 3 || diaN <= 20 && mesN == 4) {
                Signo="Aries";
            }

            if (diaN >= 21 && mesN == 4 || diaN <= 21 && mesN == 5) {
                Signo="Tauro";
            }

            if (diaN >= 22 && mesN == 5 || diaN <= 21 && mesN == 6) {
                Signo="Geminis";
            }

            if (diaN >= 21 && mesN == 6 || diaN <= 27 && mesN == 7) {
                Signo="Cancer";
            }

            if (diaN >= 24 && mesN == 7 || diaN <= 23 && mesN == 8) {
                Signo="Leo";
            }

            if (diaN >= 24 && mesN == 8 || diaN <= 23 && mesN == 9) {
                Signo="Virgo";
            }

            if (diaN >= 24 && mesN == 9 || diaN <= 23 && mesN == 10) {
                Signo="Libra";
            }

            if (diaN >= 24 && mesN == 10 || diaN <= 22 && mesN == 11) {
                Signo="Escorpio";
            }

            if (diaN >= 23 && mesN == 11 || diaN <= 21 && mesN == 12) {
                Signo="Sagitario";
            }

            if (diaN >= 22 && mesN == 11 || diaN <= 20 && mesN == 1) {
                Signo="Capricornio";
            }

            if (diaN >= 21 && mesN == 1 || diaN <= 19 && mesN == 2) {
                Signo="Acuario";
            }

            if (diaN >= 20 && mesN == 2 || diaN <= 20 && mesN == 3) {
                Signo="Picis";
            } 
            //Fin fase tres (Calculando datos)

            //Fase cuatro, mostrar resultado.
            System.out.println("Tu signo es " + Signo);
        } else {
            System.out.println("El mes o el dia no son correctos.");
        }
    }
}

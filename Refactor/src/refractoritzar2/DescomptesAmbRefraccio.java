package refractoritzar2;

import java.io.IOException;
import java.util.Scanner;

/**
 * DescomptesSenseRefraccio. Un programa que llegeix el preu i l'edat de
 * clients. Aplica un descompte de 20% a menors de 25 i 30% a majors de 55. Cal:
 * - Crear constant per l'IVA. - Crear variables pels descomptes. - Posa la
 * lectura de preu i edad en mètodes apart. - Canviar el nom de la variable p
 * per preu i e per edat.
 *
 * @author portatil
 */
public class DescomptesAmbRefraccio {

    public static void main(String[] args) throws IOException {

        final double descMenor25 = 0.2;
        final double descompteMajor65 = 0.3;

        double preu, total;
        int edat;

        Scanner sc = new Scanner(System.in);
        preu = legeixPreu(sc);
        edat = llegeixEdat(sc);
        if (edat <= 25) {
            preu = preu - (preu * descMenor25);
        }
        if (preu >= 65) {
            preu = preu - (preu * descompteMajor65);
        }

        total = preu + (preu * 0.21);

        System.out.println("El precio total es: " + total);
    }

    private static int llegeixEdat(Scanner sc) {
        int edat;
        System.out.print("Dime tu edad (descuento menores 25 y mayores 65)");
        edat = sc.nextInt();
        return edat;
    }

    private static double legeixPreu(Scanner sc) {
        double preu;
        System.out.print("Dime el precio: ");
        preu = sc.nextDouble();
        return preu;
    }
}

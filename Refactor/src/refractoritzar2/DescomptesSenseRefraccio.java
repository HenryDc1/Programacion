package refractoritzar2;

import refactorizar.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * DescomptesSenseRefraccio. 
 * Un programa que llegeix el preu i l'edat de clients.
 * Aplica un descompte de 20% a menors de 25 i 30% a majors de 55.
 * Cal:
 * - Crear constant per l'IVA.
 * - Crear variables pels descomptes.
 * - Posa la lectura de preu i edad en un mètode apart.
 * - Canviar el nom de la variable p per preu i e per edat.
 * @author portatil
 */
public class DescomptesSenseRefraccio {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double p, total;
        int e;
        
        System.out.print("Dime el precio: ");
        p = sc.nextDouble();
        System.out.print("Dime tu edad (descuento menores 25 y mayores 65)");
        e = sc.nextInt();
        if (e<=25)
            p = p - (p*0.2);
        if(p>=65)
            p = p - (p*0.3);
        
        total = p + (p*0.21);
        
        System.out.println("El precio total es: "+total);
    }
}

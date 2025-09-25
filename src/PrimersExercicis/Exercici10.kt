// Llegeix el diàmetre d'una pizza rodona i imprimeix la seva superfície. Pots usar Math.PI per escriure el valor de Pi.

import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);
    println("Escriu el valor del diàmetre de la pizza: ")

   // Es calcula el diàmetre dividint-lo per 2.
    var diametre : Double = (scan.nextDouble())/2;

    // Es calcula la superificie amb la formula "PI*r elevat a 2".
    var superificie : Double = Math.PI * (diametre*diametre);

    println("La superificie de la pizza es: "+superificie)

    scan.close();
}
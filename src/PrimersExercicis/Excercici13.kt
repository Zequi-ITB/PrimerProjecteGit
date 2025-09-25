//  Escriu un programa que llegeixi un una temperatura i un augment d’aquest, el programa ha d’imprimir per pantalla quina és la
//temperatura amb l’augment aplicat.

import java.util.Scanner
import java.util.Locale

fun main() {
    var scan : Scanner = Scanner(System.`in`).useLocale(Locale.UK);

    //Demanem les dades
    println("Ingressa la temperatura actual: ")
    var tempActual : Double = scan.nextDouble();
    println("Ingressa l'augment de temperatura: ");
    var tempAugment : Double = scan.nextDouble();

//Fem el calcul de la temperatura.
    var temp : Double = tempActual+tempAugment;

    println("La temperatura actual és "+temp+"º")

    scan.close();

}
//Fes un programa on, introduit el número de començals i el preu d'un sopar (que pot contenir cèntims), imprimeixi quan haurà de
//pagar cada començal.

import java.util.Scanner
import java.util.Locale

fun main() {
    var scan : Scanner = Scanner(System.`in`).useLocale(Locale.UK);

    //Demanem les dades.
    println("Ingressa el preu total del sopar: ")
    var preuSopar : Double = scan.nextDouble();
    println("Ingressa el total de començals: ")
    var comensals : Double = scan.nextDouble();

    // Fem el càlcul final.
    var resultat : Double = preuSopar/comensals;

    println("El que ha de pagar cada començal es " + resultat+"€.")

    scan.close();
}
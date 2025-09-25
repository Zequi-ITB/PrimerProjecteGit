//Fes un programa que afegeixi 1 segon un nombre de segons determinat.

import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);

    //Demanem les dades.
    println("Ingressa una quantitat de segons: ")
    var segons : Int = scan.nextInt();
    var resultat : Int;

    // Posem un condidicional per especificar que la suma "+1" s'ha de fer només quan el número és inferior a 59.
// En cas de ser major o igual a 59, el resultat sera "0", com posa l'exemple de l'exercici.
    if (segons<59) {
        resultat = segons + 1;
    }

    else {
        resultat = 0;
    }

    println("Segons: "+resultat);

    scan.close();
}
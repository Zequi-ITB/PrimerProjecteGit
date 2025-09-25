//Fes un programa que rebi dos nombres decimals i torni si són iguals o no

import java.util.Scanner
import java.util.Locale

fun main() {
    var scan = Scanner(System.`in`).useLocale(Locale.UK);

    println("Ingressa dos números decimals: ");
    var num1 = scan.nextDouble();
    var num2 = scan.nextDouble();
    var iguals : Boolean = false;

    // Fem la comparació i modifiquem el boolean si son iguals.

    if (num1 == num2) {
        iguals = true;
    }

    println(iguals);

    scan.close();


}

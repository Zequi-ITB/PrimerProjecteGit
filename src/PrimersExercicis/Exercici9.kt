//Llegeix el preu original i el preu actual i imprimeix el descompte (en %).

import java.util.Locale
import java.util.Scanner

fun main() {
var scan : Scanner = Scanner(System.`in`).useLocale(Locale.UK);
    var percentatge : Float;

    //Es demanen les dades en Float.

    println("Ingressa el preu original: ");
    var preuOriginal : Float = scan.nextFloat();
    println("Ingressa el preu actual: ");
    var preuActual : Float = scan.nextFloat();

    // Es fa una regla de 3 simple per calcular el percentatge de descompte.

    percentatge = ((preuOriginal-preuActual)/preuOriginal)*100;

    println("El descompte es de: "+percentatge+" %.");

    scan.close();



}
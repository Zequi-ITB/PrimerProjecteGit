//Llegeix un valor amb decimals i imprimeix el doble.

import java.util.Scanner
import java.util.Locale

fun main() {

    // Utilitzem "useLocale" per indicar-li al IDE que llegeixi el "." del teclat com una coma de decimal.
    var scan : Scanner = Scanner(System.`in`).useLocale(Locale.UK);

    // Especifiquem el tipus de variable, en aquest cas, tipus float perquè pugui ser decimal.
    println("Ingressa un número amb decimals: ")
    var numero : Float = scan.nextFloat();

    // Fem la operació.
    println("El doble de "+numero+" es : "+(numero*2));

    scan.close();
}
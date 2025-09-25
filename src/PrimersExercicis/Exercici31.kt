//Fes un programa que calculi l'equivalent en peus una longitud en metres.
//Tingues en compte que:
//1 metre = 39,37 polzades
//12 polzades = 1 peu

import java.util.Scanner
import java.util.Locale

fun main() {
    var scan = Scanner(System.`in`).useLocale(Locale.UK);

    println("Ingressa una longitud en metres: ");
    var metres = scan.nextDouble();

    var polzades : Double= metres*39.37;
    var peus : Double = polzades/12;

    println("Son: "+peus+" peus.")

    scan.close();



}
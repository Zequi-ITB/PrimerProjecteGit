//Per poder fer un estudi de la ventilació d'una aula necessitem poder calcular la quantitat d'aire que hi cap en una habitació.
//Llegeix les 3 dimensions de l'aula i imprimeix per pantalla quin volum té.

import java.util.Locale
import java.util.Scanner

fun main() {
var scan : Scanner = Scanner(System.`in`).useLocale(Locale.UK);

    // Ingressem les dades.
    println("Ingressa l'amplada de l'habitació: ")
    var amplada : Double = scan.nextDouble();
    println("Ingressa la llargada de l'habitació: ")
    var llargada : Double = scan.nextDouble();
    println("Ingressa l'alçada de l'habitació: ")
    var alsada : Double = scan.nextDouble();

    // Fem el calcul del volum.
    var volumAire : Double = amplada * alsada * llargada;

    println("El volum d'aire que hi cap a l'habitacio es: "+volumAire);

    scan.close();



}
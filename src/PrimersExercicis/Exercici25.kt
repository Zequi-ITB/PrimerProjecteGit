//Fes un programa que rebi un caràcter de l’abecedari en minúscula i el faci majúscula.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    //Ingressem les dades i utilitzem "uppercase()" per passar a majúscula.
    println("Ingressa una lletra en minúscula: ")
    var caracter = scan.nextLine().uppercase();

    println(caracter);

    scan.close()

}
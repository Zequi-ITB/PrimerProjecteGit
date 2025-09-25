//Fes un programa que rebi dos nombres enters i imprimeixi true si el primer és major que el segon, false en cap altre cas.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    println("Ingressa dos números enters: ")
    var num1 = scan.nextInt();
    var num2 = scan.nextInt();

    if (num1 > num2)
        println("True");

    else
        println("False");

    scan.close();
}
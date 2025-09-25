//L'usuari escriu 4 enters i s'imprimeix el valor de sumar el primer amb el segon, multiplicat per el mòdul del tercer amb el quart.

import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);

    //L'usuari ingressa les dades i es guarden a les variables.

    println("Ingressa 4 números enters: ")
    var num1 : Int = scan.nextInt();
    var num2 : Int = scan.nextInt();
    var num3 : Int = scan.nextInt();
    var num4 : Int = scan.nextInt();

    //Ara es fan les operacions dins del println.

    println((num1+num2)*(num3%num4));

    scan.close();
}


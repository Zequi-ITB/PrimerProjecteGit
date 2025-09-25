//Fes un programa que afegeixi donat un nombre enter, imprimeixi el mateix número en decimal

import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);

    // Demanem les dades.
    println("Ingressa un número enter: ");
    var num : Int = scan.nextInt();

    // Aqui fem la conversió a Double amb ".toDouble"
    println("El número es "+num.toDouble())

    scan.close();
}
//Fes un programa que rebi un valor booleà i et retorni el valor contrari

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    println("Escriu true o false: ");
    var entrada = scan.nextBoolean();


    // Fem la inversio del valor boolean amb "!".

    entrada = !entrada;

    println(entrada)

    scan.close();
}
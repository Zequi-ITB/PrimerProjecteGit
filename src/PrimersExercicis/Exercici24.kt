//Fes un programa que rebi un caràcter i digui si és un nombre o no.

import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);

    //Demanem les dades
    println("Ingressa un carácter: ")
    var caracter : Char = scan.next().single()  // Utilitzem el .single() per que llegeixi només un caràcter.
    var esUnNumero : Boolean = false;

    // Posem el condicional if per saber si està entre 0 i 9 i, per tant, saber si és un número.
    if (caracter >= '0' && caracter <= '9') {
        esUnNumero = true;

    }

    println(esUnNumero)

    scan.close();



}


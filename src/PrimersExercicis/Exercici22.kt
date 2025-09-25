//Fes un programa que rebi el valor del nivell de riure de 5 persones i comprovi si la dita és certa.

import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);


// Demanem les dades al usuari.
    println("Ingressa el nivell de riure de 5 persones: ")
    var maxNivell : Boolean = false;
    var numMax : Int = 0;
    var cont : Int = 1;


    // Fem un bucle "While" per utilitzar la mateixa variable i demanar 5 números, utilitzem "cont" per definir les voltes del nostre bucle.
    // Resetiem el boolean a "false" cada vegada que tornem a demanar el numero, per asegurarnos que nomes sigui l'ultima volta la que posi "true"

    while (cont<=5) {
        var nivell = scan.nextInt();
        cont ++;
        maxNivell = false;

        // Fem un condicional "If" per comparar el número mes alt fins ara i el número actual

        if (nivell > numMax) {
            maxNivell = true;
            numMax = nivell;


        }

    }

    println(maxNivell);

    scan.close();
}
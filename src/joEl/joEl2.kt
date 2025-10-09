// Muchas personas tienen miedo de las serpientes por la forma en que se mueven, haciendo zigzags imprevisibles.
// ¡Otras personas encuentran las matemáticas igualmente terroríficas!
//En este ejercicio, combinaremos ambas cosas para crear una "serpiente matemática".

//Debe mostrarse N filas x N columnas con los números pares del 2
// al 2N2
//, ordenados de modo que las filas se comporten como una serpiente:
//Las filas impares (1a, 3a, 5a, ...) deben colocar los números en orden creciente de izquierda a derecha.
//Las filas pares (2a, 4a, 6a, ...) deben colocar los números en orden decreciente, de derecha a izquierda.

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`);

    // Demanem les dades.
    var num: Int = scan.nextInt();

    var sumaNumero: Int = num;
    var filaStringAsc: String = "";
    var filaStringDesc: String = "";
    var filaString: String = ""
//sdas
    // Fem el problema
    repeat(num) {

repeat(num) {
    for (i in 2..num step 2) {
        filaStringAsc += i.toString() + " ";
    }
}

        for (i in (num * 2) downTo num step 2) {
            filaStringDesc += i.toString() + " ";

        }
        num += num * 2

        println(filaStringAsc)
        println(filaStringDesc)

    }


}


// Imprimim el resultat.


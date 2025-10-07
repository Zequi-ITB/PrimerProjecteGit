package joEl

// Et proposem un petit repte. Donat un número enter positiu N, suma per separat els números parells i els números senars entre 1 i N (inclós).
//Es mostrarà un missatge indicant la suma dels nombres parells i la suma dels senars. El missatge tindrà el següent format: PARELLS: xxx SENARS: xxx

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`);

    // Demanem les voltes

    var voltes: Int = scan.nextInt();
    var sumaSenars: Int = 0;
    var sumaParell: Int = 0;


    // Fem el bucle per sumar els parells i senars.
    repeat(voltes) {
        var num: Int = scan.nextInt();

        // Comprovem si és parell o senar.
        for (i in 1..num) {
            if (i % 2 == 0) {
                sumaParell += i;
            } else {
                sumaSenars += i;
            }

        }
        println("PARELLS: $sumaParell SENARS: $sumaSenars")
    }
    //Imprimim el resultat.


    scan.close();

}



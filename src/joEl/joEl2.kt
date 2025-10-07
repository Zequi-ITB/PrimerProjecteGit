package joEl

// Et proposem un petit repte. Donat un número enter positiu N, suma per separat els números parells i els números senars entre 1 i N (inclós).
//Es mostrarà un missatge indicant la suma dels nombres parells i la suma dels senars. El missatge tindrà el següent format: PARELLS: xxx SENARS: xxx

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`);

    // Demanem les voltes

    var voltes: Int = scan.nextInt();
    var cont: Int = 0;
    var sumaSenars: Int = 1;
    var sumaParell: Int = 0;
    var contParell: Int = 2;
    var parellActual: Int = 0;


    // Fem el bucle per sumar els parells i senars.
    while (voltes < cont) {
        var num: Int = scan.nextInt();
        sumaParell = num;
        parellActual = num;

        cont++;
        while (sumaParell <= num) {
            parellActual = parellActual - 2;
            sumaParell = sumaParell + (parellActual)
            contParell = contParell + 2;

        }
        while (sumaSenars <= (num - 1)) {
            sumaSenars + 2;
        }


    }
    println("PARELLS: $sumaParell SENARS: $sumaSenars")


    scan.close();

}

// Imprimim el resultat.



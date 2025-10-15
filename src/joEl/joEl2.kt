import java.util.Scanner

// A Bambino li agrada jugar a cartes i l’Egipte dels faraons, ... i per això, de tant en tant, li dona per fer piràmides de cartes.
// Les piràmides són com la de la foto.

//Per cada cas de prova, caldrà respondre, en una línia amb dos valors:
//Alçada de la piràmide de cartes que es pot aconseguir
//Número de cartes que sobren (és a dir, les cartes que no es poden posar perquè no arriben a completar un nivell (residu).

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos
    var casos: Int = scan.nextInt();

    // Demanem la quantitat de cartes
    repeat(casos) {
        var cartes: Int = scan.nextInt();
        var sumaCartes: Int = 0;
        var contador: Int = 0
        var cartesSobrants: Int = 0;
        var iteracioActual: Int = 0;

        // Multipliquem n per 2 + n-1 que es la formula per calcular cada pis de la torre.
        while (sumaCartes < cartes) {
            contador++;
            sumaCartes += (contador * 2) + (contador - 1);

            // Guardem la ultima iteracio mentre la suma sigui menor al total de cartes.
            if (sumaCartes < cartes) {
                iteracioActual = sumaCartes;

                // Fem el calcul de les cartes sobrants un cop la suma ha superat al total de cartes.
            } else
                if (sumaCartes > cartes) {
                    cartesSobrants = cartes - iteracioActual
                    contador--;
                }
        }

        // Imprimim el resultat
        println("$contador $cartesSobrants")
    }


    scan.close()
}


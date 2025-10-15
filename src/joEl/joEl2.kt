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

    // Demanem la quantitat de cartes dins del bucle
    repeat(casos) {
        var cartes: Int = scan.nextInt();
        var sumaCartes: Int = 0;
        var contador: Int = 1
        var cartesSobrants: Int = 0;

        if (cartes >= 2) {
            if (cartes % 2 == 0) {
                while (sumaCartes < cartes) {
                    sumaCartes += contador * 2 + (contador - 1);

                    if (cartes - sumaCartes > 0)
                        contador++;
                }
            } else {
                while (sumaCartes < cartes) {
                    sumaCartes += contador * 2 + (contador - 1);
                    if (cartes < sumaCartes) {
                        cartesSobrants = sumaCartes - cartes
                    }

                }

            }
        }
        println("$contador $cartesSobrants")


        // Fem un calcul multiplicant n*2 cada pis i sumant n-1

        // Comprovem si es pot fer un pis mes i seguim al bucle o mirem si hi ha sobrants. (si es parell, vol dir que no sobraran.

        // Imprimim el resultat.

    }
    scan.close()
}


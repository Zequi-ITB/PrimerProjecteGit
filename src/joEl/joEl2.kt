// Imagina't que estàs organitzant una competició en què els participants han de realitzar diverses proves.
// Cada prova dóna un cert nombre de punts a cada participant, però aquest nombre de punts pot ser variable depenent de les condicions de la competició.
// El teu objectiu és calcular la puntuació total de cada participant a partir dels resultats obtinguts en les proves.
//Se't dóna una llista amb les puntuacions obtingudes pels participants en diverses proves.
// Cada participant té una puntuació per cada prova, i tu has de calcular la puntuació total per cada participant.
// La puntuació total es calcula com la suma de les puntuacions de totes les proves en què ha participat.
// El teu objectiu és imprimir la puntuació total de tots els participants.
// Per exemple, si tenim 3 participants i 4 proves, el teu programa ha de sumar les puntuacions de cada participant i mostrar-les a l’usuari.

//L'output ha de ser una línia per a cada participant amb la seva puntuació total.

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`);

    // Demanem les dades.
    var participants: Int = scan.nextInt();
    var proves: Int = scan.nextInt();
    var sumaPunts: Int = 0;

    // Fem un bucle repeat per la quantitat de participant i dins un altre bucle  amb la quantitat de proves que volem sumar.
    repeat(participants) {
        sumaPunts = 0;
        repeat(proves) {
            var puntuacio: Int = scan.nextInt();
            sumaPunts += puntuacio;
        }
        // Imprimim el resultat de cada participant en cada passada.
        println(sumaPunts)
    }

    scan.close();
}




import java.util.Scanner

// Quan Bambino va sortir amb el seu primer ex, l'ex tenia 18 anys.
// Bambino va dir "mai més ningú de 18 anys" El segón ex de bambino tenia 29.
// Bambino va dir "mai més ningú de 29 anys" El tercer tenia 26. Bambino... sí, ja us ho imagineu.

//Per cada cas de prova s'ha de dir SI si l'interés no té l'edat dels exs de bambino i NO en cas contrari.

fun main() {
    val SCAN: Scanner = Scanner(System.`in`);

    // Demanem les dades.
    // Evito utilitzar la paraula "ex" per les variables, ja que em surten moltes paraules clau de kotlin que comencen amb "ex"
    var parellaBambino1: Int = SCAN.nextInt();
    var parellaBambino2: Int = SCAN.nextInt();
    var parellaBambino3: Int = SCAN.nextInt();
    var interesActual: Int = SCAN.nextInt();
    var repeteix: Boolean = false;

    // Comparem l'edat dels ex de Bambino amb el seu últim interès
    when (interesActual) {
        parellaBambino1 -> repeteix = true;
        parellaBambino2 -> repeteix = true;
        parellaBambino3 -> repeteix = true
        else -> repeteix = false
    }

    // Imprimim el resultat
    if (repeteix) {
        println("NO")
    } else {
        println("SI")
    }


    SCAN.close()
}



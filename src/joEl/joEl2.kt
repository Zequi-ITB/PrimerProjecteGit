import java.util.Scanner

// Murcielago es una de les poques paraules que tenen totes les vocals. saps alguna més?
//El programa escriurà “TOTES” si durant la frase han aparegut totes les vocals, i “FALTEN” si falta alguna vocal.

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la paraula.
    var paraula: String = scan.nextLine();

    var teVocalA: Boolean = false;
    var teVocalE: Boolean = false;
    var teVocalI: Boolean = false;
    var teVocalO: Boolean = false;
    var teVocalU: Boolean = false;
    var teVocals: Boolean = false;

// Fem una iteracio de cada lletra de la paraula i comprovem si estan totes les vocals.
    for (i in 0..paraula.length - 1) {
        when (paraula.get(i)) {
            'a' -> teVocalA = true;
            'e' -> teVocalE = true;
            'i' -> teVocalI = true;
            'o' -> teVocalO = true;
            'u' -> teVocalU = true;
        }

        if (teVocalA && teVocalE && teVocalI && teVocalU && teVocalO)
            teVocals = true;

    }

    //Imprimim  el resultat
    if (teVocals) {
        println("TOTES")
    } else {
        println("FALTEN")
    }

    scan.close()
}


package JoEl

import java.util.Scanner
import kotlin.math.absoluteValue

//A vegades a la vida vols saber qui ha guanyat. A vegades qui ha perdut. I a vegades vols veure com de pallissa ha estat el resultat

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem les dades
    var jugador1: Int = scan.nextInt();
    var jugador2: Int = scan.nextInt();
    var eleccioJugador1 : String = "";
    var eleccioJugador2 : String = "";

// Comprovem si es entre 1 y 3.

    if (jugador1 > 3 || jugador2 > 3) {
        println("ERROR")
    }

    //Comparem les eleccions per saber quina opcio han triat.
    when (jugador1) {
        1 -> eleccioJugador1 = "pedra"
        2 -> eleccioJugador1 = "paper"
        3 -> eleccioJugador1 = "tisora"
    }

    when (jugador2) {
        1 -> eleccioJugador2 = "pedra"
        2 -> eleccioJugador2 = "paper"
        3 -> eleccioJugador2 = "tisora"
    }

    if (eleccioJugador1 == "pedra" && eleccioJugador2 == "pedra"){
        println("EMPAT")
    }

}




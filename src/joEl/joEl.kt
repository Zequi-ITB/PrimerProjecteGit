import java.util.Scanner

// En tots els jocs a on hi ha un teclat hi ha un menú per fer varies coses, en que pots seleccionar varies opcions, i cada tecla farà una cosa diferent.
//Demana amb Scanner una tecla i fes un switch a on cada opció representi una acció, segons aquesta taula. Torna l’opció escollida per pantalla.

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem les dades en Char i llegim només el primer caracter.
    var eleccio: String = scan.next();

    // Comprovem quina opció ha triat l'usuari i imprimim el resultat.
    when (eleccio) {
        "Q" -> println("Skill 1");
        "W" -> println("Skill 2");
        "E" -> println("Skill 3");
        "R" -> println("Ultimate");
        "B" -> println("Recall")
        "D" -> println("Bronzes never use summoners")
        "F" -> println("Bronzes never use summoners")
        else -> println("ERROR")
    }


    scan.close()
}



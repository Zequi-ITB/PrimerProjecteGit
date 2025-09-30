package JoEl

import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);

    //Demanem les dades
    var metres : Double = scan.nextDouble();
    var euros : Double = 0.0;

    // Fem les comprovacions amb un "When"
    when(metres){
        in 0.0..25.0 -> euros = 3.0;
        in 25.1..75.0 -> euros = 4.0;
        else -> euros = 5.0

    }
    // Fem el càlcul
    var resultat : Double = euros*metres;

    // Imprimim el resultat.
    println(""+metres +"m: "+resultat+" euros")

}
package joEl
//La millor dècada és la dels 90. La gent que no hagi nascut als 90... pobres.
// De fet, totes les dècades dels 90 són bones. 1890 va ser una bona decada i 2090 també ho serà.

//Per cada cas de prova s'ha de dir SI si acaba amb nombres del 90 al 99 i NO en cas contrari.

import java.util.Scanner

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem les dades.
    var any: Int = scan.nextInt();
    var xifres: Int = 0;

    // Convertim el numero en String i el guardem en una variable.
    var anyCadena: String = any.toString();

    // Guardem en la variable només la penultima xifra.
    // Utilitzem ".substring" per seleccionar només la penultima xifra.
    anyCadena = anyCadena.substring(anyCadena.length - 2, anyCadena.length - 1)

    // Comprovem si la penultima xifra es 9 i imprimim el resultat
    if (anyCadena == "9") {
        println("SI")
    } else {
        println("NO")
    }

    scan.close();
}
import java.util.Scanner

//Arnau va el 16 a veure la peli de Spiderman. Això significa que es perdrà una hora de classe

//s'ha de dir la classe que està immediatament a sobre de SPIDERMAN, que és la classe que es perdrà. Si SPIDERMAN
// està a primera hora i no es perd cap classe, es dirà NO

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem les dimensions i el tamanys de la matriu.
    var dimensions: Int = scan.nextInt()
    var tamany: Int = scan.nextInt()
    scan.nextLine()

    // Creem la matriu, i afeigim les llistes amb un bucle. 
    var matriu: MutableList<MutableList<String>> = mutableListOf()

    // Demanem el contingut dels elements i els guardem a les llistas.
    repeat(dimensions) {
        var llistatDeClasses: MutableList<String> = MutableList<String>(tamany) { scan.next() }
        matriu += mutableListOf(llistatDeClasses)
    }

    // Definim variables per guardar la posicio on trobem "SPIDERMAN"
    var filaSpiderman: Int = 0
    var columnaSpiderman: Int = 0

    // Fem una iteracio per les llistes de la matriu per trobar "spiderman" i guardem la seva posicio
    for (i in matriu.indices) {

        if ("SPIDERMAN" in matriu[i]) {
            filaSpiderman = i
            // Fem un indexOf per saber la columna en la que es troba.
            columnaSpiderman = matriu[i].indexOf("SPIDERMAN")

            // Si Spiderman es troba a la primera hora, no es perd classe per tant imprimim "NO"
            if (filaSpiderman == 0) {
                println("NO")

                // Si no es a primera hora, restem 1 a la fila per imprimim l'element que esta just a dalt de Spiderman.
            } else {
                println(matriu[filaSpiderman - 1][columnaSpiderman])
            }
        }
    }

    scan.close()
}
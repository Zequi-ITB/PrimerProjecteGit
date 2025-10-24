import java.util.Scanner

// Sempre tens un amic pesat que et diu "Te'n recordes de...".
// Jo no perquè soc una aplicació web, però Marc me n'ha parlat. Clar que Marc potser tampoc té amics si li parla a una aplicació web.

//Per cada cas de prova es vol retornar el nombre que ocupava la posició P
// en la llista de nombres. Considereu que la primera posició és 0.

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem els casos a considerar
    var casos: Int = scan.nextInt();

    // Fem un bucle amb la quantitat de casos i demanem el tamany de l'array.
    repeat(casos) {
        var tamanyArray: Int = scan.nextInt();

        // Declarem variables per portar el control del que te la major quantitat de vots.
        var votsGuanyador: Int = 0;
        var guanyador: Int = 0;

        // Creem l'array i demanem el per entrada els valors dels elements.
        var llistatDeVots: Array<Int> = Array(tamanyArray) { scan.nextInt() }

        // Fem un bucle per iterar entre els valors de l'array i comparem quin es el mes gran.
        for (i in llistatDeVots.indices) {
            if (llistatDeVots[i] > votsGuanyador) {
                votsGuanyador = llistatDeVots[i]
                guanyador = i + 1;
            }
        }
        // Imprimim el resultat del guanyador.
        println(guanyador)
    }
    scan.close()
}


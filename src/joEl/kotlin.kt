import java.util.Scanner

// Al congrés de la patata s’ha arribat a la ronda final de votacions entre “Lluís” i “patata”.
// Lamentablement entre totes les eminencies científiques ninguna sap quan un número es més gran que l’altre. SALVA LA DEMOCRÀCIA

//Per cada cas de prova caldrà respondre: El nombre corresponent a l’opció guanyadora
fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem els casos a considerar
    var casos: Int = scan.nextInt();

    // Fem un bucle amb la quantitat de casos i demanem el tamany de l'array.
    repeat(casos) {
        var tamanyArray: Int = scan.nextInt();

        var votsGuanyador: Int = 0;

        // Creem l'array i demanem el per entrada els valors dels elements.
        var llistatDeVots: Array<Int> = Array(tamanyArray) { scan.nextInt() }

        // Fem un bucle per iterar entre els valors de l'array i comparem quin es el mes gran.
        for (i in 1..llistatDeVots.size) {
            if (llistatDeVots[i] > votsGuanyador) {
                votsGuanyador = llistatDeVots[i]
            }
        }
        println(llistatDeVots)
    }


    // Comparem qui ha guanyat i imprimim el resultat.
    scan.close()
}

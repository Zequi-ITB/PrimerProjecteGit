import java.util.Scanner

//Fes un programa que llegeixi una frase. La sortida ens diu la quantitat de vegades que apareix cada vocal (tant majúscula com minúscula).
//Per cada cas de prova caldrà respondre: A: xxx E: xxx I: xxx O: xxx U: xxx

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos a evaluar.
    var casos: Int = scan.nextInt();
    scan.nextLine();

    // Demanem les dades a evaluar.
    repeat(casos) {
        var frase: String = scan.nextLine().lowercase();

        // Declarem variables per comptabilitzar la quantitat de cadascuna de les vocals que hi ha a la frase.
        var vocalA: Int = 0
        var vocalE: Int = 0
        var vocalI: Int = 0
        var vocalO: Int = 0
        var vocalU: Int = 0

        // Fem un bucle "for" per fer una iteracio de cada posicio de la frase i amb un "when" comprovar quantas vocals hi ha de cadascuna
        for (i in 0..frase.length - 1) {
            when (frase.get(i)) {
                'a' -> vocalA++
                'e' -> vocalE++
                'i' -> vocalI++
                'o' -> vocalO++
                'u' -> vocalU++;
            }
        }
        // Imprimim el resultat.
        println("A: $vocalA E: $vocalE I: $vocalI O: $vocalO U: $vocalU")
    }

    scan.close()
}
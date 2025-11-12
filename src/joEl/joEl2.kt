import java.util.Scanner

//El tres en raya pero con gatos.

//La primera línia indica els casos de prova a considerar. Cada cas tindrà dues línies, la primera tindrà el nombre de files (F)
// i la segona el nombre de columnes (C), seguit de una matriu F*C amb una serie de nombres que seràn 1 (gat) o 0 (res).
// (Els gats utilitzats en una ratlla no poden utilitzar-se per formar una altre).
//Per a cada cas hauràs de donar la quantitat de línies que es poden formar amb els gats de la matriu, en format de un nombre únic.

fun main() {
    val scan: Scanner = Scanner(System.`in`)

    // Demanem la quantitat de casos
    var casos: Int = scan.nextInt()

    // Fem un bucle amb la quantitat de casos
    repeat(casos) {

        // Demanem les dimensions i el tamanys de la matriu.
        var dimensions: Int = scan.nextInt()
        var tamany: Int = scan.nextInt()

        // Creem la matriu, i afeigim les llistes amb un bucle.
        var matriu: MutableList<MutableList<Int>> = mutableListOf()

        // Demanem el contingut dels elements i els guardem a les llistas.
        repeat(dimensions) {
            var llistatDeGats: MutableList<Int> = MutableList<Int>(tamany) { scan.nextInt() }
            matriu.add(llistatDeGats)
        }

        // Definim variables per calcular la quantitat de lineas que es podem omplir amb els gats
        var quantitatFilas: Int = 0

        // Fem una iteracio per comprovar tots els elements de la llista de la matriu
        for (i in matriu.indices) {

            for (posicio in matriu[i].indices) {

                //Comprovem en horizontal i quan trobem un tres en ratlla eliminem els gats
                if (posicio <= dimensions - 3) {
                    if (matriu[i][posicio] == 1 && matriu[i][posicio + 1] == 1 && matriu[i][posicio + 2] == 1) {
                        quantitatFilas++
                        matriu[i][posicio] = 0
                        matriu[i][posicio + 1] = 0
                        matriu[i][posicio + 2] = 0
                    }
                }

                //Comprovem en vertical
                if (i <= dimensions - 3) {
                    if (matriu[i][posicio] == 1 && matriu[i + 1][posicio] == 1 && matriu[i + 2][posicio] == 1) {
                        matriu[i][posicio] = 0
                        matriu[i + 1][posicio] = 0
                        matriu[i + 2][posicio] = 0
                        quantitatFilas++
                    }
                }
                //Comprovem la primera diagonal
                if (i <= dimensions - 3 && posicio <= tamany - 3) {
                    if (matriu[i][posicio] == 1 && matriu[i + 1][posicio + 1] == 1 && matriu[i + 2][posicio + 2] == 1) {
                        matriu[i][posicio] = 0
                        matriu[i + 1][posicio + 1] = 0
                        matriu[i + 2][posicio + 2] = 0
                        quantitatFilas++
                    }
                }
                //Comprovem la segona diagonal
                if (i <= dimensions - 3 && posicio >= 2) {
                    if (matriu[i][posicio] == 1 && matriu[i + 1][posicio - 1] == 1 && matriu[i + 2][posicio - 2] == 1) {
                        matriu[i][posicio] = 0
                        matriu[i + 1][posicio - 1] = 0
                        matriu[i + 2][posicio - 2] = 0
                        quantitatFilas++
                    }
                }
            }
        }
        // Imprimim el resultat.
        println(quantitatFilas)
    }
    scan.close()
}
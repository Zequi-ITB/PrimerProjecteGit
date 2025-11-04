import java.util.Scanner


fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos de prova a evaluar
    var casos: Int = scan.nextInt()
    scan.nextLine()

    // Fem un bucle amb la quantitat de casos de prova
    repeat(casos) {

        // Demanem les lletres en un string, les pasem a majuscules per evaluar totes de la mateixa manera.
        var paraula: String = scan.nextLine().uppercase()

        // Creem variables per portar el control de les i, en cas de que hagi mes d'una es prendra l'ultima com la separadora final.
        var posicioI: Int = 0
        var inicial: String = ""


        //Creem un Array amb el string y fem un split amb la coma
        var llistatDeNoms: Array<String> = paraula.trim().split(", ").toTypedArray()

        // Comprovem si la lletra "i" surt mes de una vegada i la comptabilitzem. Nomes ens interessa comprovar-ho al ultim element de l'array
        for (lletra in llistatDeNoms[llistatDeNoms.lastIndex].indices) {
            if (llistatDeNoms[llistatDeNoms.lastIndex].get(lletra) == 'I') {
                posicioI = lletra
            }
        }

        // De ser aixi, nomes separem l'ultima de ellas.
        // Concatenem amb substrings i reemplaçem l'ultima "i" per una coma al ultim element de l'array.
        llistatDeNoms[llistatDeNoms.lastIndex] = llistatDeNoms[llistatDeNoms.lastIndex].substring(0, posicioI) + ',' +
                llistatDeNoms[llistatDeNoms.lastIndex].substring(posicioI + 1)

        // Agafem els ultims dos elements i els pasem a un nou Array, els separem per coma un altra vegada.
        var llistat_De_SubStrings = llistatDeNoms[llistatDeNoms.lastIndex].split(", ")

        // Finalment, fem l'array definitiu amb la suma dels dos arrays.
        var llistatDeNoms_final: Array<String> = llistatDeNoms.dropLast(1).toTypedArray() + llistat_De_SubStrings.toTypedArray()




        //Agafem el primer caracter de cada paraula i l'afaegim a una nova string.
        for (i in llistatDeNoms_final.indices) {
            println(llistatDeNoms_final[i])
            inicial = inicial + llistatDeNoms_final[i].get(0).uppercase()
        }

        //Imprimim el resultat.
        println(inicial)
    }

    scan.close()
}


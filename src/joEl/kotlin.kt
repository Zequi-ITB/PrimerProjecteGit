import java.util.Scanner

//ABBA va ser un grup suec de música pop que es va crear a Estocolm l'any 1972, però la fama li va arribar l'any 1974
//en guanyar el Festival de la Cançó d'Eurovisió d'aquell any amb la seva cançó Waterloo. Van aprofitar aquell moment
// per encadenar un èxit darrere un altre fins a convertir-se en la banda amb més vendes de la dècada dels setanta.
//El grup va destacar també pel seu atrevit vestuari, extravagant i molt colorit. El nom del grup tampoc deixava indiferent,
// ja que estava compost per les inicials dels quatre membres del grup: Agneta, Björn, Benny i Anni-Frid.

//Per a cada cas cal indicar la primera lletra del nom de cadascun dels membres en majúscules, sense accents.
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

        //Creem un string en el que guardarem les inicials.
        var inicial: String = ""

        // Fem un bucle per reemplazar la "i" per una ",".
        for (i in paraula.indices) {
            if (i > 0) {
                if (paraula.get(i) == 'I' && paraula.get(i - 1) == ' ' && paraula.get(i + 1) == ' ') {
                    posicioI = i
                }
            }
            // Si trobem algun accent, el reemplaçem per la lletra sense accent.
            when (paraula.get(i)) {
                'Á' -> paraula = paraula.replace('Á', 'A')
                'À' -> paraula = paraula.replace('À', 'A')
                'É' -> paraula = paraula.replace('É', 'E')
                'Í' -> paraula = paraula.replace('Í', 'I')
                'Ó' -> paraula = paraula.replace('Ó', 'O')
                'Ò' -> paraula = paraula.replace('Ò', 'O')
                'Ú' -> paraula = paraula.replace('Ú', 'U')
            }
        }

        // Concatenem substrings per reemplaçar la "i" per una ","
        paraula = paraula.substring(0, posicioI) + ',' + paraula.substring(posicioI + 1)

        // Creem un array i separem els elements per la ","
        var llistatDeNoms: Array<String> = paraula.trim().split(",").toTypedArray()


        // Fem un altre bucle per eliminar el espais en cada element amb el .trim i per guardar les inicials de cada nom.
        for (i in llistatDeNoms.indices) {
            llistatDeNoms[i] = llistatDeNoms[i].trim()
            inicial += llistatDeNoms[i].get(0)
        }

        //Imprimim el resultat
        println(inicial)
    }

    scan.close()
}



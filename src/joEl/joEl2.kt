import java.util.Scanner

//Francesco Virgolini, el cotxe més veloç de tutti l'Italia, ha avançat a un altre cotxe en la copa del món.
//La primera línia indica els casos de prova a considerar Cada cas compta amb un nombre variable de línies.
// La primera líniea té un enter, K que indica quants cotxes hi ha a la cursa, i després vindràn K
// línies, cadascuna amb el nom d'un cotxe. Es garanteix que un dels cotxes es dira "Francesco Virgolini", i mai serà el primer.

//Per cada cas de prova es vol retornar la llista amb Francesco Virgolini havent adelantat una posició, en format estàndard de llista.

fun main() {
    val scan: Scanner = Scanner(System.`in`)

    // Demanem la quantitat de casos
    var casos: Int = scan.nextInt()

    // Fem un bucle amb la quantitat de casos
    repeat(casos) {

        // Demanem el tamany de la llista
        var tamany: Int = scan.nextInt()
        scan.nextLine()

        // Definim la llista i llegim els valor per teclat
        var llistatCotxes: MutableList<String> = MutableList<String>(tamany) { scan.nextLine() }

        //Declarem variables per guardar el nom del cotxe que reemplaçarem i per guardar la posicio en la que trobem a francesco
        var cotxe_reemplazar: String = ""
        var posicioFrancesco: Int = 0

        // Busquem a francesco i obtenim la seva posicio amb indexOf
        posicioFrancesco = llistatCotxes.indexOf("Francesco Virgolini")

        // Reemplaçem el cotxe per Francesco Virgolini i guardem al altre cotxe en la antiga posicio de Francesco.
        cotxe_reemplazar = llistatCotxes[posicioFrancesco - 1]
        llistatCotxes[posicioFrancesco - 1] = "Francesco Virgolini"
        llistatCotxes[posicioFrancesco] = cotxe_reemplazar

        // Imprimim el resultat.
        println(llistatCotxes)

    }
    scan.close()
}
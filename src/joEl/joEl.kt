import java.util.Scanner

//Agapito Di Sousa es un estudiant de 2n de batxillerat que acaba de començar matrius i ja l’hi han posat deures.
//Ha de resoldre unes quantes sumes però li fa molt de pal. Fes un programa per ajudar-li a resoldre-les automàticament.

//El programa haurà de donar la matriu resultat de la suma de la matriu A amb la matriu B.

fun main() {
    val scan: Scanner = Scanner(System.`in`)

    // Demanem la quantitat de dimensions i la mida de cada llista.
    var quantitatDimensions: Int = scan.nextInt()
    var tamanyLlista: Int = quantitatDimensions

    //Fem una llista per guardar les altres llistes a dins.
    var llistatGeneral: MutableList<MutableList<Int>> = mutableListOf()
    var llistatGeneral2: MutableList<MutableList<Int>> = mutableListOf()
    var llistatSumaGeneral: MutableList<MutableList<Int>> = mutableListOf()

    // Definim un contador per el bucle while
    var contador: Int = 1
    var contador2: Int = 1

    // Definim i afeigim les llistes al llistat general. Llegim els valors per teclat.
    while (contador <= quantitatDimensions) {
        var llistatDePreus: MutableList<Int> = MutableList<Int>(tamanyLlista) { scan.nextInt() }
        llistatGeneral += mutableListOf(llistatDePreus)
        contador++
    }
    while (contador <= quantitatDimensions) {
        var llistatDePreus: MutableList<Int> = MutableList<Int>(tamanyLlista) { scan.nextInt() }
        llistatGeneral2 += mutableListOf(llistatDePreus)
        contador++
    }

    for (i in llistatGeneral.indices){
        for (posicio in llistatGeneral[i]){
            var llistatSuma: MutableList<Int> = MutableList<Int>

        }

    }



    scan.close()
}


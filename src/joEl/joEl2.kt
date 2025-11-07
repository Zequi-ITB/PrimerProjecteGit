import java.util.Scanner

//Donada una matriu i la seva mida, determinarem la posició del seu maxim
//Per cada cas haureu d’escriure la posició (fila - columna) del nombre més gran de la matriu.
// L’haureu d’expressar com ho expressaria un humà, es a dir, amb les files i columnes començant per 1.

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem els casos a considerar
    var casos: Int = scan.nextInt();


    // Fem un bucle amb la quantitat de casos a evaluar
    repeat(casos) {

        // Demanem la quantitat de dimensions i la mida de cada llista.
        var dimensionsLlista: Int = scan.nextInt()
        var tamanyLlista: Int = scan.nextInt()

        var llistatGeneral: MutableList<MutableList<Int>> = mutableListOf()

        // Definim un contador per el bucle while
        var contador: Int = 1

        // Definim i afeigim les llistes al llistat general. Llegim els valors per teclat.
        while (contador <= dimensionsLlista) {
            var llistatDenumeros: MutableList<Int> = MutableList<Int>(tamanyLlista) { scan.nextInt() }
            llistatGeneral += mutableListOf(llistatDenumeros)
            contador++
        }

        // Definim les variables per portar el control de quin es el numero major i la seva posicio.
        var numeroMajorTemporal: Int = 0
        var numeroMajor: Int? = 0
        var posicioNumeroMajor: Int = 0
        var posicioLlistaMajor: Int = 0

        // Fem un bucle per agafar la posicio del numero major de cada llista i quedarnos amb el mes gran.
        for (i in llistatGeneral.indices) {
            numeroMajor = llistatGeneral[i].maxOrNull()?.toInt()

            //Anem fent la comprovacio en cada cas per veure si el mes gran de la llista evaluada es mes gran que el de la llista anterior.
            if (numeroMajor != null) {
                if (numeroMajor > numeroMajorTemporal) {
                    posicioNumeroMajor = llistatGeneral[i].indexOf(numeroMajor)
                    posicioLlistaMajor = i
                    numeroMajorTemporal = numeroMajor
                }
            }
        }

        // Imprimim el resultat.
        println("" + (posicioLlistaMajor + 1) + " " + (posicioNumeroMajor + 1))
    }
    scan.close()
}
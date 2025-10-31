import java.util.Scanner
import kotlin.math.absoluteValue

//A Bambino li agrada jugar al Parchís, i el grup de música Parchis.
// Li agrada especialment jugar al Parchís mentre escolta Parchís. A aquest concepte li diu ParchísParchís.
//En el Parchis, quan arribes a “casa” (la zona del teu color a on només poden entrar les teves fitxes),
// has d’arribar a l'última casella amb un nombre exacte de jugades, si no “rebotes” en la casella de meta i tornes enrera.
// La següent tirada tornes a anar endavant


//Per a cada cas hauràs de dir la posició final després de les 3 tirades de daus, tenint en compte de que si algún
// cop arrives a l’última casella (8) ja has guanyat i la resta de tirades son irrelevants
fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem els casos a considerar
    var casos: Int = scan.nextInt();
    val TAMANY_ARRAY = 3
    var POSICIO_META_FINAL = 8

    // Fem un bucle amb la quantitat de casos
    repeat(casos) {
        var ultimaCasella: Boolean = false

        // Creem l'array i demanem la primera posicio i les jugades
        var posicio: Int = scan.nextInt()
        var llistatDeJugadas: Array<Int> = Array(TAMANY_ARRAY) { scan.nextInt() }

        // Fem els calculs de les jugades
        for (i in llistatDeJugadas.indices) {
            posicio = ((llistatDeJugadas[i] + posicio) - POSICIO_META_FINAL).absoluteValue
            if (posicio != 0) {
                posicio = POSICIO_META_FINAL - posicio
            }

            if (posicio == 0) {
                ultimaCasella = true
            }
        }
        //Imprimim els resultats.
        if (ultimaCasella) {
            println("8")
        } else {
            when (posicio) {
                7 -> println("7")
                6 -> println("6")
                5 -> println("5")
                4 -> println("4")
                3 -> println("3")
                2 -> println("2")
                1 -> println("1")
            }
        }

    }
    scan.close()
}
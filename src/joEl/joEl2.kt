import java.util.Locale
import java.util.Scanner
import kotlin.math.PI

//En una mesa redonda no hay ningun lugar destacado y, por lo tanto, nadie ocupa una posición de privilegio.
//Por esta razón, el sabio rey Arturo eligió una mesa redonda para reunir a sus caballeros. De este modo,
//los caballeros eran todos iguales, no había «líderes» y se ahorraba alguna revuelta.
//Pero más que las revueltas, lo que realmente le daba miedo al rey Arturo eran las acaloradas argumentaciones que
//hacían los caballeros. En más de una ocasión habían sacado la espada y la habían batido al viento de un lado a otro
//mientras los caballeros de los lados procuraban no salir heridos.
//Por eso, el rey Arturo te pide tu ayuda. Ha calculado el espacio necesario del perímetro de la tabla que tiene que
//tener un caballero para él solo, incluyendo el margen de seguridad, para no hacer daño a nadie. De este modo, todos
//los caballeros se encontrarán cómodos y podrán defender libremente sus posturas. Hace falta que le digas al rey Arturo
//si, dada una mesa y el espacio que le hace falta a cada caballero, caben todos o no.

//Hay que indicar "YES" (dado que rey Arthur era inglés) si caben todos los caballeros cómodamente o "NO" en caso contrario.

fun main() {
    val scan: Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    // Declarem a PI com una constant
    val PI = PI

    // Demanem el diametro de la taula, el espai minim de cada caballero i i la quantitat de caballeros.
    var diametro: Double = scan.nextDouble()
    var espai_seguretat: Double = scan.nextDouble()
    var quantitat_caballeros: Double = scan.nextDouble()

    //Comprovem si hi caben calculant els metres de la circunferencia (diametro*PI) i el espai de seguretat multiplicat per els caballers.
    //Imprimim el resultat en cada cas.
    if (diametro* kotlin.math.PI >= espai_seguretat*quantitat_caballeros ) {
        println("YES")
    }
    else {
        println("NO")
    }


    scan.close()
}
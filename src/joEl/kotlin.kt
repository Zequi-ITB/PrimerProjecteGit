import java.util.*

//Un professor vol saber per un treball quin es el nen més alt de la seva classe.
//El programa escriurà “Nen Nº“ del nen més alt. En cas que tots superin l'altura màxima escriurà "No hi ha cap nen".
fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem l'altura maxima per ser considerat nen.
    var alturaMax: Int = scan.nextInt()

    // Demanem les altures de les persones a considerar.
    var altura1: Int = scan.nextInt()
    var altura2: Int = scan.nextInt()
    var altura3: Int = scan.nextInt()

    // Declarem variables per comprovar si s'ha superat l'altura maxima.
    var altura1Superada: Boolean = false;
    var altura2Superada: Boolean = false;
    var altura3Superada: Boolean = false;
    var dosAlturaSuperada: Boolean = false;

    // Comprovem si s'ha superat l'altura maxima en una o mes d'una persona.
    if (altura1 > alturaMax) {
        altura1Superada = true
    }
    if (altura2 > alturaMax) {
        altura2Superada = true
        if (altura1Superada) {
            dosAlturaSuperada = true
        }
    }
    if (altura3 > alturaMax) {
        altura3Superada = true
        if (altura1Superada || altura2Superada) {
            dosAlturaSuperada = true
        }
    }

    // Declarem variables per comprovar quin es el mes alt
    var mesAlt: Int = 0
    var guanyador: Int = 0

    // Fem una condicio per si els tres superan l'altura maxima i imprimim el missatge corresponent
    if (altura1Superada && altura2Superada && altura3Superada) {
        println("No hi ha cap nen")
    } else {
        // Fem tota la serie de comprobacions en el cas de que mes de una persona superi l'altura o solo una.
        if (dosAlturaSuperada) {
            if (altura1Superada && altura2Superada) {
                mesAlt = altura3
            } else if (altura1Superada && altura3Superada) {
                mesAlt = altura2
            } else if (altura2Superada && altura3Superada) {
                mesAlt = altura1
            }
        } else if (altura1Superada) {
            mesAlt = maxOf(altura2, altura3)
        } else if (altura2Superada) {
            mesAlt = maxOf(altura3, altura1)
        } else if (altura3Superada) {
            mesAlt = maxOf(altura1, altura2)
        } else {
            mesAlt = maxOf(altura1, altura2, altura3)
        }

        // Asignem el numero de posicio segons el que tingui l'altura mes gran i imprimim el resultat.
        when (mesAlt) {
            altura1 -> guanyador = 1
            altura2 -> guanyador = 2
            altura3 -> guanyador = 3
        }
        println("Nen $guanyador")
    }
    scan.close()

}
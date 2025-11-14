
import java.util.Scanner

//Eduardo Chillida (1924-2002) fue un escultor vasco muy peculiar. De jovencito fue portero de la Real Sociedad (1942-43),
//pero una grave lesión le hizo abandonar la carrera deportiva. Empezó a estudiar arquitectura, pero aquello de hacer
//edificios a sabiendas de que no caerán no le acababa de convencer. Él lo que quería era buscar los límites y la
//arquitectura no le permitía hacerlo, así que lo probó con la escultura y aquello le permitió hacer todo tipo de experimentos sin correr riesgos.
//Entre sus particularidades hay que destacar que evitaba el uso del ángulo recto. Lo consideraba "estirado", "aburrido"
//y poco "dialogante" con otras formas, prefiriendo los ángulos próximos a 90° (entre 88° y 93°), que encontraba más
//"tolerantes" y capaces de "conversar" con otras geometrías.
//Su famosa frase "Creo que la virtud se encuentra cerca del ángulo recto, pero no en él" resume su idea de que la
//perfección y la belleza se encuentran en la imperfección, en la proximidad a la norma, pero no en la norma misma.
//En este problema no compartiremos su visión y, si no pasas todos los juegos de prueba, no aceptaremos tu solución.

//Hay que indicar "SI" si usando estos ángulos podriamos construir un "cuadrado" imitando una escultura de Chillida y "NO" en caso contrario.


fun main() {
    val scan: Scanner = Scanner(System.`in`)

    //Declarem una variable per controlar si el quadrat es possible o no
    var esPosible: Boolean = false

    //Demanem els angles del cuadrat i els guardem en un llistat
    var llistatAngulos: List<Int> = List(3) { scan.nextInt() }

    //Fem un altre llistat per portar control dels que son valids
    var llistatAngulosFinal: MutableList<Int> = mutableListOf()

    //Declarem variables per calcular el quart angle
    var sumaAngulos: Int = 0
    var calcul_cuarto_angulo: Int = 0
    val SUPERFICIE_CUADRADO: Int = 360

    //Comprovem si es a dins del rang i cumpleix les altres condicions per afegir-lo a la nova llista
    for (i in llistatAngulos) {
        if (i in 88..93) {
            if (i != 90) {
                llistatAngulosFinal.add(i)
            }
        }
    }

    //Comprovem si la nova llista te els 3 angles valids.
    if (llistatAngulosFinal.size == 3) {
        for (i in llistatAngulosFinal) {
            sumaAngulos += i
        }
    }

    //Calculem el quart angle.
    calcul_cuarto_angulo = SUPERFICIE_CUADRADO - sumaAngulos

    //Comprovem si el quart angle es valid
    if (calcul_cuarto_angulo in 88..93) {
        if (calcul_cuarto_angulo != 90) {
            esPosible = true;
        }
    }

    //Imprimim el resultat.
    if (esPosible) {
        println("SI")
    } else {
        println("NO")
    }


    scan.close()
}
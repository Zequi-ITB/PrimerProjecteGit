import java.util.Locale
import java.util.Scanner

//Definim la data class producte
data class Alumne(
    var nomAlumne: String,
    var notaPrimerParcial: Float,
    var notaSegonParcial: Float,
    var notaFinal: Float
)

//Passar les notes és una de les tasques més avorrides que pot tenir un professor. T'ofereixes a ajudar al professor
//a passar les notes? Potser pots ficar-hi cullerada i arreglar-te les notes...

//Cal mostrar 2 línies, amb el nom de l'alumne, la nota del primer parcial, la nota del segon parcial i la nota final, separades per un espai.
//La primera linia mostrarà el nom de la persona que ocupa el lloc P1 segons el segon parcial.
//La segona linia mostrarà el nom de la persona que ocupa el lloc P2 segons la seva nota final.

fun main() {
    val scan: Scanner = Scanner(System.`in`).useLocale(Locale.UK)

    //Demanem a l'usuari la quanitat de productes que volem evaluar
    var quantitatAlumnes: Int = scan.nextInt()
    scan.nextLine()

    // Definim el llistat on guardarem tots els productes
    var llistatAlumnes: MutableList<Alumne> = mutableListOf<Alumne>()

    // Fem un bucle amb la quantitat de casos
    repeat(quantitatAlumnes) {
        //Definim la variable que farem servir per guardar els valors del producte
        var alumne_: Alumne = Alumne("", 0.0f, 0.0f, 0.0f)

        //Demanem les dades del producte
        alumne_.nomAlumne = scan.next()
        alumne_.notaPrimerParcial = scan.nextFloat()
        alumne_.notaSegonParcial = scan.nextFloat()

        //afegim cada producte a la llista
        llistatAlumnes.add(alumne_)
    }
    scan.nextLine()

    //Demanem el index del producte que volem consultar
    var posicio1 = scan.nextInt()
    var posicio2 = scan.nextInt()

    //Fem una iteració per calcular la nota final de tots els elements.
    for (i in llistatAlumnes.indices) {
        llistatAlumnes[i].notaFinal =
            llistatAlumnes[i].notaPrimerParcial * 40 / 100 + llistatAlumnes[i].notaSegonParcial * 60 / 100
    }

    //Ordenem la llista en ordre descendent segons el segon parcial i segons la nota final
    var llistatOrdreDescParcial = llistatAlumnes.sortedBy { it.notaSegonParcial }.reversed()
    var llistaOrdreDescNotaFinal = llistatAlumnes.sortedBy { it.notaFinal }.reversed()

    //Imprimim el resultat
    println(
        llistatOrdreDescParcial[posicio1 - 1].nomAlumne + " " + llistatOrdreDescParcial[posicio1 - 1].notaPrimerParcial + " " + llistatOrdreDescParcial[posicio1 - 1].notaSegonParcial + "  ${
            "%.2f".format(
                llistatOrdreDescParcial[posicio1 - 1].notaFinal
            )
        }"
    )
    println(llistaOrdreDescNotaFinal[posicio2 - 1].nomAlumne + " " + llistaOrdreDescNotaFinal[posicio2 - 1].notaPrimerParcial + " " + llistaOrdreDescNotaFinal[posicio2 - 1].notaSegonParcial + " " + llistaOrdreDescNotaFinal[posicio2 - 1].notaFinal)


    scan.close()
}



import java.util.Scanner

//En Marc, el vostre professor preferit, està intentant de que li digueu la paraula “acumulador” davant del vostre silenci habitual. Per això, fa un joc del penjat.

//Per a cada cas de prova hauras de mostrar la paraula descoberta. Les lletres sense descobrir encara vindran marcats amb asteriscos.
// Després de la paraula es posarà un espai i el nombre d’errors. Es considera un error quan el caràcter no està en la paraula secreta

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos de prova a evaluar
    var casos: Int = scan.nextInt()
    scan.nextLine()

    var lletra: String = ""

    // Fem un bucle amb la quantitat de casos de prova
    repeat(casos) {

        // Demanem la paraula secreta i les lletres
        var paraulaSecreta: String = scan.nextLine().lowercase()

        lletra += scan.next()
        lletra.split(" ")
        for (i in lletra.indices) {
            if (lletra[i] in paraulaSecreta) {

            }
            else{
                paraulaSecreta.replace()
            }
        }


    }


    scan.close()
}


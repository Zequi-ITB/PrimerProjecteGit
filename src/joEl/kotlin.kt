import java.util.Scanner

//Eran uno dos i tres, los famosos mosqueperros.
// El malvado Cardenal Richelieu ha colado gatos (entre otras cosas indeseables) en los cuerpos de elite de los mosqueperros. Pasa revista a las tropas y separa los mosqueperros y todo lo demás.


fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos de prova a evaluar
    var casos: Int = scan.nextInt()

    // Fem un bucle amb la quantitat de casos
    repeat(casos) {

        // Demanem la quantitat de tropes a evaluar
        var tropes = scan.nextInt()
        scan.nextLine()

        // Demanem el nom de les tropes
        var nomTropes = scan.nextLine()

        // Pasem tot a una llista
        var llistatOriginal: MutableList<String> = nomTropes.split(",").toMutableList()

        // Creem dos llistes on posarem els mosqueperros i els que no ho son.
        var llistatMosqueperros: MutableList<String> = mutableListOf()
        var llistatImpostors: MutableList<String> = mutableListOf()

        //Mirem si dins del element es troba "Mosqueperro" i el guardem en la primera llista, sino en la segona.
        for (i in llistatOriginal.indices) {

            //Fem servir Regex per evaluar nomes la paraula sencera, aixi podem evitar comptabilitzar els casos en que "Mosqueperro" esta dins d'una paraula.
            if (Regex("""\bMosqueperro\b""").containsMatchIn(llistatOriginal[i])) {
                llistatMosqueperros.add(llistatOriginal[i].trim())
            } else {
                llistatImpostors.add(llistatOriginal[i].trim())
            }
        }

        //Imprimim el resultat
        println(llistatMosqueperros)
        println(llistatImpostors)
    }

    scan.close()
}



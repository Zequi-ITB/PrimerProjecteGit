import java.util.Scanner

//Vicente vivia en un poble perdut a les muntanyes. No tenien ni aigua a casa, i l’havien de buscar a un pou,
// a qualsevol hora del dia. La veritat és que passava moltes estones al dia caminant entre casa seva i el pou,
// i a vegades se li feia de nit. El trajecte era avorrit, però Vicente, que era molt imaginatiu, sempre buscava algun entreteniment.
// Un dia de lluna plena, va pensar com podria anar el pou a la lluna, encara que sigui fent volant la imaginació, i ... certament va trobar la manera.

//Vicente vol saber si la seqüència de paraules de cada cas de prova compleix el següent:
//Totes les paraules tenen la mateixa longitud
//Dues paraules consecutives són sempre iguals tret d’una única lletra que canvia (pot ser qualsevol lletra).
// Si es compleixen aquests dues condicions, respondrà CORRECTE Cas contrari respondrà INCORRECTE

fun main() {
    val scan: Scanner = Scanner(System.`in`)
    // Demanem la quantitat de casos
    var casos: Int = scan.nextInt()

    // Fem un bucle amb la quantitat de casos
    repeat(casos) {

        // Demanem la quantitat de lineas a comparar.
        var quantitatLineas: Int = scan.nextInt()
        scan.nextLine()

        // Creem un array de strings i demanem les paraules.
        var llistatParaules: Array<String> = Array(quantitatLineas) { scan.nextLine() }

        //Creem una variable per comptabilitzar les lletres diferents, un altre per si detectem que alguna de les condicions no es cumpleix
        // i un altre per comparar totes les paraules amb la longitud del primer element
        var longitud: Int = llistatParaules[0].length
        var esIncorrecte: Boolean = false
        var lletresDiferents: Int = 0

        // Iterem i comparem cada element amb .lenght per veure
        for (i in llistatParaules.indices) {
            if (llistatParaules[i].length != longitud) {
                esIncorrecte = true
            }
        }

        // Si tenen la mateixa llargada comparem les lletres per veure si nomes canvia 1 lletra entre dos paraules consecutives
        if (esIncorrecte == false) {

            //Fem un bucle per pasar per tots els elements del array
            for (posicio in llistatParaules.indices) {
                lletresDiferents = 0

                // Si la posicio no es la ultima, comparem dos paraules consecutives en un bucle.
                if (posicio < llistatParaules.size - 1) {
                    for (lletra in llistatParaules[posicio].indices) {
                        if (llistatParaules[posicio].get(lletra) != llistatParaules[posicio + 1].get(lletra)) {
                            lletresDiferents++
                        }
                    }
                    if (lletresDiferents != 1) {
                        esIncorrecte = true
                    }
                }
            }
        }

        //Imprimim el resultat.
        if (esIncorrecte) {
            println("INCORRECTE")
        } else {
            println("CORRECTE")
        }
    }


    scan.close()
}


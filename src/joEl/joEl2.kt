import java.util.Scanner

//Havien passat més de 35 anys des que va acabar l’antiga EGB (Educació General Bàsica),
// però no importava. Semblava que fos ahir. L’alumnat del Colegio Nacional Prim
// es tornava a reunir per saber de la seva vida. Era una d’aquelles coses que val la pena viure.
// Per mantenir l’esperit i il·lusió entre tots aquells nens i nenes que rondaven la cinquantena, Celia,
// una de les alumnes més actives, va fer una proposta que a tothom li va semblar be: compraria un número
// de la loteria de la Grossa i el jugaríem entre tots. Be, aquesta era la idea, i la van fer, però no tothom
// tenia interès en participar o be ho volien fer en quantitats diferents. Van buscar un número especial
// per ells i Celia va comprar tota la quantitat possible d’aquest número. Després, va obrir una llista de peticions,
// on cada company podia demanar un import que després li abonaria. No estava clar si podria satisfer totes les peticions
// o si al final seria ella qui s’hauria de quedar el sobrant no assignat.

//Celia no te en compte l’ordre d’arribada de les sol·licituds.
//La seva intenció és satisfer quantes més sol·licituds, millor. Això sí, una sol·licitud no es
//pot quedar a mitjes ... o s’accepta completament, o es rebutja. Per cada cas de prova, caldrà respondre:
//Una sola línia amb un valor que indicarà el número de sol·licituds acceptades (el zero no compta)

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem els casos a considerar
    var casos: Int = scan.nextInt();


    // Fem un bucle amb la quantitat de casos a evaluar
    repeat(casos) {

        // Demanem l'import que ha pagat Celia per la aposta.
        var importNumero: Int = scan.nextInt()

        // Declarem un string per guardar els numeros que anem demanant
        var cadenaApuestas: String = ""

        // Fem un bucle per demanar numeros fins que sigui 0

        do {
            var apuestas: Int = scan.nextInt()

            // Si el numero no es 0, el guardem a la cadena de Strings.
            if (apuestas != 0) {
                cadenaApuestas += "$apuestas "
            }
        } while (apuestas != 0)


        // Creem l'array de INTS. Fem servir el .trim per eliminar els espais en blanc al final i al principi. El .split per separar els elements quan hi hagi un espai.
        // El .map per convertir cada element a enter i el .toTypedArray per pasarlo a array.
        if (cadenaApuestas != "") {
            var llistatNumeros: Array<Int> = cadenaApuestas.trim().split(" ").map { it.toInt() }.toTypedArray()


            //Ordenem l'array de manera ascendent
            llistatNumeros.sort()

            // Declarem variables per portar el compta de la suma de les apostas, de les soliituds acceptades i un iterador.
            var sumaApuestas: Int = 0
            var solicituds: Int = 0
            var iterador: Int = 0

            // Fem un bucle per anar sumant les apostes i comptabilitzen les solicituds que se accepten.
            while (iterador < llistatNumeros.size) {
                sumaApuestas += llistatNumeros[iterador]

                if (sumaApuestas <= importNumero) {
                    solicituds++;
                }
                iterador++;
            }

            //Imprimim el resultat.
            println(solicituds)
        } else {
            println("0")
        }
    }
//Final

    scan.close()
}
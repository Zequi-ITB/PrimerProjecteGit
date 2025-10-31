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

    scan.nextLine()


    // prodria agafar tots els elements com un string i pasarlos a un array despres


    // Fem un bucle amb la quantitat de casos
    repeat(casos) {
        var contadorElementos: Int = 0
        var importNumero: Int = scan.nextInt()
        var cadena: String =""
       do {
           cadena = scan.next()
           contadorElementos++;

       }while (cadena!="0")


       // Creem l'array



        var llistatDeSolicituds: arr = (contadorElementos){0}

        llistatDeSolicituds = cadena.split(" ").map { it.toInt() }

        for (i in llistatDeSolicituds.indices){

            llistatDeSolicituds[i]= cadena[i].digitToInt()
            println(llistatDeSolicituds[i])
        }




    }
    scan.close()
}
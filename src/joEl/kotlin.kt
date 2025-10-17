import java.util.Scanner

//> (problema NO patrocinado por Square Enix)
// ¿Has oído hablar del famoso MMORPG aclamado por la crítica: FINAL FANTASY XIV?
// Si es así, enhorabuena, seguro que tu vida es mejor que la de los que no lo han hecho. Si no es así... ¿A qué esperas?
// Sea como sea seguro que SÍ que conoces la famosa cancioncilla que dice:
// "Un elefante se balanceaba sobre la tela de una araña..." pues verás, en FINAL FANTASY XIV existe una adorable raza de pequeños humanoides
// que ¡Adora balancearse! El problema es que las arañas les aterran, pero como son muy temerarios, si ven una telaraña intentarán balancearse...
// Aunque siempre respetando la capacidad de la tela, no queremos ningún accidente.

// La frase "Hay x telarañas llenas." donde x es el número de telarañas COMPLETAMENTE OCUPADAS.
// Ten en cuenta que una telaraña solo quedará ocupada cuando en la secuencia aparezcan tantos Lalafel como los necesarios para ocuparla.
// También piensa que NO QUEREMOS ACCIDENTES por lo que siempre que haya una telaraña completa, los Lalafels que no quepan esperaran a que aparezca otra telaraña.
// Por último recuerda: LOS LALAFELS ODIAN LAS ARAÑAS Si aparece una araña en la secuencia, todos los lalafels que estaban balanceándose
// se irán corriendo y las telas se romperán, quedando inutilizables.

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos a evaluar.
    var casos: Int = scan.nextInt();
    scan.nextLine()

    // Fem un bucle amb la quantitat de casos a evaluar i demanem la secuencia de paraules i la capacitat de la telearanya.
    repeat(casos) {

        var contadorLalafels: Int = 0;
        var contadorTelaranyes: Int = 0;
        var hiHaAranya: Boolean = false;
        var telaranyesPlenes: Int = 0;
        do {
            var paraula: String = scan.next().lowercase();


            var teComa: Boolean = paraula.get(paraula.length - 1) == ','

            // Comprovem si la paraula te coma per saber si restar-li o no l'ultim caracter
            if (teComa) {
                paraula = paraula.dropLast(1)
            }

            //// Verifiquem si apareix la paraula aranya en la secuencia per imprimim directament que hi ha 0 telaranyes plenes.
            if (paraula != "aranya") {

                //Comptabilitzem quants Lalafels i telaranyes hi ha.
                when (paraula) {
                    "lalafel" -> contadorLalafels++;
                    "telaranya" -> contadorTelaranyes++
                }


                //Imprimim el resultat si apareix alguna aranya.
            } else {
                hiHaAranya = true;
            }


        } while (teComa)

        var capacitat: Int = scan.nextInt();
        scan.nextLine();

        telaranyesPlenes = contadorLalafels / capacitat
        if (hiHaAranya) {
            println("Hay 0 telaranyas llenas.")
        } else {
            println("Hay $telaranyesPlenes telaranyas llenas.")
        }


    }


    // Multipliquem la quantitat de telaranyes per la capacitat

    // Mirem si la quantitat de lalafels es mes igual o menor que la quantitat de telaranyes

    // Evaluem si hi caben totes en una o en mes.

    scan.close()
}
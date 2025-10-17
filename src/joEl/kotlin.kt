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

        //Declarem variables per comptabilitzar els lalafels i les telaranyes.
        var contadorLalafels: Int = 0;
        var contadorTelaranyes: Int = 0;
        var telaranyesPlenes: Int = 0;

        // Fem un bucle do-while per demanar les frases i fer diferents comprovacions
        do {
            var paraula: String = scan.next().lowercase();   //Utilitzem lowercase per evaluar totes les entrades de igual manera.

            // Declarem una variable per saber si la paraula te coma al final, aixi sabrem si es l'ultima quan no tingui coma.
            var teComa: Boolean = paraula.get(paraula.length - 1) == ','

            // Comprovem si la paraula te coma per saber si restar-li o no l'ultim caracter
            if (teComa) {
                paraula = paraula.dropLast(1)
            }

            //// Verifiquem si apareix la paraula aranya en la secuencia per resetear els comptadors a 0.
            if (paraula == "aranya") {
                contadorLalafels = 0;
                contadorTelaranyes = 0;
            }

            //Comptabilitzem quants Lalafels i telaranyes hi ha.
            when (paraula) {
                "lalafel" -> contadorLalafels++;
                "telaranya" -> contadorTelaranyes++
            }


        } while (teComa)

        // Demanem le capacitat de la telaranya.
        var capacitat: Int = scan.nextInt();
        scan.nextLine();

        // Comprovem si la capacitat es 0, de no ser aixi, fem el calcul de quantes telaranyes hi ha plenes i imprimim el resultat.
        if (capacitat <= 0) {
            println("Hay 0 telaranyas llenas.")
        }

        // Dividim els lalafels per la capacitat per saber quantes telaranyes fan falta per tots.
        // Si el resultat es igual o major a la quantitat de telaranyes imprimim el resultat.
        else
            if (contadorLalafels / capacitat >= contadorTelaranyes) {
                telaranyesPlenes = contadorTelaranyes
                println("Hay $telaranyesPlenes telaranyas llenas.")
            } else {
                telaranyesPlenes = contadorLalafels / capacitat;
                println("Hay $telaranyesPlenes telaranyas llenas.")
            }
    }

    scan.close()
}
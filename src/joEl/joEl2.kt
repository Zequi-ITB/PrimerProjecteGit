import java.util.Scanner

// WebCaptioner (conegut a catalunya com WebCasteller), és una web que et permet posar subtítols a la veu a temps real.
// Encara està aprenent, així que amb tal de que posi bé la meitat de les lletres ens donem per satisfet.

//Per cada cas de prova caldrà respondre: Si com a mínim la meitat de les lletres són iguals en posició i valor,
// es tornara "GRACIES WEBCASTELLER" Si no, es tornarà "WEBCASTELLER ESTA TRAVIESO HOY". Si les strings tenen tamany diferent,
// es prendrà com a referència la string més llarga.

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos
    var casos: Int = scan.nextInt();

    scan.nextLine();

    // Fem un bucle per demanar les paraules
    repeat(casos) {
        var paraula1: String = scan.nextLine()
        var paraula2: String = scan.nextLine()

        var paraulaMesLlarga: String = "";
        var paraulaMesCurta: String = "";
        var coincidencies: Int = 0;


        // Comparem les paraules per veure si hi ha alguna mes gran.
        if (paraula1.length > paraula2.length) {
            paraulaMesLlarga = paraula1;
            paraulaMesCurta = paraula2;

        } else {
            paraulaMesLlarga = paraula2
            paraulaMesCurta = paraula1;
        }

        // Fem una comprovació de lletra per lletra de les dues paraules amb un contador de coincidències
        for (i in 0..paraulaMesCurta.length - 1) {
            if (paraula1.get(i) == paraula2.get(i)) {
                coincidencies++;
            }
        }

        // Comprovem si el numero de coincidencies es mes gran que la meitat de la paraula mes llarga.
        // Fem la resta entre la paraula mes llarga i les coincidencies i la comparem amb les coincidencies totals.
        if ((paraulaMesLlarga.length - coincidencies) > coincidencies) {
            println("WEBCASTELLER ESTA TRAVIESO HOY")
        } else {
            println("GRACIES WEBCASTELLER")
        }
    }

    scan.close()
}



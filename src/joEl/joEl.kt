import java.util.Scanner

// Isabel Preysler t’ha demanat fer una torre de Ferrero Rocher per a la recepció de l’ambaixador. La torre ha de ser en forma de piràmide quadrada.
// Això significa que el primer pis tindrà un Ferrero, el segon 4, el tercer 9, el quart 16, i així succesivament (cada pis és un quadrat amb un més a cada cantó)
//Per cada cas de prova caldrà respondre: El nombre de bombons necessaris per a construir la piràmide
// (no els bombons del pis que fa de base, sinó tots els bombons que fan falta per fer la piràmide).

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem el numero de casos a considerar.
    var voltes: Int = scan.nextInt();
    var suma: Int = 0;

    //Fem un bucle per demanar els números i calcular el nombre de bombons.
    repeat(voltes) {
        var num: Int = scan.nextInt();

        // Fem una iteracio numero per numero per calcular el total de bombons.
        for (i in 1..num) {
            suma += i * i;
        }
        //Imprimim el resultat
        println(suma)
    }
    scan.close()
}



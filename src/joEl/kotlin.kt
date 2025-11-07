import java.util.Scanner

//Hi ha gent que li agrada sumar. Hi ha gent per tot en aquest món
//Per cada cas es dirà els dos números sumats


fun main() {
    val scan: Scanner = Scanner(System.`in`)

    //Declarem la variable en la que farem la suma.
    var suma: Int = 0

    // Fem un bucle per fer la suma
    repeat(2) {
        suma += scan.nextInt()
    }

    //Imprimim el resultat
    println(suma)

    scan.close()
}



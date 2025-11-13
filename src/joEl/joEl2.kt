import java.util.Scanner

//L'altre dia vaig anar al Mercadona a comprar vodka Knebep. I una dona se'm va colar!!!! Intolerable.
//Per cada cas de prova es vol retornar tota la llista de nombres propocionada, pero amb l'element C que s'ha colat a la posició P
//Es considera que la primera posició és 0.


fun main() {
    val scan: Scanner = Scanner(System.`in`)

    // Demanem la quantitat de casos
    var casos: Int = scan.nextInt()


    // Fem un bucle amb la quantitat de casos
    repeat(casos) {

        //Demanem el tamany de la llista
        var tamany: Int = scan.nextInt()

        //Declarem el llistat i llegim els valors per teclat
        var llistatCuaDeGent: MutableList<Int> = MutableList<Int>(tamany) { scan.nextInt() }

        // Demanem el numero que es vol colar i la posicio a la que es cola.
        var elementColat: Int = scan.nextInt()
        var posicioColat: Int = scan.nextInt()

        //Afeigim el element a la posicio desitjada.
        llistatCuaDeGent.add(posicioColat, elementColat)

        //Imprimim el resultat.
        for (i in llistatCuaDeGent) {
            print("$i ")
        }
        println()
    }

    scan.close()
}
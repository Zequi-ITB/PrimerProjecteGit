import java.util.Scanner

//L’excelent programador, superb professor i millor persona Gregorio deixa el consell escolar,
// i vol amanyar les votacions per a que no li torni a tocar. Fes un software per a ajudar a marcar vots en les eleccions al consell escolar del Institut

//Per cada cas s’haurà de tornar una matriu quadrada del tamany marcat, amb les vores i les dues diagonals amb X. La resta de caselles sera.
fun main() {
    val scan: Scanner = Scanner(System.`in`)

    // Demanem el tamany de la matriu
    var tamanyMatriu: Int = scan.nextInt()
    scan.nextLine()

    // Definim la matriu
    var matriu: MutableList<MutableList<String>> = mutableListOf()

    // Definim i afeigim les llistes al llistat general.
    repeat(tamanyMatriu) {
        var llistat: MutableList<String> = MutableList<String>(tamanyMatriu) { "" }
        matriu.add(llistat)
    }

    for (i in matriu.indices) {
        for (posicio in matriu[i].indices) {
            if (i == 0 || i == matriu.size - 1) {
                matriu[i][posicio] = "x"
            }
            else{
                if (posicio == 0) {
                    matriu[i][posicio] = "x"
                }
                else {
                    println()
                }
            }



        }
    }

    println(matriu)





    scan.close()
}


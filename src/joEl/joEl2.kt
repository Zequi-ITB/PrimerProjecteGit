import java.util.Scanner

//Diu la llegenda que Euler de petit va poder sumar molt fàcilment tots els números del 0 al 100 perquè va donar-se compte que 0+100 = 100, 1+99 = 100, 2+98 = 100, etc. D’aquí neix la fórmula d’Euler
//nota: Euler té 32109382190381290 fórmules diferents i totes es diuen fórmula d'Euler

//Per a cada cas, en una línia, digues la suma dels nombres oposats per grandària. És a dir, la suma del més petit amb el més gran,
// la suma del segon més petit amb el segón més gran, la suma del tercer més petit amb el tercer més gran, etc, fins que els hagis dit tots.
// Hauràs de dir sempre N/2 nombres
fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem els casos a considerar
    var casos: Int = scan.nextInt();

    // Fem un bucle amb la quantitat de casos i demanem el tamany de l'array.
    repeat(casos) {
        var tamanyArray: Int = scan.nextInt();

        // Creem l'array i demanem el per entrada els valors dels elements.
        var llistatDeNumeros: Array<Int> = Array(tamanyArray) { scan.nextInt() }

        var numeroMesGran: Int = 0
        var numeroMesPetit: Int = 0
        var iteradorPetit: Int = 0
        var iteradorGran: Int = 0


        // Comprovem els numeros
        repeat(tamanyArray / 2) {
            for (i in llistatDeNumeros.indices) {
                if (llistatDeNumeros[i] > numeroMesGran) {
                    numeroMesGran = llistatDeNumeros[i]
                    iteradorGran = i

                }
                if (llistatDeNumeros[i] < numeroMesPetit) {

                    numeroMesPetit = llistatDeNumeros[i]
                    iteradorPetit = i

                }
            }

            var resultat: Int = numeroMesPetit + numeroMesGran
            print("$resultat ")


            // Eliminem del array el mes gran i mes petit en cada pasada.
            llistatDeNumeros[iteradorGran] = 0
            llistatDeNumeros[iteradorPetit] = 0

        }
        println()

    }
    scan.close()
}
import java.util.*

//Abans de començar a fer exercicis d'arrays, comprovem que podem llegir i escriure bé en arrays.
//El problema serà de tres línies. La primera tindrà un nombre, K
// que et dirà el tamany de l'array que has de crear La segona son K
// nombres, separats per espais que et dirà el contingut de l'array que has de llegir. La tercera serà N
//, una posició de l'array a on has d'accedir. Es garanteix que N<K

//Tornaràs dues linies. La primera serà l'array sencer escrit, amb espais entre cada caràcter. La segona serà el contingut de l'array a la posició N
// (recorda que la primera posició es 0).

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem el tamany de l'array.
    var tamany: Int = scan.nextInt();

    // Creem l'array
    var llistatDeNumeros = arrayOfNulls<Int>(tamany);

    // Fem un bucle amb les voltes segons el tamany del array i demanem les dades que tindra l'array en cada posicio
    for (i in llistatDeNumeros.indices) {
        llistatDeNumeros[i] = scan.nextInt();
    }

    // Demanem quina posicio volem llegir
    var posicioImprimir: Int = scan.nextInt();

    // Imprimim el array sencer(Imprimim un espai si no es el primer element) i la posicio consultada.
    for (i in llistatDeNumeros.indices)
        if (llistatDeNumeros[i] != 0) {
            print(" ")
        }
    print(llistatDeNumeros[i])
    println()
    println(llistatDeNumeros[posicioImprimir])


    scan.close()
}
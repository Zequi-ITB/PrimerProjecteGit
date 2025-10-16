import java.util.Scanner


//Marc nunca se acuerda de abrir las exclamaciones. Él dice que es porque en catalán no se abren las exclamaciones pero
// yo creo que simplemente no sabe escribir. Vamos a crear un programa que asegure que hay tantos abrir exclamación como cerrar exclamación para flamearlo.

//Por cada caso, responde SI si hay tantos abrir exclamación como cerrar exclamación y NO en caso contrario

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem les dades
    do {
        var paraula: String = scan.nextLine();

        var contadorExclamacio: Int = 0;

        for (i in 0..paraula.length) {
            if (paraula.get(i) == '!') {
                contadorExclamacio++;
            }

        }
    } while (paraula != "FIN")


    scan.close()
}
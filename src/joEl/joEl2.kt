import java.util.Scanner

// La Valentina té un Ràdar que pot detectar la quantitat d'energia de les persones.
// Per a calibrar-ho, fa 5 medicions de cada persona, que li tornen un valor d'energia.
// Si l'energia es menys de 1000, serà de categoria H, si es entre 1000 i 10000, de categoria B i si és de 10000 o més, categoria M

//La primera línia indica els casos de prova a considerar Cada cas és una linea amb 5 números, cadascún amb la medició de l'energia.

//Per cada cas de prova caldrà respondre: Si en alguna medició s'ha detectat un valor d'energia de 10000 o superior, M Si no és M, pero hi ha algun valor d'energia 1000 o superior, B En cas contrari, H

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos a comprovar
    var casos: Int = scan.nextInt();


    // Fem un bucle per demanar els 5 valors de cada medició.
    repeat(casos) {
        var quantitatMedicions: Int = 5;
        var contador: Int = 0;
        var b: Boolean = false;
        var m: Boolean = false;
//dsfs
        // Demanem les medicions
        while (quantitatMedicions > contador && m == false) {
            var medicions: Int = scan.nextInt();
            contador++;

            // comprovem a quina categoria d'energia corresponen la medicion mitjançant Booleans.
            if (medicions >= 10_000) {
                m = true;
            } else if (medicions >= 1000) {
                b = true;
            }
        }
        // Imprimim el resultat.
        if (m) {
            println("M");
        } else
            if (b) {
                println("B")
            } else {
                println("H")
            }
    }
    scan.close()
}



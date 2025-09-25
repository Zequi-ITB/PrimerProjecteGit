//L'usuari escriu un enter amb la seva edat i s'imprimeix true si és major d'edat, i false en qualsevol altre cas.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    println("Introdueix la teva edat: ");
    var edat = scan.nextInt();


    // Posem un condicional per canviar el boolean a "true" en cas de ser major o igual a 18 anys.

    if (edat >=18){
        println("True")

    }

    else
        println("False")


    scan.close();
}
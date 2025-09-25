//Fes un programa que rebi un caràcter de l’abecedari en majúscula i el faci minúscula.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)

    // Aqui utilitzem "lowercase()" per passar a minúscula el caràcter.
    
    println("Ingressa una lleta en majúscula: ");
    var lletra = scan.nextLine().lowercase();

    println(lletra);

    scan.close();
}
//Escriu un programa que llegeixi un nombre enter i imprimeixi una frase amb el següent nombre enter.

import java.util.Scanner
fun main() {
    var scan : Scanner = Scanner(System.`in`);

    //Demanem les dades.
    println("Ingressa un número: ");
    var numero : Int = scan.nextInt();

    //Fem la suma del següent nombre dins del println.
    println("Després ve el "+(numero+1));

    scan.close();

}


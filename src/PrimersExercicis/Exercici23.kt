//Fes un programa que rebi un caràcter i digui si és una lletra o no.

import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);

    //Ingressem les dades i coloquem ".lowercase()" per llegir tot en minuscules.

    println("Ingressa un caràcter: ");
    var entrada : String = scan.nextLine().lowercase()
    var lletra : Boolean = false;


    // Fem la comparació amb l'alfabet amb l'operador "&" perque siguin verdaderes les dues condicions.

    if (entrada >="a" && entrada<="z"){
        lletra = true;
    }
    

    println(lletra)

    scan.close();



}
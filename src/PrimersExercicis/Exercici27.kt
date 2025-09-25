//Fes un programa que rebi un caràcter de l’abecedari en minúscula i un altre en majúscula i digui si són corresponents.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    // Ingressem les dades i igualem tot amb "lowercase()" per fer la comparació.

    println("Ingressa una lletra en majúscula i una altre en minúscula: ");
    var minus = scan.nextLine().lowercase();
    var majus = scan.nextLine().lowercase();
    var iguals : Boolean = false;

    // Fem la comparació i modifiquem el Boolean si es correcta.

    if (minus == majus){
        iguals = true;

    }

    println(iguals);

    scan.close();


}
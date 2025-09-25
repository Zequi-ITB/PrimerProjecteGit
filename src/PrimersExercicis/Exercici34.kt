package PrimersExercicis

//Escriu un programa que llegeixi un nom d’usuari per l’entrada i imprimeixi una frase de benvinguda.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    println("Ingressa el teu nom: ");
    var nom =scan.nextLine();

    println("Bon dia "+nom+"!")

    scan.close();

}
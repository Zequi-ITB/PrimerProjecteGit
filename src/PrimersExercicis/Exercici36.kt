package PrimersExercicis

//Escriu un programa que llegeixi 3 frases diferents per terminal i en faci 1 història.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    println("Escriu una breu historia en 3 lineas: ");
    var hist1 = scan.nextLine();
    var hist2 = scan.nextLine()
    var hist3 = scan.nextLine();

    println(hist1+" "+hist2+" "+hist3)

    scan.close();

}


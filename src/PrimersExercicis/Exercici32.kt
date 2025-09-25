package PrimersExercicis

//Fes un programa que demani un capital, i calculi quin capital es generarà passat cert temps segons certs interessos (entre 0% i
//100%).

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    println("Ingressa el capital: ")
    var capital : Int = scan.nextInt();
    println("Ingressa els anys: ")
    var anys : Int = scan.nextInt();
    println("Ingressa els interessos per any: ")
    var interessos : Int = scan.nextInt();
    var resultatFinal : Double;

    // Aqui calculem el percentatge d'interessos i fem la suma dels interessos amb el capital en "resultat final".

    interessos = (capital*(interessos * anys))/100;
    resultatFinal = capital.toDouble()+interessos.toDouble();

    println(resultatFinal)

    scan.close();



}
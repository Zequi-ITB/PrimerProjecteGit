package PrimersExercicis

//Fes un programa que, rebuts dos nombres per l’entrada, comprovi si el primer és divisible pel segon.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    println("Ingressa dos números enters: ");
    var num1 = scan.nextInt();
    var num2 = scan.nextInt();
    var divisible : Boolean = false;

    // Posem un condicional amb el mòdul per comprovar si la divisio té residu o no i saber si és divisible o no.

    if (num1%num2==0){
        divisible = true;
    }

    println(divisible);

    scan.close()
}
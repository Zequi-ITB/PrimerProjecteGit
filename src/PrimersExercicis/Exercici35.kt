package PrimersExercicis

//Escriu un programa que imprimeixi targetes de treball. Aquestes han de contenir, nom, cognom i número de despatx de la
//persona treballadora.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    println("Ingressa el teu nom: ");
    var nom = scan.nextLine();
    println("Ingressa el teu cognom: ");
    var cognom = scan.nextLine();
    println("Ingressa el teu despatx: ");
    var despatx = scan.nextInt();

    println("Empleado: "+nom+ " "+cognom+" - Despatx: "+despatx);

    scan.close();
}
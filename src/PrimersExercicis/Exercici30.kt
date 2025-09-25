//Fes un programa que calculi quants minuts, hores i segons hi ha en un número de segons donats.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);

    println("Ingressa els segons: ")
    var num = scan.nextInt();

    var hs : Int;
    var min : Int;
    var segons : Int;

    //Fem els calculs de les hores i despress utilitzem el model per calcular els residus de cada operacio que serien els minuts i segons restants.

    hs = num/3600;
    min = (num%3600)/60;
    segons = (num%3600)%60;

    println ("$hs hora $min minuts $segons segons." );

    scan.close();




}
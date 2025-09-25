//Fes un programa que donats 4 enters ens diguis si hi ha cap que sigui 10.

import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`);
    var cont : Int = 1;
    var igual10 : Boolean = false;

    // Utilitzem el bucle "while" per fer les 4 voltes i comparar amb el número 10 en cada passada.

println("Ingressa 4 números enters: ")
    while(cont<=4){
        var num = scan.nextInt();

        if(num==10){
            igual10 = true;
        }
        cont++;

    }

    println(igual10);

    scan.close();
}
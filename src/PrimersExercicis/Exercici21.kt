//Fes un programa que rebi tres nombres enters i torni si són iguals o no

import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);

    println("Ingressa tres números enters: ");
    var num1 : Int = scan.nextInt();
    var num2 : Int = scan.nextInt();
    var num3 : Int = scan.nextInt();
    var iguals : Boolean = false;

// Aqui fem la comparació dels 3 números amb el operador "&" per que nomes sigui true en cas de complirse totes les condicions.

    if (num1 == num2 && num2 == num3) {
        iguals = true
    }

    println(iguals);

    scan.close();

}
//Escriu un programa que donat dos números retorni la suma d’aquests.
import java.util.Scanner
fun main() {

    val scan : Scanner = Scanner (System.`in`);
    println("Escriu un número: ");
    var num1 : Int = scan.nextInt();
    println("Escriu un altre número: ");
    var num2 : Int = scan.nextInt();

    println("La suma de aquests números es: "+(num1+num2));

    scan.close();

}
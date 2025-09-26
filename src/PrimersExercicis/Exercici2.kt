import java.util.Scanner

//Escriu un programa que llegeixi un número per entrada i imprimeixi el doble del seu valor.
fun main() {
    var scan : Scanner = Scanner(System.`in`);
    println("Escriu un número: ");
    var num : Int = scan.nextInt();

    println("El doble d'aquest número és: "+(num*2));

    scan.close();


}
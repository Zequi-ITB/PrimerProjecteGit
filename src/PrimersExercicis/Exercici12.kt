//  Feu un programa que rebi una temperatura en graus Celsius i la converteixi en graus Fahrenheit

import java.util.Scanner
import java.util.Locale

fun main() {
    var scan : Scanner = Scanner(System.`in`).useLocale(Locale.UK);

    println("Ingressa la temperatura en graus Celsius: ")
    var celcius : Double = scan.nextDouble();
    var fahrenheit : Double;

    // Apliquem la formula per convertir Celcius a Fahrenheit
    fahrenheit = (celcius*9/5)+32;

    println("La temperatura en graus Fahrenheit es: "+fahrenheit);

    scan.close();



}
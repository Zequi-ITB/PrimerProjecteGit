// Fes un programa que resolgui la fórmula d’una equació de segon grau

import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    var scan  = Scanner(System.`in`);

    println("Ingressa tres números enters: ");
    var a = scan.nextDouble();
    var b = scan.nextDouble();
    var c = scan.nextDouble();
    var negatiu : Double;
    var positiu : Double;

    // Fem la fórmula descomposta perquè sigui llegible. Utilitzem "sqrt" per fer la raiz quadrada.

    positiu = ((b*b)-(4*a*c))
    negatiu = ((b*b)-(4*a*c));

    positiu = -b+(sqrt(positiu));
    negatiu = -b-(sqrt(negatiu));

    positiu = positiu/(2*a);
    negatiu = negatiu/(2*a);

    println(positiu)
    println(negatiu)

    scan.close()

}
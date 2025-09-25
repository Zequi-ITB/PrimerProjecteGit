//En una escola tenim tres classes i volem saber quin és el nombre de taules que necessitarem tenir en total. Dependrà del
//nombre d'alumnes per aula. Cal tenir en compte que a cada taula hi caben 2 alumnes.
import java.util.Scanner

fun main() {
    var scan : Scanner = Scanner(System.`in`);


    // Es demanen i es guarden les dades.

    println("Ingressa el numero d'alumnes de la classe 1: ")
    var alumnesGrup1 : Int = scan.nextInt();
    println("Ingressa el numero d'alumnes de la classe 2: ")
    var alumnesGrup2 : Int = scan.nextInt();
    println("Ingressa el numero d'alumnes de la classe 3: ")
    var alumnesGrup3 : Int = scan.nextInt();

    // Es fa el calcul dels pupitres i es suma el modúl.
    var numPupitresGrup1 : Int = (alumnesGrup1 / 2) + (alumnesGrup1 % 2)
    var numPupitresGrup2 : Int = (alumnesGrup2 / 2) + (alumnesGrup2 % 2)
    var numPupitresGrup3 : Int = (alumnesGrup3 / 2) + (alumnesGrup3 % 2)

    // Es fa la suma final de pupitres.
    var numPupitres: Int = numPupitresGrup1 + numPupitresGrup2 + numPupitresGrup3

    println("El nombre necessari de pupitres és: "+numPupitres);


}


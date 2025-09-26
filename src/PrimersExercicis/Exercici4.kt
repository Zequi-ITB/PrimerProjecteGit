import java.util.Scanner

//Una web d'habitatges de lloguer ens ha proposat una ampliació. Volen mostrar l'àrea de les habitacions per llogar. Fes un
//programa que ens ajudi a calcular les dimensions d'una habitació. Llegeix l'amplada i la llargada en metres (enters) i mostra'n
//l'àrea.

fun main() {
    val scan : Scanner = Scanner(System.`in`);

    println("Introdueix els metres d'amplada: ");
    var amplada : Int = scan.nextInt();
    println("Introdueix els metres de llargada: ");
    var llargada : Int = scan.nextInt();

    println("L'area de l'habitacio es: " + (amplada*llargada));

    scan.close();


}
import java.util.Scanner

//A Pol li agraden les pelis, però no li agraden quan ja estan començades un bon tros.
//Ajudem a Pol a decidir si s’ha de quedar a veure una pel·lícula o no.
//La pel·lícula es projecta en sessió contínua des de les 0:00, és a dir, quan acaba torna a començar

//duració → enter que indica els minuts que dura una pel·lícula
//marge → número de minuts, passats els quals, des del començament de la pel·lícula, en Pol considera que no es quedarà.
//hora minuts → enters que indiquen el moment (hora i minut) en que ha arribat en Pol

//VEURE → si en Pol es queda a veure la pel·lícula
//MARXAR → si en Pol considera que ha de marxar, quan arriba la pel·lícula ja està prou començada.

fun main() {
    var scan: Scanner = Scanner(System.`in`);

    //Demanem les dades
    var duracioPelicula: Int = scan.nextInt();
    var marge: Int = scan.nextInt();
    var hora: Int = scan.nextInt(); 7
    var minuts: Int = scan.nextInt();


    // Calculem l'hora en minuts i després sumem els minuts més els minuts de l'hora.
    var horaEnMinuts: Int = hora * 60;
    var minutsTotals: Int = minuts + horaEnMinuts;


    // Comparem si el modul dels minuts totals es menor que el marge i imprimim el resultat.
    // Amb aixo estem calculan quantes vegades hi cap la duracio de la pelicula sencera dins dels minuts total desde les 00:00 fins l'hora indicada.
    // El que sobra de aquest calcul, per tant, son els minuts que estan de mes des-de l'inici de la pelicula, i si son majors al marge, posem "MARXAR"
    if (minutsTotals % duracioPelicula <= marge) {
        println("VEURE")
    } else {
        println("MARXAR")
    }

    scan.close();

}
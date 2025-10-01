import java.util.Scanner



fun main() {

    // Segona version millor comentada i amb variables mes definides.

    var scan: Scanner = Scanner(System.`in`)

// Demanem les dades
    var segons : Int = scan.nextInt();
    var dia : Int = (segons/(24*60*60))+1    // Dividim els segons per el total de segons que te un dia i le sumem 1, perque començem a comptar des-de 1.


    //Fem la comprovacio per veure si es mati o nit.
    if ((segons /43200)%2 != 0) {       // Dividim segons per 43200 que son els segons totals que te 12 hs i fem el modul de 2, si es parell vol dir que es nit en cas contrari, es mati.
        println("nit del dia "+dia)
    }
    else
        print("mati del dia "+dia);

    scan.close();
}

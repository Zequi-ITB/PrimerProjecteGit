import java.util.Scanner

// Dos nens petits discuteixen per qui té l'avi o l'àvia més gran. Ajuda'ls.
// El programa informa amb el nom de l'avi més vell. Si els dos tenen la mateixa edat dirà: "Tenen la mateixa edat".

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem els noms i els numeros, no fem servir bucles perque el exercici es de la categoria "sense bucles"
    var nomAvi1: String = scan.nextLine();
    var edatAvi1: Int = scan.nextInt();
    scan.nextLine()
    var nomAvi2: String = scan.nextLine();
    var edatAvi2: Int = scan.nextInt();

    // Comprovem quin es l'avi mes gran i imprimim el resultat.
    if (edatAvi1 == edatAvi2) {
        println("Tenen la mateixa edat")
    } else
        if (edatAvi1 > edatAvi2) {
            println(nomAvi1)
        } else {
            println(nomAvi2)
        }
    scan.close()
}


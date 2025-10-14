import java.util.Scanner

// Un icónic atac de mag en el WoW es Explosión Arcana.
// Aquest atac comença fent poc mal, pero cada cop que el fas servir fa un 100% més de mal.
// Per exemple, si el primer cop fa 100 punts de mal, el següent farà 200, el següent 300, el següent 400, i així fins que passa un temps.

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem les dades
    var dany: Int = scan.nextInt();
    var vidaEnemic: Int = scan.nextInt();

    // Declarem variables necessaries per fer comptabilitzar els cops.
    var cops: Int = 1;

    // Calculem quants cops fan falta per matar a l'enemic.
    while (vidaEnemic > 0) {
        vidaEnemic -= dany*cops
        cops++;
    }

// Imprimim la quantitat de cops.
    println(cops)

    scan.close()
}



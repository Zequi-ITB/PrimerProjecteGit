// Jordi While() és un streamer famós. Com tots els streamers,
// el que més por li fa es que l'hi posin 3 strikes a la compta, perquè aleshores li tancarien.
//Per cada cas de prova caldrà respondre: Quants videos ha fet jordi fins a rebre el tercer strike (sense comptar els vídeos amb strike)


import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`);

    // Fem el bucle do-while per que acabi al tercer strike.
    var strike: Int = 0;
    var videos: Int = 0;

    do {
        var num: Int = scan.nextInt();

        // Comprovem si es un strike o un video.
        if (num == -1) {
            strike++;
        } else {
            videos++;
        }
    } while (strike != 3)

    // Imprimim el resultat.
    println(videos)

    scan.close();
}






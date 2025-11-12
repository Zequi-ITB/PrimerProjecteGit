import java.util.Scanner

//Un es podria pensar que els fantasmes de pacman només volen sortir de la seva àrea al centre del taulell per a menjar-se a pacman.
// Res més allunyat de la veritat, els fantasmes són casolans i tan sols volen estar caminant dintre de la casa comuna.
// No obstant, a vegades al estar tots a casa es bloquejen entre ells, i un fantasma bloquejat pot dur a conseqüències funestes...

//Per cada cas de prova caldrà respondre:
//Si el fantasma blau no es pot moure (té bloquejades les sortides amunt, avall, esquerra i dreta, per una paret o un altre fantasma) s’escriura “OH NO”
//Si el fantasma blau es pot moure (com a mínim no te bloquejada la sortida amunt, avall, esquerra o dreta) s’escriura “THIS IS FINE”

fun main() {
    val scan: Scanner = Scanner(System.`in`)

    //Demanem la quantitat de casos de prova
    var casos: Int = scan.nextInt()

    repeat(casos) {

        //Demanem filas i columnes (com a minim 3)
        var filas: Int = scan.nextInt()
        var columnes: Int = scan.nextInt()

        // Demanem le nombre de fantasmas que hi ha (minim 1)
        var quantitatFantasmes: Int = scan.nextInt()

        // Fem la matriu amb les dimensions indicadas
        var matriu: MutableList<MutableList<Int>> = mutableListOf()

        // Demanem dins d'un bucle les dades.
        repeat(filas) {
            var llistat: MutableList<Int> = MutableList(columnes) { 0 }
            matriu.add(llistat)
        }

        // Demanem les coordenades del fantasma blau
        var coordenadasFantasmaBlau_Y: Int = scan.nextInt()
        var coordenadasFantasmaBlau_X: Int = scan.nextInt()

        // Demanem les coordenades dels altres fantasmes i els afegim com "1" dins de la matriu.
        repeat(quantitatFantasmes - 1) {
            var coodernadaY: Int = scan.nextInt()
            var coodernadaX: Int = scan.nextInt()
            matriu[coodernadaY][coodernadaX] = 1
        }

        // Declarem un boolean per portar control de si es el nostre fantasma es por moure.
        var esPotMoure: Boolean = false

        // Comprovem si el fantasma es pot moure i imprimim el resultat.
        // Comprobem a la dreta
        if (matriu[coordenadasFantasmaBlau_Y][coordenadasFantasmaBlau_X + 1] == 0 && coordenadasFantasmaBlau_X + 1 != (columnes - 1)) {
            esPotMoure = true

            //Comprovem a la esquera
        } else if (matriu[coordenadasFantasmaBlau_Y][coordenadasFantasmaBlau_X - 1] == 0 && coordenadasFantasmaBlau_X - 1 != 0) {
            esPotMoure = true

            // Comproven amunt
        } else if (matriu[coordenadasFantasmaBlau_Y + 1][coordenadasFantasmaBlau_X] == 0 && coordenadasFantasmaBlau_Y + 1 != filas - 1) {
            esPotMoure = true

            //Comprovem a sota
        } else if (matriu[coordenadasFantasmaBlau_Y - 1][coordenadasFantasmaBlau_X] == 0 && coordenadasFantasmaBlau_Y - 1 != 0) {
            esPotMoure = true
        }

        // Imprimim el resultat.
        if (esPotMoure) {
            println("THIS IS FINE")
        } else {
            println("OH NO")
        }
    }
    scan.close()

}
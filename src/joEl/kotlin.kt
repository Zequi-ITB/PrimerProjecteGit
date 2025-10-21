import java.util.Scanner

// Un eclipsi solar es produeix quan la lluna s'interposa al camí de la llum del sol i projecta la seva ombra a la Terra.
//Aquest eclipsi total es produeix aproximadament cada any i mig en algun lloc de la Terra. Un eclipsi parcial, quan la lluna no recobreix completament el sol, es produeix almenys dues vegades per any, en algun lloc de la Terra.
//Acordem que per aquest problema:
//1 any: 365 dies
//Eclipsi Parcial cada ½ any: 183 dies (per fer-ho rodó)
//Eclipsi Total cada 1 any i mig: 548 dies


fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos a evaluar.
    var casos: Int = scan.nextInt();

    // Declarem variables per fer calculs i de control.
    var diesEclipsiTotal: Int = 548;
    var diesEclipsiParcial: Int = 183;
    var eclipsiTotal: Boolean = false;

    // Fem un bucle amb la quantitat de casos a evaluar per demanar les dades al usuari.
    repeat(casos) {
        var dies: Int = scan.nextInt();
        var diesRestants: Int = 0;
        if (dies % diesEclipsiTotal == 0) {
            println("TOTAL " + diesRestants)
        } else if (dies % diesEclipsiParcial == 0) {
            println("PARCIAL " + diesRestants)
        } else {
            if ((diesEclipsiTotal - dies % diesEclipsiTotal) < (diesEclipsiParcial - dies % diesEclipsiParcial)) {
                diesRestants = diesEclipsiTotal - (dies % diesEclipsiTotal)
            } else {
                diesRestants = diesEclipsiParcial - (dies % diesEclipsiParcial)

            }
            if (eclipsiTotal) {
                println("NO TOTAL $diesRestants")
            } else {
                println("NO PARCIAL $diesRestants")
            }
        }
    }

    scan.close()
}
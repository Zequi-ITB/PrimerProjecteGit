package joEl

//En un joc 2D el punt (0,0) és l’origen del món i les coordenades (x,y) de qualsevol objecte situat en aquest món
// poden ser positives o negatives. Segons el signe de les coordenades l’objecte es troba en el quadrant 1, 2, 3 o 4.

//Fes un programa que donades les coordenades x i y del centre d’un enemic i que digui a quin quadrant es troba.
// ATENCIÓ: Si una de les coordenades val 0, llavors l’enemic es troba en DOS QUADRANTS.
// Si les coordenades són 0,0, llavors es troba al centre. Cal indicar-ho correctament a l’usuari.

import java.util.Scanner

fun main() {
    val SCAN = Scanner(System.`in`);

    // Demanem les dades.
    var coordenadaX = SCAN.nextInt();
    var coordenadaY = SCAN.nextInt();
    var quadrantsX: String = "";
    var quadrantsY: String = "";
    var quadrants: String = "";

    //Fem les comparacions per saber en què quadrant es troba l'enemic.
    if (coordenadaX == 0 && coordenadaY == 0) {
        quadrants = "1,2,3,4"
    } else if (coordenadaX == 0) {
        quadrantsX = "1,2"
    } else if (coordenadaX > 0) {
        quadrantsX = "1"
    } else if (coordenadaX < 0) {
        quadrantsX = "2"
    }

    if (coordenadaX == 0 && coordenadaY == 0) {
        quadrants = "1,2,3,4"
    } else if (coordenadaX == 0) {
        quadrantsX = "1,2"
    } else if (coordenadaX > 0) {
        quadrantsX = "1"
    } else if (coordenadaX < 0) {
        quadrantsX = "2"
    }


    if (coordenadaX == 0) {
        quadrantsX = "1,2"
    } else if (coordenadaX > 0) {
        quadrantsX = "1"
    } else if (coordenadaX < 0) {
        quadrantsX = "2"
    }


    // Imprimim el resultat.

}
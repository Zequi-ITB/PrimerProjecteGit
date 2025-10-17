import java.util.Scanner

// El tió és un tronc màgic que ens caga regals la nit de Nadal mentre l'apallisem a cops de bastó i cantem la cançoneta
// "Caga tió! Tió de Nadal No caguis arengades que son salades..."
//La cançó en qüestió ha tret protagonisme al propi tió de tal forma que se li ha començat a dir "cagatió" donant peu a que sorgeixi la polèmica.
// I tu com li dius, "tió" o "cagatió"?
//El nom correcte és "tió" i, si no aturem aquesta tendència, la propera generació cantarà "Caga cagatió!..."
// i la seguent li dirà "cagacagatió" i la següent cantarà "Caga cagacagatió!...", amb la qual cosa és molt probable que es perdi la tradició perquè ningú no entendrà res.

// Per a cada cas cal indicar el primer vers de la cançó que farà servir aquella generació per fer cagar el tió.
// Per evitar problemes no farem servir tildes i escriurem "tio" en comptes de "tió".

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos a evaluar.
    var casos: Int = scan.nextInt();

    // Fem un bucle per demanar les generacions segons la quantitat de casos.
    repeat(casos) {
        var generacions: Int = scan.nextInt();
        var cagaTio: String = "Caga ";

        // Fem un bucle que sumi de 2 en 2 per afegir la paraula "caga" a la string.
        // Començem des-de el 3 perque en 1 i 2 no fa falta que afageixi res a la string.
        for (i in 3..generacions step 2) {
            cagaTio += "caga"
        }

        // Imprimim el resultat
        println(cagaTio + "tio!")
    }

    scan.close()
}



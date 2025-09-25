package PrimersExercicis

import java.time.LocalDate

//Després de molt d'esforç hem aconseguit dissenyar una màquina del temps. Només ens falta una utilitat, necessitem un petit
//programa que ens indiqui en quin dia estem. Fes un programa que imprimeixi per pantalla el següent missatge Avui és: 2021-
//09-17.

fun main() {
    var data = LocalDate.now();
    println("Avui és "+ data);


}
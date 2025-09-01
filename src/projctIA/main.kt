package projctIA

fun main() {
    val miLeon = Leon("Simba")
    val miAguila = Aguila("Sky")

    println("--- Zona Terrestre ---")
    println("León:")
    println("Hábitat: ${miLeon.habitat}")
    miLeon.moverse()
    miLeon.emitirSonido()

    println("\nÁguila:")
    println("Hábitat: ${miAguila.habitat}")
    miAguila.moverse()
    miAguila.emitirSonido()
}
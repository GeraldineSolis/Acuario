package projctIA

interface Accion {
    fun moverse()
    fun emitirSonido()
}

class Leon(nombre: String) : Animal(nombre), Accion {
    override val habitat: String = "sabana"

    override fun moverse() {
        println("El león $nombre camina majestuosamente.")
    }

    override fun emitirSonido() {
        println("El león $nombre ruge.")
    }
}

class Aguila(nombre: String) : Animal(nombre), Accion {
    override val habitat: String = "montañas"

    override fun moverse() {
        println("El águila $nombre vuela en círculos.")
    }

    override fun emitirSonido() {
        println("El águila $nombre emite un chillido.")
    }
}
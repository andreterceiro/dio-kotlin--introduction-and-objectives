package tests

fun main() {
    log(message = "Mensagem de log", prefix = "Info")
}

fun log(message: String, prefix: String) {
    println("[$prefix]: $message")
}
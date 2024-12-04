package tests

fun main() {
    log(message = "Mensagem de log", prefix = "Info")
}

fun log(message, prefix) {
    println("[$prefix]: $message")
    return 0
}
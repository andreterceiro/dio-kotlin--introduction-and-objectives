package tests

fun main() {
    p("test")
}

fun p(message: String, level: String = "info") {
    println("[$level]: $message")
}
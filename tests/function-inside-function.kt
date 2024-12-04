package tests

fun main() {
    fun p1(message: String) {
        print(message)

        fun p2(message: String) {
            println(message)
        }
        p2(" <<<<<<<<<<<<<<<<<<")
    }
    p1("Hello, World!")
    p1(p2("###############"))
}
package tests

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun pop() = elements.removeAt(elements.size - 1)

    override fun toString(): String = "Mutable stack (${elements.joinToString()})"
}


fun main() {
    var integersStack = MutableStack(1, 2, 3)
    print(integersStack)
    print("\n")
    
    integersStack.pop()
    println(integersStack)
    print("\n")    
    
    integersStack.pop()
    print(integersStack)
}

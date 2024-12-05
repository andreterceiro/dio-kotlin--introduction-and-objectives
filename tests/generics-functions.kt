package tests

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun pop() = elements.removeAt(elements.size - 1)

    override fun toString(): String = "Mutable stack (${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val integersStack = mutableStackOf(1, 2, 3)
    println(integersStack)
    
    integersStack.pop()
    println(integersStack)
    
    integersStack.pop()
    println(integersStack)
    
    val stringStack = mutableStackOf("A", "B", "C")
    
    println(stringStack)
    
    stringStack.pop()
    println(stringStack)
    
    stringStack.pop()
    print(stringStack)
    
}
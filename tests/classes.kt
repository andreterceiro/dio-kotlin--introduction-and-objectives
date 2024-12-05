package tests

class Customer(val id, var name)

fun main() {
    var customer = Customer(1, "João")
    print(customer.id)
}
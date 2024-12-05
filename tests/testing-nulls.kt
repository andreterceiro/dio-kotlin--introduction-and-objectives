package tests

fun main() {
    var a:String = "banana"
    print(a)
    a = null //<= Error if you try to assign null to a non-nullable variable
}
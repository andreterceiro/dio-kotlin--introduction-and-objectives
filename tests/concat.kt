package tests
/**
 * If you generate the ".jar" file with k.php, please execute the following command
 * in the generated jar file ("hello" and "world" are examples of parameters to concat)
 * java -jar concat.jar hello world
 * 
 * The command of the above line will print:
 * hello world
 */
fun main(args:Array<String>): Unit {
    println(args[0] + " " + args[1])
}

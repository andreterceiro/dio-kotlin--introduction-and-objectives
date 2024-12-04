package tests
/**
 * If you execute this script with k.php (please see README.md), please
 * execute the .jar file manually. Command:
 * java -jar hello-world-accepting-arg.jar word-to-dispay
 * 
 * The command above will output (after generating the .jar file)
 * Hello world word-to-display
 */ 
fun main(args: Array<String>) {
    print("Hello world " + args[0])
}
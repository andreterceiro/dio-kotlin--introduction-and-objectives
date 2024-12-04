# Introuction

As you can see in my [version of Jankenpo in Kotlin](https://github.com/andreterceiro/jankenpo-kotlin), I generate the **.jar**  file based on **.kt** file in 1 step and execute this **.jar** file in another step. Then I created this PHP script to make the process more easy:

```php
#!/usr/bin/php
<?php
exec("kotlinc -include-runtime ${argv[1]}.kt -d ${argv[1]}.jar");
echo exec("java -jar ${argv[1]}.jar") . "\n";
```

I named this script as **k.php** and gave a `chmod +x` on it. as you can see in the previous script, you don't need to provide the extension **.kt** to use it. as it have a shebang in the first line, you can execute it to see the output of index.kt (example) this way:

```
k.php index
```

Observation: the directory of this script is on the PATH environment variable of my system.


## Tests

I will create some files related who is teached in the videos in the "tests" directory.


## Comments about the tests and the videos

- The functions **print()** and **println()** are available.
- You can define a package without relation with the directory structure. In the next example, the directory of the file is "tests":
```Kotlin
package banana

fun main() {
    print("Hello world")
}
```

In Kotlin you can specify the return of a function, do not specify, and when specify, you can define that the return is "Unit" (whatever). If you do not define, is the same as define as "Unit". Please see the examples in the directory "tests".

You can specify a default value of a function parameter this way (example):
```kotlin
package tests

fun p(message: String, level: String = "info") {
    print("[$level] $message");
}
```

In the previous example you can see also how to interpolate varibles and strings.
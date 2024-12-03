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
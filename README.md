# Minimal example to demonstrate error when using Lombok with IntelliJ ErrorProne plugin

```
IntelliJ IDEA 2024.2.0.2 (Ultimate Edition)
Build #IU-242.20224.419, built on August 19, 2024
Runtime version: 21.0.3+13-b509.4 amd64 (JCEF 122.1.9)
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
Toolkit: sun.awt.windows.WToolkit
Windows 11.0
GC: G1 Young Generation, G1 Concurrent GC, G1 Old Generation
Memory: 2048M
Cores: 8
Registry:
ide.experimental.ui=true
Non-Bundled Plugins:
com.intellij.ml.llm (242.20224.424)
com.haulmont.jpab (242.20224.300)
com.jetbrains.space (242.20224.155)
Error-prone plugin (242.20224.159)
Kotlin: 242.20224.419-IJ
```

- From https://errorprone.info/docs/installation
    - To add the plugin, start the IDE and find the Plugins dialog. Browse Repositories, choose Category: Build, and find the Error-prone plugin. Right-click and choose “Download and install”. The IDE will restart after you’ve exited these dialogs.
    - To enable Error Prone, choose Settings | Compiler | Java Compiler | Use compiler: Javac with error-prone and also make sure Settings | Compiler | Use external build is NOT selected.

- `Build` menu -> `Rebuild Project`
## Expected behaviour:
- Both Lombok and ErrorProne work, resulting in ErrorProne flagging an error in ShortSet on the line ` s.remove(i - 1);`

## Actual behaviour:
- Lombok does not work resulting in a compile error on `log.debug("Processing i={}", i);`:
```
java: cannot find symbol
  symbol:   variable log
  location: class org.example.ShortSet
```
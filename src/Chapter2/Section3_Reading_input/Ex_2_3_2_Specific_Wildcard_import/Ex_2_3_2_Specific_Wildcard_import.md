2.3.2 Are there any performance differences between the following two import  statements?
-
```Java
import java.util.Scanner;
import java.util.*;
```
No differences in performance, since the import statement simply tells the compiler
where to locate the classes.

In fact, the information for the classes in an imported package is not read in at compile time or
runtime unless the class is used in the program.

Therefore, the difference is in the information for the user of the class, not in performance.
2.3.1 How do you write a statement to let the user enter a double value from the keyboard? What happens if you entered 5a when executing the following code?
-
```Java
double radius = input.nextDouble();
```

Answer:
```Java
import java.util.Scanner;

// Other code..

Scanner input = new Scanner(System.in);
```

Runtime error if we input 5a instead of a double
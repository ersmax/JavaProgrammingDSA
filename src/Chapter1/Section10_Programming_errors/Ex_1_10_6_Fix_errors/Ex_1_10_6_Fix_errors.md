1.10.6 Identify and fix the errors in the following code:
---
```Java
public class Welcome {
    public void Main(String[] args) {
        System.out.println('Welcome to Java!);
    }
)
```
Fixed version:
```Java
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");
    }
}
```
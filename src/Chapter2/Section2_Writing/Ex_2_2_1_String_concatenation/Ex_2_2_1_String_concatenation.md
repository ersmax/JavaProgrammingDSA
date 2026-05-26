2.2.1 Identify and fix the errors in the following code:
-
```Java
public class Test {
    public void main(string[] args) {
        double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;
        System.out.println("j is " + j + " and
                            k is " + k);
    }
}
```
Corrected version:
```Java
public class Test {
    public static void main(String[] args) {
        double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;
        System.out.println("j is " + j + " and " +
                            "k is " + k);
    }
}
```
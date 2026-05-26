2.6.1 Identify and fix the errors in the following code:
-
```Java
public class Test {
    public static void main(String[] args) {
        int i = j = k = 2;
        System.out.println(i + " " + j + " " + k);
    }
}
```
int i = j = k = 2;
The statement only declares i.

Corrected version:
```Java
public class Test {
    public static void main(String[] args) {
        int j, k;
        int i = j = k = 2;
        System.out.println(i + " " + j + " " + k);
    }
}
```
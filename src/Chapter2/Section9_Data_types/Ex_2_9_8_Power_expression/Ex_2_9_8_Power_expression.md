2.9.8 Suppose m and r are integers. Write a Java expression for mr^2 to obtain a floating-point result.
-
```Java
int m = 1, r = 2;
double result = 1.0 * m * Math.pow(r, 2);
```

or simply:
```Java
int m = 1, r = 2;
double result = m * Math.pow(r, 2);
```
because Math.pow returns a double.
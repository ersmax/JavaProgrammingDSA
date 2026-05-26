2.7.2 Translate the following algorithm into Java code:
-
1) Step 1: Declare a double variable named miles with an initial value 100. 
2) Step 2: Declare a double constant named KILOMETERS_PER_MILE with value  1.609. 
3) Step 3: Declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE, and assign the result to kilometers. 
4) Step 4: Display kilometers to the console.

What is kilometers after Step 4?

```Java
public class Distance {
    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println(kilometers);
    }
}
```

The value of kilometers is 160.9
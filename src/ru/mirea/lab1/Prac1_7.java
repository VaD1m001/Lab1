package ru.mirea.lab1;
public class Prac1_7 {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть >= 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            System.out.printf("%d! = %d%n", n, factorial(n));
        }
    }
}
package ru.mirea.lab1;
public class Prac1_6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        System.out.printf("%-4s %-12s%n", "n", "H(n)");
        System.out.println("------------------");

        double sum = 0.0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
            System.out.printf("%-4d %-12.6f%n", i, sum);
        }
    }
}
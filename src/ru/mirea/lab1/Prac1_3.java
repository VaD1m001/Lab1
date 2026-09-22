package ru.mirea.lab1;
public class Prac1_3 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 3, 20, 7, 15};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;

        System.out.println("Сумма элементов: " + sum);
        System.out.printf("Среднее арифметическое: %.2f%n", avg);
    }
}

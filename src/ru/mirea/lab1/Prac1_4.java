package ru.mirea.lab1;

import java.util.Scanner;

public class Prac1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Введите размер массива (> 0): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: размер массива должен быть больше 0. Попробуйте снова.");
                }
            } else {
                System.out.println("Ошибка: введено не целое число. Попробуйте снова.");
                sc.next();
            }
        }

        int[] arr = new int[n];
        System.out.println("Введите " + n + " целых числа:");
        for (int idx = 0; idx < n; idx++) {
            while (true) {
                System.out.print("Элемент [" + idx + "]: ");
                if (sc.hasNextInt()) {
                    arr[idx] = sc.nextInt();
                    break;
                } else {
                    System.out.println("Ошибка: введено не целое число. Попробуйте снова.");
                    sc.next();
                }
            }
        }
        int sumWhile = 0, i = 0;
        while (i < arr.length) {
            sumWhile += arr[i];
            i++;
        }
        System.out.println("Сумма (while): " + sumWhile);

        int sumDoWhile = 0, j = 0;
        do {
            sumDoWhile += arr[j];
            j++;
        } while (j < arr.length);
        System.out.println("Сумма (do-while): " + sumDoWhile);

        int min = arr[0], max = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] < min) min = arr[k];
            if (arr[k] > max) max = arr[k];
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

        sc.close();
    }
}
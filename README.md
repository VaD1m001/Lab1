# Практическая работа №1
## Задание 3. Написать программу, в результате которой массив чисел создается с помощью инициализации (как в Си) вводится и считается в цикле сумма элементов целочисленного массива, а также среднее арифметическое его элементов результат выводится на экран. Использовать цикл for.
```java
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
```
## Задание 4. Написать программу, в результате которой массив чисел вводится пользователем с клавиатуры считается сумма элементов целочисленного массива с помощью циклов do while, while, также необходимо найти максимальный и минимальный элемент в массиве, результат выводится на экран.
```java
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

```
## Задание 5. Написать программу, в результате которой выводятся на экран аргументы командной строки в цикле for.
```java
package ru.mirea.lab1;
public class Prac1_5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы командной строки не переданы.");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент[" + i + "] = " + args[i]);
        }
    }
}
```
## Задание 6. Написать программу, в результате работы которой выводятся на экран первые 10 чисел гармонического ряда (форматировать вывод).
```java
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

```
## Задание 7. Написать программу, которая с помощью метода класса, вычисляет факториал числа (использовать управляющую конструкцию цикла), проверить работу метода.
```java
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
```

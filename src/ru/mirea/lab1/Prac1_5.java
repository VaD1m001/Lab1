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
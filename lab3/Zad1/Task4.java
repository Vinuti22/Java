package lab3.Zad1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int input = sc.nextInt();
        int square = input * input;
        System.out.println("Квадрат вашего числа равен: " + square);
    }
}
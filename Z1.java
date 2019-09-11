//Треугольник задан координатами своих вершин. Написать метод для вычисления его площади

package by.epam.jb29.task04;

import java.util.Scanner;

public class Z1 {

    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x1: ");
        x1 = sc.nextDouble();
        System.out.println("Введите значение y1: ");
        y1 = sc.nextDouble();
        System.out.println("Введите значение x2: ");
        x2 = sc.nextDouble();
        System.out.println("Введите значение y2: ");
        y2 = sc.nextDouble();
        System.out.println("Введите значение x3: ");
        x3 = sc.nextDouble();
        System.out.println("Введите значение y3: ");
        y3 = sc.nextDouble();

      Z1.S(x1, y1, x2, y2, x3, y3);
    }

    private static void S (double x1, double y1, double x2, double y2, double x3, double y3){
        double a, b, c, P, S, p;
        a = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        b = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
        c = Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
        p = (a + b + c) / 2;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Площадь треугольника равна: %.2f", S);
    }
}

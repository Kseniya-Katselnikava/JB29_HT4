//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
// треугольника
package by.epam.jb29.task04;

import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону шестиугольника а");
        a = sc.nextDouble();
        square(a);
    }

    public static void square (double a) {
        double S = 6 * ((Math.pow(a, 2) * Math.sqrt(3)) / 4);
        System.out.printf("Площадь треугольника равна: %.3f", S);
    }
}

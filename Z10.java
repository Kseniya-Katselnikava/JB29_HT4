//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
package by.epam.jb29.task04;

public class Z10 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 9; i+=2) {
            sum += fact(i);
        }
        System.out.println(sum);
    }

    public static int fact (int i) {
        int fact = 1;

        for (int x = 1; x <= i; x++) {
            fact *= x;
        }
        return fact;
    }
}

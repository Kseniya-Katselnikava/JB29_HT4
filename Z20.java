//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
package by.epam.jb29.task04;

import java.util.Scanner;

public class Z20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числo: ");
        int n = sc.nextInt();
        int count = 0;

        while (n != 0) {
            n -= sum(n);
            count++;
        }
        System.out.println(count);
    }
    public static int sum (int n) {
        int sum = 0;
        int dig;

        while (n != 0) {
            dig = n % 10;
            sum += dig;
            n /= 10;
        }
        return sum;
    }
}

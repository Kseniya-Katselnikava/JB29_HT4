//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//        возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//        использовать декомпозицию.
package by.epam.jb29.task04;

public class Z17 {
    public static void main(String[] args) {
        int sum;
        int k = 1000000;

        for (int x = 1; x <= k; x++) {
             String count = Integer.toString(x);
             sum = armstr(x, count);

            if (x == sum) {
                System.out.println(x);
            }
        }
    }

    public static int armstr (int x, String count) {
        int sum = 0;
        double dig;
        while (x != 0) {
            dig = x % 10;
            sum += Math.pow(dig, count.length());
            x /= 10;
        }
        return sum;
    }
}

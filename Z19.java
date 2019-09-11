//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//        Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать
//        декомпозицию.
package by.epam.jb29.task04;

import java.util.Scanner;

public class Z19 {
    public static void main(String[] args) {
        boolean flag;
        int sum = 0;
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n - количество знаков в числе");
        int n = sc.nextInt();

        for (int x = (int)Math.pow(10, n - 1 ); x < (int)Math.pow(10, n); x++) {
            flag = neChet(x);
            if (flag) {
                sum += x;
            }
        }
        count = Chet(sum);

        System.out.println("Сумма чисел, содержащих только нечетный цифры равна: " + sum);
        System.out.println("Количество четных цифр в найденной сумме равны: " + count);
    }

    public static boolean neChet (int x) {
        boolean flag = true;
        int dig;

        while (x != 0) {
            dig = x % 10;
            if (dig % 2 != 0) {
                x /= 10;
            }
          else {
              flag = false;
              break;
            }
        }
        return flag;
    }

    public static int Chet (int sum) {
        int count = 0;
        int dig;

        while (sum != 0) {
            dig = sum % 10;
            if (dig % 2 == 0) {
                count++;
            }
            sum /= 10;
         }
        return count;
    }
}


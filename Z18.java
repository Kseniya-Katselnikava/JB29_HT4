//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//        последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
package by.epam.jb29.task04;

import java.util.Scanner;

public class Z18 {
    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n - количество знаков в числе");
        int n = sc.nextInt();

        for (int x = (int)Math.pow(10, n - 1 ); x < (int)Math.pow(10, n); x++) {
            flag = posled(x);
            if (flag) {
                System.out.println(x);
            }
        }
    }

    public static boolean posled (int x) {
        boolean flag = true;
        int k = x;
        int buf = k;
        int dig;
        while (x != 0){
            dig = x % 10;
            if (buf != k) {
                if (dig + 1 == buf) {
                    buf = dig;
                    x /= 10;
                } else {
                    flag = false;
                    break;
                }
            }
            else {
                buf = dig;
                x /= 10;
                }
        }
        return flag;
    }
}

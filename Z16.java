//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и
//        43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше
//        2. Для решения задачи использовать декомпозицию.
package by.epam.jb29.task04;

import java.util.Scanner;

public class Z16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n больше 2");
        int n = sc.nextInt();

        if (n > 2) {
            System.out.println("Числа  - «близнецы»: ");
            digit_Twins(n);
        }
        else{
            System.out.println("n должно быть больше 2");
        }
    }
    public static void digit_Twins (int n) {
        for (int x = n; x < 2 * n; x+=2) {
            System.out.print(x);
            x += 2;
            System.out.print(" " + x);
            System.out.println();
            x -= 2;
        }
    }
}

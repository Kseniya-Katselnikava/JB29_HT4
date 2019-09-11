//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
package by.epam.jb29.task04;

public class Z9 {
    public static void main(String[] args) {
        int a = 7;
        int b = 25;
        int c = 45;
        boolean flag;

        flag = method(a, b, c);
        result(flag);
    }

    public static boolean method (int a, int b, int c) {
        boolean fl = true;
        for (int i = 2; a > b && a > c ? i < a : b > c ? i < b : i < c; i++) {
            if (a >= i) {
                if (a % i == 0 && b % i == 0 || a % i == 0 && c % i == 0 || b % i == 0 && c % i == 0) {
                    fl = false;
                    break;
                }
            }
            else if (b >= i || c >= i) {
                if (b % i == 0 && c % i == 0) {
                    fl = false;
                    break;
                }
            }
        }
        return fl;
    }

    public static void result (boolean flag) {
        if (flag) {
            System.out.println("Числа являются взаимно простыми");
        }
        else {
            System.out.println("Числа не являются взаимно простыми");
        }
    }
}

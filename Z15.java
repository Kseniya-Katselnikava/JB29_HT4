//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
//        которого являются числа, сумма цифр которых равна К и которые не большее N.
package by.epam.jb29.task04;

public class Z15 {
    public static void main(String[] args) {
        int K = 6;
        int N = 100;
        int count;
        int[] A;

        count = size(K, N);
        A = new int[count];

        arr(A, K, N);
        show(A);
    }

    public static int size (int K, int N) {
        int count = 0;
        int sum = 0;
        int dig;
        for (int x = 1; x < N; x++) {
            int x1 = x;

            while (x1 != 0) {
                dig = x1 % 10;
                sum += dig;
                x1 /= 10;
            }

            if (sum == K) {
                count++;
            }
            sum = 0;
        }
        return count;
    }

    public static void arr (int [] A, int K, int N) {
        int sum = 0;
        int dig;
        int count = 0;

        for (int x = 1; x < N; x++) {
            int x1 = x;

            while (x1 != 0) {
                dig = x1 % 10;
                sum += dig;
                x1 /= 10;
            }

            if (sum == K) {
                count++;
                A [count - 1] = x;
            }
            sum = 0;
        }
    }

    public static void show (int [] arr) {
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + "\t");
        }
    }
}

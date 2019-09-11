//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//        Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
//        элементов массива с номерами от k до m.
package by.epam.jb29.task04;

import java.util.Random;

public class Z11 {
    public static void main(String[] args) {
        int size = 7;
        int [] arr = new int[size];
        Random ran = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n-----------------------------------------");
        show(arr);
    }

    public static void show(int [] arr){
        int sum = 0;
        int k;
        int m = 2;

        for (k = 0; k <= m && k < arr.length; k++ ){

            sum += arr[k];

            if (k == m) {
                k--;
                m += 2;
                System.out.println("Сумма элементов равна: " + sum);
                sum = 0;
            }
        }
    }
}


//Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
package by.epam.jb29.task04;

import java.util.Random;

public class Z5 {
       public static void main(String[] args) {

       int min, max, sum;
       int [] arr = new int[3];
        Random ran = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr [i] = ran.nextInt(40);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        min = Z5.min_znach(arr);
        max = Z5.max_znach(arr);
        sum = min + max;
        System.out.println("Сумма большего и меньшего числа равна: " + sum);

    }

    public static int min_znach (int [] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr [i]) {
                min = arr [i];
                }
            }
//        System.out.println(min);
        return min;
        }

    public static int max_znach (int [] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr [i]) {
                max = arr [i];
            }
        }
//        System.out.println(max);
        return max;
    }
}




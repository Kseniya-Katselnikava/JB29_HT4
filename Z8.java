//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать
//        число, которое меньше максимального элемента массива, но больше всех других элементов).
package by.epam.jb29.task04;

import java.util.Random;

public class Z8 {
    public static void main(String[] args) {
        int max;
        int[] arr = new int[4];
        Random ran = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(40);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        max = max_znach(arr);
        max_znach2(arr, max);
    }

    public static int max_znach(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public static void max_znach2(int[] arr, int max) {
        int max1 = 0;

        for (int i = 0; i < arr.length; i++) {
                if (max1 < arr[i] && arr[i] < max) {
                    max1 = arr[i];
                }
            }
            System.out.println(max1);
        }
    }



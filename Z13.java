//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//        являются цифры числа N.
package by.epam.jb29.task04;

import javax.swing.text.html.parser.Parser;

public class Z13 {
    public static void main(String[] args) {
        int N = 359632;
        String size = Integer.toString(N);
        int [] arr = new int[size.length()];
        array(arr, N);
        show(arr);
    }

    public static void array (int [] arr, int N) {
       for (int x = arr.length - 1; x >= 0; x--) {
           arr [x] = N % 10;
           N /= 10;
       }
    }

    public static void show (int [] arr) {
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr [x] + "\t");
        }
    }
}

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
package by.epam.jb29.task04;

public class Z14 {
    public static void main(String[] args) {
        int a = 145872;
        int b = 369857412;
        int size_a;
        int size_b;

        size_a = size(a);
        size_b = size(b);
        compare(size_a, size_b);
    }

    public static int size (int x) {
        String size = Integer.toString(x);
        return size.length();
    }

    public static void compare (int size_a, int size_b) {
      if (size_a > size_b) {
          System.out.println("В числе а цифр больше, чем в b.");
      }
      else{
          System.out.println("В числе b цифр больше, чем в a.");
      }
    }
}

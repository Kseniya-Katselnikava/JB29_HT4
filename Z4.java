//Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
package by.epam.jb29.task04;

public class Z4 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int nok;

        num1 = 17;
        num2 = 66;
        num3 = 14;

        nok = findNod (num1, num2, num3);

        System.out.println("Наименьшее общее кратное равно: " + nok);

    }

    public static int findNod (int num1, int num2, int num3){
        int nok;

        if (num1 > num2 && num1 > num3) {
            nok = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            nok = num2;
        }
        else {
            nok = num3;
        }
        while (nok % num1 !=0 || nok % num2 != 0 || nok % num3 != 0) {
            nok++;
        }
        return nok;
    }
}

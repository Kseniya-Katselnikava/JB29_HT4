//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
package by.epam.jb29.task04;

public class Z3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int nod;

        num1 = 3000;
        num2 = 5250;
        num3 = 8250;
        num4 = 1250;

        nod = findNod (num1, num2, num3, num4);
        System.out.println(nod);
    }

    public static int findNod (int num1, int num2, int num3, int num4){
        int nod;

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            nod = num1;
        }
        else if (num2 > num1 && num2 > num3 && num2 > num4){
            nod = num2;
        }
        else if (num3 > num1 && num3 > num2 && num3 > num4){
            nod = num3;
        }
        else {
            nod = num4;
        }

        while (num1 % nod !=0 || num2 % nod != 0 || num3 % nod != 0 || num4 % nod != 0) {
            nod--;
        }
        return nod;
    }
}

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
//        двух натуральных чисел:

package by.epam.jb29.task04;

public class Z2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int nod;
        int nok;

        num1 = 300;
        num2 = 125;

        nod = findNod (num1, num2);
        nok = findNok(num1, num2, nod);

        System.out.println("Наибольший общий делитель равен: " + nod);
        System.out.println("Наименьшее общее кратное равно: " + nok);
     }

    public static int findNod (int num1, int num2){
        int nod;

        if (num1 < num2) {
            nod = num2;
        }
        else {
            nod = num1;
        }
        while (num1 % nod !=0 || num2 % nod != 0) {
            nod--;
        }
        return nod;
    }

    public static int findNok (int num1, int num2, int nod){
        int nok;

      nok = (num1 * num2) / nod;
        return nok;
    }
}

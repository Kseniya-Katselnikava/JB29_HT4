//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его
//        площади, если угол между сторонами длиной X и Y— прямой.
package by.epam.jb29.task04;

public class Z12 {
    public static void main(String[] args) {
        double X = 3;
        double Y = 4;
        double Z = 5;
        double T = 2;
        double katet, S, S1, S2;

        katet = Math.sqrt(Math.pow(X,2) + Math.pow(Y,2));
        S1 = square1(X, Y);
        S2 = square2(Z, T, katet);
        S = S1 + S2;
        System.out.printf("Площадь четырехугольника равна: %.3f", S);
    }

    public static double square1 (double X, double Y) {
        return 0.5 * X * Y;
    }

    public static double square2 (double Z, double T, double katet) {
        double p = (Z + T + katet) / 2;
//        System.out.println(p);
        return Math.sqrt(p * (p - Z) * (p - T) * (p - katet));
    }
}

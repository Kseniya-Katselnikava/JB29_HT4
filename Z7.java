//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
//        какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
package by.epam.jb29.task04;

import java.util.Random;

public class Z7 {
    public static void main(String[] args) {
        int size = 10;
        double [] coord = new double[size];
        Random ran = new Random();

        for (int i = 0; i < coord.length; i++) {
            coord[i] = ran.nextDouble();
            System.out.printf("%.3f", coord[i]);
            System.out.println();
        }

        double max = 0;
        int index_i = 0;
        int index_j = 0;

        for (int i = 0; i < coord.length - 1; i+=2) {
            for (int j = i + 2; j < coord.length - 1; j+=2){

                double currentDist;
                currentDist = dist(coord[i], coord[i + 1], coord[j], coord[j + 1]);

                if (max < currentDist) {
                    max = currentDist;
                    index_i = i;
                    index_j = j;
                }
            }
        }

        System.out.println();
        System.out.printf("Самое большое расстояние между точками: А(%.3f, %.3f) И B(%.3f, %.3f)", coord[index_i], coord[index_i + 1], coord[index_j], coord[index_j + 1]);
    }

    public static double dist (double x1, double y1, double x2, double y2) {
       double dist;
       dist = Math.sqrt((Math.pow(x2, 2) - Math.pow(x1, 2)) - (Math.pow(y2, 2) - Math.pow(y1, 2)));
       return dist;
    }
}

package Days45_OperasiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Days45_OperasiArray {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int[][] a = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17},
            {19, 21, 23}
        };
        int[][] b = {
            {10, 15, 20},
            {30, 35, 40},
            {45, 50, 55},
            {60, 65, 70}
        };
        int[][] c = {
            {11, 12, 13},
            {14, 15, 16},
            {17, 18, 19},
            {20, 21, 22},};
        int d[][] = new int[a.length][a[0].length];
        System.out.println("a" + Arrays.deepToString(a));
        System.out.println("b" + Arrays.deepToString(b));
        System.out.println("b" + Arrays.deepToString(c));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                d[i][j] = a[i][j] + b[i][j] - c[i][j];
            }
        }
        System.out.println("\n hasil dari a+b-a = " + Arrays.deepToString(d));
    }
}

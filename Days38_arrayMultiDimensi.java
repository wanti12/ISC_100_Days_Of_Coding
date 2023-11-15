package Days38_arrayMultiDimensi;

import java.util.Arrays;
import java.util.Scanner;

public class Days38_arrayMultiDimensi {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan angka tertinggi: ");
        int y = wa.nextInt();
        int[][] x = new int[6][7];
        for (int[] a : x) {
            for (int b : a) {
                System.out.print(y + b + ",");
                y--;
            }
            System.out.println("\n");
            
        }
    }

}

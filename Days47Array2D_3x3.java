package Days47Array2D_3x3;

import java.util.Arrays;
import java.util.Scanner;

public class Days47Array2D_3x3 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("masukkan nilai untuk array 2D" + "[" + i + "]" + "[" + j + "]" + " = ");
                a[i][j] = wa.nextInt();

            }
        }
                System.out.println("Array 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }
}

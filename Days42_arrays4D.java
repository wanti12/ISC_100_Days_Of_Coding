package Days42_arrays4D;

import java.util.Random;

public class Days42_arrays4D {

    public static void main(String[] args) {
        int Array1 = 4;
        int Array2 = 4;
        int Array3 = 4;
        int Array4 = 4;
        int batas = 100;

        int[][][][] x = new int[Array1][Array2][Array3][Array4];

        Random y = new Random();
        for (int i = 0; i < Array1; i++) {
            for (int j = 0; j < Array2; j++) {
                for (int k = 0; k < Array3; k++) {
                    for (int l = 0; l < Array4; l++) {
                        x[i][j][k][l] = y.nextInt(batas);
                    }
                }
            }
        }
        for (int i = 0; i < Array1; i++) {
            for (int j = 0; j < Array2; j++) {
                for (int k = 0; k < Array3; k++) {
                    for (int l = 0; l < Array4; l++) {
                        System.out.println(x[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

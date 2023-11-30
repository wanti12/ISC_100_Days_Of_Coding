package Days53;

import java.util.*;

public class Days53 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan baris matrik 1 = ");
        int a = wa.nextInt();
        System.out.print("masukkan kolom matrik 1 = ");
        int b = wa.nextInt();
        System.out.print("masukkan baris matrik 2 = ");
        int c = wa.nextInt();
        System.out.print("masukkan kolom matrik 2 = ");
        int d = wa.nextInt();
        int x[][] = new int[a][b];
        int y[][] = new int[c][d];

        int hasil;
        int hasilKali[][] = new int[x.length][y[0].length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("masukkan nilai untuk array 2D" + "[" + i + "]" + "[" + j + "]" + " = ");
                x[i][j] = wa.nextInt();
            }

        }
        for (int k = 0; k < y.length; k++) {
            for (int l = 0; l < y[k].length; l++) {
                System.out.print("masukkan nilai untuk array 2D" + "[" + k + "]" + "[" + l + "]" + " = ");
                y[k][l] = wa.nextInt();
            }

        }
        System.out.println("matriks 1 ");
        System.out.print(Arrays.deepToString(x));
        

        System.out.println("\n\nmatriks 2 ");
        System.out.print(Arrays.deepToString(y) + " ");
        

        System.out.println("\n\nhasil perkalian matriks 1 dan matriks 2");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                hasil = 0;
                for (int k = 0; k < x[0].length; k++) {
                    hasil += x[i][k] * y[k][j];
                }
                hasilKali[i][j] = hasil;
            }
        }
        System.out.println(Arrays.deepToString(hasilKali));
    }
}

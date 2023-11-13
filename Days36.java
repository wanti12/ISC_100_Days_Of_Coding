package Days36;

import java.util.Scanner;

public class Days36 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan jumlah baris : ");
        int baris = wa.nextInt();
        System.out.println("masukkan jumlah kolom : ");
        int kolom = wa.nextInt();
        int nilaiawal = 1;
        int[][] z = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(z[i][j] + nilaiawal + " ");
                nilaiawal++;
            }
            System.out.println();
        }
    }
}

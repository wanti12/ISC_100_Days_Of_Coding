package Days25_ForLoop;

import java.util.Scanner;

public class Days25_ForLoop {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("menjumlahkan angka dengan rentang angka selanjutnya");
        System.out.println("masukkan nilai akhir : ");
        int y = wa.nextInt();

        int a = 0;
        for (int i = 0; i <= y;i++) {
            a = i + a;
            System.out.println("ditambah " + i + "menjadi = " + a);
            
        }
    }

}

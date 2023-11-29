package Days52_RekunsifBercabang;

import java.util.*;

public class Days52_RekunsifBercabang {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan nilai n = ");
        int nilai = wa.nextInt();
        int hasil = hitung(nilai);
        System.out.println("hasil = " + hasil);
    }

    private static int hitung(int x) {
        System.out.print(x + "  ");
        if (x == 0 || x == 1) {

            return 0;
        } else {
            return x + hitung(x - 1);
        }
    }
}

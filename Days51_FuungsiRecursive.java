package Days51_FuungsiRecursive;

import java.util.*;

public class Days51_FuungsiRecursive {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan angka = ");
        int x = wa.nextInt();

        int jumlah = hitung(x);
        System.out.println("\njumlah perkalian = " + jumlah);
        int hasil = hitung1(jumlah);
        System.out.println("hasil = " + hasil);
    }

    private static int hitung(int y) {
        System.out.print(y + " ");
        if (y == 1) {
            return y;
        }
        return y * hitung(y - 1);
    }

    private static int hitung1(int z) {
        System.out.println(z+ " / 2");
        return z / 2;
    }
}

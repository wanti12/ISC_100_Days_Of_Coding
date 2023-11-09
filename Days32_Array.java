package Days32_Array;

import java.util.Scanner;

public class Days32_Array {

    public static void main(String[] args) {
        String[] a = {"coto", "mie goreng", "ayam goreng", "bakso", "mie ayam"};
        String[] b = {"es teh", "kopi"};
        Scanner wa = new Scanner(System.in);
        System.out.println("semua menu makanan 15.000 \n minuman 5.000");
        System.out.println(" 0.coto \n 1.mie goreng \n 2.ayam goreng \n 3.bakso \n 4.mie ayam");
        System.out.println(" 0.es teh \n 1.kopi");
        System.out.println("masukkan pilihan makanan : ");
        int y =wa.nextInt();
        System.out.println("masukkan pilihan minuman : ");
        int x = wa.nextInt();
        System.out.print("masukkan jumlah uang: ");
        int c = wa.nextInt();
        int d = c - (15 + 5);
        System.out.println(a[x]+ "+" +b[y] + "= 15.000 + 5.000");
        System.out.println("uang kembalian = " + d);
    }
}

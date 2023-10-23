package Days15_OperatorPercabangan;

import java.util.Scanner;

public class Days15_OperatorPercabangan {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan jumlah harga : ");
        int a = wa.nextInt();
        double b = 0.1;
        double c = 0.15;

        if (a >= 500) {
            double x = a - (a * c);
            System.out.println("total harga pembelian yang harus di bayar pelanggan = " + x);
        } else if (a >= 350 && a < 500) {
            double y = a - (a * b);
            System.out.println("total harga pembelian yang harus di bayar pelanggan = " + y);
        } else {
            System.out.println("total harga pembelian yang harus di bayar pelanggan = " + a);
        }

    }

}

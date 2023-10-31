package Days23_WhileLoop;

import java.util.Scanner;

public class Days23_WhileLoop {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan jumlah komputer = ");
        int y = wa.nextInt();
        int x = 0;
        boolean kondisi = true;

        System.out.println("periksa kondisi perangkat komputer");
        while (kondisi) {
            x++;
            System.out.println("komputer " + x + " beroperasi dengan baik");
            if (x == y) {
                kondisi = false;
            }
        }

        System.out.println("program selesai");
    }

}

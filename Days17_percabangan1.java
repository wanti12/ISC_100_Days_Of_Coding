package Days17_percabangan;

import java.util.Scanner;

public class Days17_percabangan1 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        System.out.print("masukkan waktu : ");
        double a = wa.nextDouble();

        if (a >= 05.00 && a < 11.00) {
            System.out.println(a + " adalah waktu pagi");
        } else if (a >= 11.00 && a <= 13.59) {
            System.out.println(a + " adalah waktu siang");
        } else if (a >= 14.00 && a <= 18.59) {
            System.out.println(a + " adalah waktu sore");
        } else if (a >= 19.00 && a <= 24.59) {
            System.out.println(a + " adalah waktu malam");
        } else if (a >= 01.00 && a <= 04.59) {
            System.out.println(a + " adalah waktu dini hari");
        } else {
            System.out.println("bukan termasuk waktu ");
        }

    }

}

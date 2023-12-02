package Days55;

import java.util.*;

public class Days55 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan alas = ");
        int a = wa.nextInt();
        System.out.print("masukkan tinggi = ");
        int b = wa.nextInt();
        double l = luas(a, b);
        System.out.println("luas segitiga = "+l);
    }

    public static double luas(double a, double b) {

        return 0.5 * (a * b);
    }
}

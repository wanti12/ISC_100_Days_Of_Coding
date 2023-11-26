package Dayas49_FungsiMethod;

import java.util.*;

public class Dayas49_FungsiMethod {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan jari-jari = ");
        double r = wa.nextInt();
        double x = 3.14;
        double luas = hitungLuas(r, x);
        System.out.println("luas lingkaran = " + luas);
        double keliling = hitungKeliling(r, x);
        System.out.println("keliling lingkaran = " + keliling);
    }

    private static double hitungKeliling(double r, double x) {
        double hasil = 2 * x * r;
        return hasil;
    }

    private static double hitungLuas(double r, double x) {
        double hasil = x * r * r;
        return hasil;
    }
}

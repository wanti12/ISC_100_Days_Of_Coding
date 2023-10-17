package days9_operatorlogika;

import java.util.Scanner;

public class Days9_operatorLogika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan umur : ");
        int umur = input.nextInt();
        System.out.println(umur + " tahun adalah kateori anak-anak ");
        boolean a = umur <= 10;
        System.out.println(a);

        System.out.print("masukkan umur : ");
        int b = input.nextInt();
        System.out.println(b + " tahun adalah kategori remaja");
        boolean c = b >= 11 && b<=18;
        System.out.println(c);

        System.out.print("masukkan umur : ");
        int d = input.nextInt();
        System.out.println(d + " tahun adalah kategori dewasa & orang tua");
        boolean e = d >= 19;
        System.out.println(e);

    }
}

package javaapplication52;

import java.util.Scanner;

public class JavaApplication52 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        System.out.println("masukkan angka 1 untuk menghitung luas lingkaran ");
        System.out.println("masukkan angka 2 untuk menghitung luas persegi ");
        System.out.println("masukkan angka 3 untuk menghitung luas segitia ");
        System.out.println("masukkan angka 4 untuk menghitung luas persegi panjang ");
        System.out.print("masukkan inputan : ");
        int x = wa.nextInt();
        int a, b;
        double L;

        switch (x) {
            case (1):
                System.out.println("masukkan jari-jari ");
                a = wa.nextInt();
                L = 3.14 * (a * a);
                System.out.println(L + " adalah luas lingkaran");
                break;
            case (2):
                System.out.println("masukkan sisi ");
                a = wa.nextInt();
                L = a * a;
                System.out.println(L + " adalah luas persegi");
                break;
            case (3):
                System.out.println("masukkan alas ");
                a = wa.nextInt();
                System.out.println("masukkan tinggi ");
                b = wa.nextInt();
                L = 0.5 * (a * b);
                System.out.println(L + " adalah luas lingkaran");
                break;
            case (4):
                System.out.println("masukkan panjang ");
                a = wa.nextInt();
                System.out.println("masukkan lebar ");
                b = wa.nextInt();
                L = a * b;
                System.out.println(L + " adalah luas lingkaran");
                break;
            default:
                System.out.println("tidak termasuk program");
        }
    }

}

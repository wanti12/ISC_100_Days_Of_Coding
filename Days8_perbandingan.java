package days8_perbandingan;

import java.util.Scanner;

public class Days8_perbandingan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("operator perbandingan");

        System.out.print("masukan nilai a = ");
        int a = input.nextInt();
        System.out.print("masukkan nilai b = ");
        int b = input.nextInt();
        System.out.println("apakah a sama dengan b : " + (a == b));

        System.out.print("masukan nilai c = ");
        int c = input.nextInt();
        System.out.print("masukan nilai d = ");
        int d = input.nextInt();
        System.out.println("nilai c lebih kecil d : " + (c <= d));

        System.out.print("masukan nilai e = ");
        int e = input.nextInt();
        System.out.print("masukan nilai f = ");
        int f = input.nextInt();
        System.out.println("nilai e lebih besar f : " + (e >= b));

        System.out.print("masukan nilai g = ");
        int g = input.nextInt();
        System.out.print("masukan nilai h = ");
        int h = input.nextInt();
        System.out.println("nilai g tidak sama dengan h : " + (g != h));

    }

}

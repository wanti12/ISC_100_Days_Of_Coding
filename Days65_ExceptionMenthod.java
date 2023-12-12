package Days65_ExceptionMenthod;

import java.util.Scanner;

public class Days65_ExceptionMenthod {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.print("\nindeks ke = ");
        int input = wa.nextInt();

        try {
            System.out.printf("indeks %d = %d", input, data[input]);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.print("\nindeks ke = ");
        int input1 = wa.nextInt();
        try {
            System.out.printf("indeks %d = %d", input1, data[input1]);
        } catch (Exception e) {
            System.err.println(e);
        }
        int a = data[input] + data[input1];
        int b = data[input] * data[input1];
        int c = data[input] - data[input1];
        int d = data[input] % data[input1];
        System.out.printf("\nhasil penjumlahan = %+-d", a);
        System.out.printf("\nhasil perkalian = %+-d", b);
        System.out.printf("\nhasil pengurangan = %+-d", c);
        System.out.printf("\nhasil pembagian = %+-d", d);
        System.out.println("\n");
    }

}

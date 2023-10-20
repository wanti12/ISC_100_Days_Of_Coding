package days12operatoraritmatika;

import java.util.Scanner;

public class DAys12OperatorAritmatika {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("====TOKO CAHYA====");

        System.out.print("masukkan jumlah kemeja : ");
        int a = wa.nextInt();
        System.out.print("masukkan jumlah kotak : ");
        int b = wa.nextInt();

        int c = a - b;

        System.out.println("jumlah kotak yan terisi = " + b);
        System.out.println("sisa kemeja yang tidak di kemas = " + c);

    }

}

package Days31;

import java.util.Scanner;

public class Days31 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan inputan angka : ");
        int x = wa.nextInt();
        System.out.println("tabel perkalian " + x);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + x + "=" + (x * i));
        }
    }

}

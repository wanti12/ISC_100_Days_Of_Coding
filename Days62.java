package Days62;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Days62 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan kalimat : ");
        String a = wa.nextLine();
        StringBuilder kalimat = new StringBuilder(a);
        System.out.println("panjang kalimat = " + kalimat.length());
        System.out.println("kapasitas kalimat = " + kalimat.capacity());
    }
}

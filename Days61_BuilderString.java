package Days61_BuilderString;

import java.lang.StringBuilder;
import java.util.Scanner;

public class Days61_BuilderString {
    
    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("kalimat : ");
        String a = wa.nextLine();
        StringBuilder kalimat = new StringBuilder(a);
        int d = kalimat.capacity();
        System.out.println("kapasitas kalimat = " + d);
        System.out.println("address = " + System.identityHashCode(kalimat));
        System.out.println("di ubah menjadi String biasa ");
        String baru = kalimat.toString();
        System.out.println(baru + " || " + System.identityHashCode(baru));
    }
}

package Days68;

import java.util.Scanner;

public class Days68 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        StringBuilder kalimat = new StringBuilder("ayo belajar java\n");
        System.out.printf("kalimat : %s", kalimat);
        System.out.printf("kapasitas = %s \n", kalimat.capacity());
        System.out.printf("address = %s\n", kalimat.hashCode());
        kalimat.insert(4, "kita ");
        System.out.printf("kalimat baru : %s", kalimat);

        
    }
}

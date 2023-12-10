package Days63_FormatString;

import java.util.*;

public class Days63_FormatString {

    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);
        String nama;
        int umur;
        float ipk;
        boolean x = true;
        int b = 0;
        System.out.print("masukkan jumlah mahasiswa = ");
        int a = we.nextInt();
        do {
            Scanner wa = new Scanner(System.in);
            System.out.print("masukkan nama:  ");
            nama = wa.nextLine();

            System.out.print("umur : ");
            umur = wa.nextInt();

            System.out.print("IPK = ");
            ipk = wa.nextFloat();

            System.out.printf("\nnama mahasiswa : %1$s\n%1$s berusia %2$d tahun\nIPK %1$s = %3$.2f ", nama, umur, ipk);
            b++;
            System.out.println("\n");
            if (b == a) {
                x = false;
            }
        } while (x);

        System.out.println("inputan selesai");
    }
}

package Days24_DoWhile;

import java.util.Scanner;

public class Days24_DoWhile {

    public static void main(String[] args) {
        //Scanner wa = new Scanner(System.in);
        System.out.println("absensi mahasiswa");
        String a, b, c;
        do {
            Scanner wa = new Scanner(System.in);
            System.out.print("masukkan nama : ");
            a = wa.nextLine();
            System.out.print("masukkan keterangan : ");
            b = wa.nextLine();
            System.out.println(a + " " + b);
            System.out.print("lanjut/stop : ");
            c = wa.nextLine();
        } while (c.equals("lanjut"));

        System.out.println("absensi selesai");
    }

}

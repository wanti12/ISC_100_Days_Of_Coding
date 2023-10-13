package days5inputandanoutput;

import java.util.Scanner;

public class Days5inputandanoutput {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        System.out.print("masukkan no peserta : ");
        String NoPeserta = wa.nextLine();
        System.out.print("masukkan nama : ");
        String nama = wa.nextLine();
        System.out.print("masukkan jenis kelamin : ");
        String JenisKelamin = wa.nextLine();
        System.out.print("masukkan umur : ");
        int umur = wa.nextInt();
        System.out.print("masukkan berat badan : ");
        double berat = wa.nextDouble();
        System.out.print("masukkan status keaktifan : ");
        boolean keaktifan = wa.nextBoolean();

        System.out.println("No peserta    :" + NoPeserta);
        System.out.println("nama          :" + nama);
        System.out.println("jenis kelamin :" + JenisKelamin);
        System.out.println("umur          :" + umur);
        System.out.println("berat badan   :" + berat);
        System.out.println("aktif         :" + keaktifan);
    }

}

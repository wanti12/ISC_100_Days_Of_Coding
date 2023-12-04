package Days57_OperasiString;

import java.util.Scanner;

public class Days57_OperasiString {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        String kalimat = "ayo belajar biar gak eror";
        System.out.println("kalimat awal : " + kalimat);
        System.out.print("masukkan kata yang ingin di ganti : ");
        String ganti = wa.nextLine();
        System.out.print("masukkan kata pengganti : ");
        String ganti1 = wa.nextLine();
        String kalimatbaru = kalimat.replace(ganti, ganti1);
        System.out.println("kalimat setelah di replace : " + kalimatbaru);
    }
}

package Days60;

import java.util.Scanner;

public class Days60 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan kalimat : ");
        String kalimat = wa.nextLine();
        System.out.println("kalimat : " + kalimat);
        System.out.println("kalimat setelah di lowerCase : " + kalimat.toLowerCase());
        System.out.println("kalimat setelah di upperCase : " + kalimat.toUpperCase());

        System.out.print("masukkan kata yang ingin di ganti : ");
        String a = wa.nextLine();
        System.out.print("masukkan kata pengganti : ");
        String b = wa.nextLine();
        String kalimat1 = kalimat.replace(a, b);
        System.out.println("kalimat baru : " + kalimat1);
        if (kalimat.equals(kalimat1)) {
            System.out.println("lokasi String sama");
        } else {
            System.out.println("lokasi String tidak sama");
        }
    }
}

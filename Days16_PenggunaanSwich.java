package Days16_PenggunaanSwich;

import java.util.Scanner;

public class Days16_PenggunaanSwich {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println(" input 1 (untuk daftar menu makanan) dan 2 (untuk daftar menu minuman) ");
        System.out.print("masukkan pilihan : ");
        int pilihan = wa.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("daftar menu pilihan : ");
                
                System.out.println("bakso biasa 10k ");
                System.out.println("nasi goreng 15K ");
                System.out.println("mie pangsit 20K ");
                System.out.println("nasi lalapan 30K ");
                break;
            case 2:
                System.out.println("daftar menu pilihan : ");
                
                System.out.println("es teh 5k");
                System.out.println("kopi susu 5k ");
                System.out.println("kopi hitam 5k ");
                break;

        }
    }

}

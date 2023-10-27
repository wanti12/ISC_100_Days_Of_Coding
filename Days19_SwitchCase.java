package Days19_SwitchCase;

import java.util.Scanner;

public class Days19_SwitchCase {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("TOKO XXX");
        System.out.print("masukkan merk sepatu : ");
        String a = wa.nextLine();

        switch (a) {
            case "adidas":
                System.out.println("sepatu adidas premium dengan kualitas import tersedia dar ukuran 40 = 25 cm, 41 = 25,5 cm ,42 = 26 cm - 4 dengan harga 190.000");
                break;
            case "kanvas":
                System.out.println("Sepatu Canvas LIGHT STAR BASIC High Cut Sekolah Hitam Putih Sneakers Kanvas tersedia dari ukuran 37-40 dengan harga 105.000");
                break;
            case "ventela":
                System.out.println("VENTELA Sepatu Pria/Wanita Casual Sneakr Bts Public Low Warna Cream A8 009 tersedia dari ukuran 36-39 dengan harga 220.00");
                break;
            default:
                System.out.println("mohon maaf merk sepatu yang anda masukkan mungkin belum tersedia di toko kami");

        }
        System.out.println("terimakasih atas kunjungan nya dan mohon maaf jika ada ketidak nyamanan");
    }

}

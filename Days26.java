package Days26_latihanLooping;

import java.util.Scanner;

public class Days26 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("menambahkan keterangan genap setiap selesai mencetak angka genap");
        System.out.print("masukkan batas : ");
        int x = wa.nextInt();
        int y = 0;
        
        do {
            y++;
            System.out.println(y);
            if (y % 2 == 0) {
                System.out.println("genap");
            }
        } while (y <= x);

    }
}

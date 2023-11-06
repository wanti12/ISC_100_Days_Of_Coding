package Days29_ContinueBreak;

import java.util.Scanner;

public class Days29_ContinueBreak {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan batas : ");
        int y = wa.nextInt();
        int x = 0;
        boolean kondisi;
        System.out.println("mencetak angka ganjil sampai batas yang di tentuhkan");
        while (x < y) {
            x++;
            if (x % 2 == 0) {
                continue;
            } else if (x == y) {
                break;
            }
            System.out.println(x);
        }
    }
}

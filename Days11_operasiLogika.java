package days11_operasilogika;

import java.util.Scanner;

public class Days11_operasiLogika {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        System.out.println("clue nya adalah muve on ");

        int a = 3 + 2;
        int b;
        boolean y;
        System.out.println("3+2=?");
        System.out.print("masukkan tebakan anda : ");
        b = wa.nextInt();
        y = (b < 7) && (b > a);
        System.out.println("tebakan anda " + y);
        System.out.println("========================================");
        System.out.println("clue nya adalah muve on muve on muve on");
        System.out.println("9+5=?");
        System.out.print("masukkan tebakan anda :");
        b = wa.nextInt();
        y = (b < 18) && (b > 16);
        System.out.println("tebakan anda " + y);
    }

}

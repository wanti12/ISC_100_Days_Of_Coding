package Days30_KelipatanTiga;

import java.util.Scanner;

public class Days30_KelipatanTiga {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan nilai n = ");
        int n = wa.nextInt();

        System.out.println("bilangan kelipatan 3");
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}

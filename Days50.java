package Days50;

import java.util.Scanner;

public class Days50 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int x = wa.nextInt();
        int a = 1;

        for (int i = 1; i <= x; i++) {
            System.out.print(i);

            if (i < x) {
                System.out.print(" x ");
            }
            a *= i;

        }
        System.out.print(" = " + a);
        System.out.println();
    }

}

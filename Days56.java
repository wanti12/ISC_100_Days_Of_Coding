package Days56;

import java.util.Scanner;

public class Days56 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int p = wa.nextInt();
        int l = wa.nextInt();
        System.out.println("luas = " + luas(p, l));

    }

    private static int luas(int p, int l) {
        int luas = p * l;
        return luas;

    }
}

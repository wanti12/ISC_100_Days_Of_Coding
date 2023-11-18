package Days41_Imputan;

import java.util.Scanner;

public class Days41_Imputan {

    public static void main(String[] arStrings) {
        Scanner wa = new Scanner(System.in);
        int x = wa.nextInt();
        int[] a = new int[x];
        int jumlah = 0;
        int y = 1;

        for (int i = 0; i < x; i++) {
            System.out.print("inputanke" + y + ": ");
            a[i] = wa.nextInt();
            y++;
            jumlah += a[i];
        }
        int sum = jumlah;
        double averange = sum / x;
        System.out.println("averange = " + averange);
        System.out.println("sum = " + sum);
    }
}

package Days43_inputan;

import java.util.Scanner;

public class Days43_inputan {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        int size = wa.nextInt();
        int size1[] = new int[size];
        int jumlahPerulangan = 0;
        int Total = 0;
        for (int i = 0; i < size1.length; i++) {
            jumlahPerulangan++;
            System.out.print(size1[i] + jumlahPerulangan);
            Total += jumlahPerulangan;
            if (i < (size - 1)) {
                System.out.print(" + ");
            } else {
                System.out.print(" = " + Total);
            }
        }
        System.out.println();
    }
}

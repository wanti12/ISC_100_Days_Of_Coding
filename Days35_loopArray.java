package Days35_loopArray;

import java.util.Scanner;

public class Days35_loopArray {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.println("masukkan jumlah imputan : ");
        int x = wa.nextInt();
        int[] y = new int[x];
        int jumlah = 0;
        System.out.println("masukkan imputan angka: ");
  
        for (int i = 0; i < x; i++) {
            y[i] = wa.nextInt();
        }
        for (int i = 0; i < x; i++) {

            System.out.print(y[i]);
            jumlah += y[i];
            if (i < (x - 1)) {
                System.out.print("+");
            } else {
                System.out.println("=" + jumlah);
            }    
        }System.out.println("jadi total angka yang di input = " + jumlah);
    }
}

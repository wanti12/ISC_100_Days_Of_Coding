package Days54;

import java.util.*;

public class Days54 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan batas array 1 = ");
        int a = wa.nextInt();
        System.out.print("masukkan batas array 2 = ");
        int b = wa.nextInt();
        int x[] = new int[a];
        int y[] = new int[b];
        int z = x.length + y.length;
        int n[] = new int[z];
        System.out.println("array 1 :");
        for (int i = 0; i < x.length; i++) {
            x[i] = wa.nextInt();
        }
        System.out.println("array 2 :");
        for (int j = 0; j < y.length; j++) {
            y[j] = wa.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            n[i] = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            n[x.length + i] = y[i];
        }
        for (int i = 0; i < z; i++) {

        }
        printarray(x);
        printarray(y);
        System.out.println("gabungan array 1 dan array 2 ");
        printarray(n);
    }

    private static void printarray(int[] dataArray) {
        System.out.println("array =" + Arrays.toString(dataArray));
    }
}

package Days37_OperasiArray;

import java.util.Arrays;
import java.util.Scanner;

public class Days37_OperasiArray {

    public static void main(String[] args) {
        int[] x = {33, 101, 6, 99, 8, 9, 7, 88, 100};
        System.out.println("data awal = " + Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("menjadi = " + Arrays.toString(x));
    }
}

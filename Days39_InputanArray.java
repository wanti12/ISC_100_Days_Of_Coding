package Days39_InputanArray;

import java.util.Scanner;

public class Days39_InputanArray {

    public static void main(String[] arStrings) {
        Scanner wa = new Scanner(System.in);
        int x = wa.nextInt();
        int[] y = new int[x];
        int a = 0;
        int b = 2;
        
        for (int i = 0; i < y.length; i++) {
            if (x % 2 == 0) {
                if (b % 2 == 0) {
                    System.out.print(y[i] + b + " ,");
                    b++;
                }
                b++;
            } else if (x % 2 != 0) {
                a++;
                if (a % 2 != 0) {
                    System.out.print(y[i] + a + " ,");
                }
                a++;
            }

        }
    }
}

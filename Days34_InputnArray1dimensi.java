package Days34_InputnArray1dimensi;

import java.util.Scanner;

public class Days34_InputnArray1dimensi {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("size Array: ");
        int x = wa.nextInt();
        int[] y = new int[x];

        for (int i = 0; i < x; i++) {
            y[i] = wa.nextInt();
        }
        System.out.print("{");
        for (int i = 0; i < x; i++) {
            System.out.print(y[i]);

            if (i < (x - 1)) {
                System.out.print(",");
            } else {
                System.out.println("}");
            }
        }
    }
}

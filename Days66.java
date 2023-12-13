package Days66;

import java.io.IOException;
import java.util.Scanner;

public class Days66 {

    public static void main(String[] args) throws IOException {
        Scanner wa = new Scanner(System.in);
        int data[] = {1, 2, 3, 4, 5};

        System.out.print("\nindeks ke = ");
        int input = wa.nextInt();

        int hasil = ambildata(data, input);
        System.out.printf("indeks %d = %d", input, data[input]);
        System.out.println("\n");
    }

    private static int ambildata(int[] array, int indeks) {
        int hasil1 = 0;
        try {
            hasil1 = array[indeks];
        } catch (Exception e) {
            System.out.println("diluar indeks");
            System.err.println(e);
        }
        return hasil1;
    }
}

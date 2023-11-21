package Days_44;

import java.util.Arrays;

public class Days_44 {

    public static void main(String[] args) {
        double[] data = {4, 3.1, 3, 9, 0.1, 4.2, 2, 1, 7, 9};
        System.out.println("nilai awal = " + Arrays.toString(data));
        int z = data.length;
        double x = 0, y = 0;

        Arrays.sort(data);
        System.out.println("ascending = " + Arrays.toString(data));
        for (int i = 0; i < z; i++) {

            if (data[i] > x) {
                x = data[i];
            }
            if (data[i] < y) {
                y = data[i];
            }
        }
        System.out.println("\nnilai maximal = " + x);
        System.out.println("nilai minimal = " + y);

    }
}

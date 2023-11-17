package Days40_NilaiRataRata;

public class Days40_NilaiRataRata {

    public static void main(String[] arStrings) {
        int x = 0;
        int y = 100;
        int sum = 0;
        int total = 0;
        for (int i = 1; i <= y; i++) {

            if (i % 2 != 0) {
                System.out.print(i);
                total += i;
                x++;
            } else if (i < (y - 1)) {
                System.out.print(" + ");
            } else {
                System.out.println("\n total seluruh angka ganjil = " + total);
            }

            sum = total;
        }
        int avg = sum / x;
        System.out.println("\n jadi nilai rata-ratanya = " + sum + " / " + x + " = " + avg);
    }
}

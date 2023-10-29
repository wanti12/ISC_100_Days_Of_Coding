package Days21_TernaryOperator;

import java.util.Scanner;

public class Days21_TernaryOperator {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int a = wa.nextInt();
        int b;

        b = (a % 2 == 0) ? (a / 2) : (a * 2);
        System.out.println("maka hasilnya adalah : " + b);
    }

}

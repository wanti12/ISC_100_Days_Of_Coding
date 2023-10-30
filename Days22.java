package Days17_percabangan;

import java.util.Scanner;

public class Days22 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan nilai x : ");
        int x = wa.nextInt();
        int y;

        if (x % 2 == 0 && x != 0) {
            y = x + 2;
            System.out.println(x + " adalah bilangan genap maka ditambah 2 \n jadi nilai x + 2 = " + y);
            System.out.println(y + " adalah bilangan genap");
        } else if (x % 2 != 0) {
            y = x + 1;
            System.out.println(x + " adalah bilangan ganjil maka ditambah 1 \n jadi nilai x + 1 = " + y);
            System.out.println(y + " adalah bilangan genap");
        } else {
            System.out.println("bukan bilangan genap dan ganjil");
        }
    }
}

package Days59;

import java.util.*;

public class Days59 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan kalimat : ");
        String input = wa.nextLine();
        System.out.print("masukkan indeks awal : ");
        int a = wa.nextInt();
        System.out.print("masukkan indeks akhir : ");
        int b = wa.nextInt();
        String input1 = input.substring(a, b);
        System.out.println("kaliamt ke2 : " + input1);
      
        if (input == input1) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

    }

}

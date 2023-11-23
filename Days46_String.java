package Days46_String;

import java.util.Scanner;

public class Days46_String {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        String input = wa.nextLine();
        int awal = wa.nextInt();
        int akhir = wa.nextInt();
        System.out.println(input.substring(awal, akhir));
    }
}

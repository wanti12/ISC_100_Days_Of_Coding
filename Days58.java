package Days58;

import java.util.*;

public class Days58 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan kalimat : ");
        String a = wa.nextLine();
        printAddres("kalimat : ", a);

    }

    private static void printAddres(String b, String c) {
        int x = System.identityHashCode(c);
        System.out.println(b + c + " --> address = " + Integer.toHexString(x));
    }
}

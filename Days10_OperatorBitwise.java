package days10_operatorbitwise;

import java.util.Scanner;

public class Days10_OperatorBitwise {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan nilai a ");
        byte a = wa.nextByte();
        //System.out.println("masukkan nilai b");
        byte b, c, d, e;
        String a_bits, b_bits, c_bits, d_bits, e_bits;
        boolean z = a % 2 == 0;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        System.out.println(a + " adalah bilangan genap " + z);

        b = (byte) (a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println(b + " tidak sma dengan 0 " + (b != 0));

        c = (byte) (a >> 2);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);
        System.out.println(c + " besar  " + a + (c > a));

        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);
        d = (byte) (b | c);
        d_bits = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
        System.out.printf("%s = %d \n", d_bits, d);
        System.out.println(d + " kecil " + a + (d < a));

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);
        e = (byte) (c & a);
        e_bits = String.format("%8s", Integer.toBinaryString(e)).replace(' ', '0');
        System.out.printf("%s = %d \n", e_bits, e);
        System.out.println(e + " sama dengan " + d  + (e == d));

    }
}

package Days69;

import java.util.Scanner;

public class Days69 {

    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan berat badan = ");
        double a = wa.nextDouble();
        System.out.print("masukkan tinggi badan = ");
        double b = wa.nextDouble();

        double c = a % b;
        System.out.println("menurut BMI\nberat badan ideal = berat badan : tinggi badan");
        System.out.println("jadi berat badan ideal kamu = "+c);
    }
}

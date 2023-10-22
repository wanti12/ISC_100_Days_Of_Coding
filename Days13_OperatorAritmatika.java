/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days13_operatoraritmatika;

import java.util.Scanner;

/**
 *
 * @author Wanti
 */
public class Days13_OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);
        System.out.print("masukkan angka 1 = ");
        int a = wa.nextInt();
        System.out.print("masukkan angka 2 = ");
        int b = wa.nextInt();

        System.out.println("hasil penjumlahan = " + (a + b));
        System.out.println("hasil pengurangan = " + (a - b));
        System.out.println("hasil perkalian   = " + (a * b));
        System.out.println("hasil pembagian   = " + (a / b));
        System.out.println("hasil sisa bagi   = " + (a % b));
    }

}

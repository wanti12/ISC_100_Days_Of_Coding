/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days14_percabangan;

import java.util.Scanner;

/**
 *
 * @author Wanti
 */
public class Days14_percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        System.out.print("masukkan nilai : ");
        int a = wa.nextInt();

        if (a % 2 == 0 ) {
            System.out.println(a + " adalah bilangan genap");
        } else if (a % 2 != 0) {
            System.out.println(a + " adalah bilangan ganjil");
        } else {
            System.out.println(" bukan ketegori bilangan");
        }
    }

}

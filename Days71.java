package Days71;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Days71 {

    public static void main(String[] args) throws IOException {
        InputStreamReader wa = new InputStreamReader(System.in);
        BufferedReader file = new BufferedReader(wa);
        System.out.print("masukkan nama mahasiswa : ");
        String nama = file.readLine();
        System.out.print("masukkan nim : ");
        String nim = file.readLine();
        System.out.print("masukkan nilai : ");
        int nilai = Integer.parseInt(file.readLine());

        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("nilai : " + nilai);
    }

}

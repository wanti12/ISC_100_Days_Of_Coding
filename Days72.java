package Days72;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Days72 {

    public static void main(String[] args) throws IOException {
        //Scanner wa = new Scanner(System.in);
        //int a = wa.nextInt();
        long mulai, akhir;
        FileInputStream file = new FileInputStream("FileDays70");
        BufferedInputStream input = new BufferedInputStream(file);

        input.mark(200);
        mulai = System.nanoTime();
        System.out.println(input.readAllBytes());
        akhir = System.nanoTime();
        System.out.println("waktu = " + (akhir - mulai));

        input.reset();
        byte data[] = input.readAllBytes();
        String data2 = new String(data);
        System.out.println("kalimat = " + data2);

        file.close();
        input.close();

    }
}

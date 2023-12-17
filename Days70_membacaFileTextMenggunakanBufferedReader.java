package Days70_membacaFileTextMenggunakanBufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Days70_membacaFileTextMenggunakanBufferedReader {

    public static void main(String[] args) throws IOException {
        FileReader file;
        BufferedReader file1;
        try {
            file = new FileReader("FileDays70");
            file1 = new BufferedReader(file);
            String baris;
            while ((baris = file1.readLine()) != null) {
                String[] x = baris.split("\\.");
                for (String y : x) {
                    System.out.println(y);
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

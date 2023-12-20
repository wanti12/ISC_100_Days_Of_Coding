package Days73;

import java.io.*;

public class Days73 {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\ee\\Documents\\filefile.txt");
        FileReader file2 = new FileReader("C:\\Users\\ee\\Documents\\filefile.txt");

        FileOutputStream output = new FileOutputStream("output.txt");
        FileWriter output2 = new FileWriter("output.txt");

        int a = file.read();
        while (a != -1) {
            System.out.print((char) a);
            output.write(a);
            a = file.read();
        }
        System.out.println();
        a = file2.read();
        while (a != -1) {
            System.out.print((char) a);
            output.write(a);
            a = file2.read();
        }
        file.close();
        file2.close();
        output.close();
        output2.close();
    }
}

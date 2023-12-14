package Days67_pengenalanIOStreamInputFile;

import java.io.FileInputStream;
import java.io.IOException;

public class Days67_pengenalanIOStreamInputFile {

    public static void main(String[] args) throws IOException {
        
        FileInputStream data = new FileInputStream("C:\\Users\\ee\\Documents\\DataInputBaru.txt");
       
        System.out.println((char) data.read());
        System.out.println((char) data.read());
        System.out.println((char) data.read());
        System.out.println((char) data.read());
        System.out.println((char) data.read());
        System.out.println((char) data.read());
        System.out.println((char) data.read());
        System.out.println((char) data.read());
        System.out.println((char) data.read());
        System.out.println((char) data.read());

    }
}

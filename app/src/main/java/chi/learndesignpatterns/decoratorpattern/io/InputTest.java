package chi.learndesignpatterns.decoratorpattern.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            int readResult;
            while ((readResult = inputStream.read()) >= 0) {
                System.out.print((char) readResult);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

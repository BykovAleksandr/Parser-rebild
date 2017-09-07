
import java.io.*;

public class ReadingStringIntFile {

    //Возвращает строку
    static String readerConsolString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inStringValue = reader.readLine();
        return inStringValue;
        // обработать искючения:
    }

    //Возвращает инт
    static int readerConsolInt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inInt = reader.readLine();
        int intValue = Integer.parseInt(inInt);
        return intValue;
        // обработать искючения
    }
}
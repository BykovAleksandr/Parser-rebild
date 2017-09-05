import java.io.IOException;
import java.util.ArrayList;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class SortFile {
    // ArrayList отсортированых данных
    public static ArrayList<String> sortedArraList = new ArrayList<>();
    // ArrayList входящих строк
    public static ArrayList<String> readFileStringArrayList = new ArrayList<>();

    static void sortFile() throws IOException {
        // вызов ридера файла
        ReadingStringIntFile.readerFile();
        }
}

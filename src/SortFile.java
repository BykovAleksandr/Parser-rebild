import java.io.IOException;
import java.util.ArrayList;


public class SortFile {
    // ArrayList отсортированых данных
    public static ArrayList<String> sortedArraList = new ArrayList<>();
    // ArrayList входящих строк
    public static ArrayList<String> readFileStringArrayList = new ArrayList<>();


    static void sortFile() throws IOException {
        ReadingStringIntFile.readerFile();
        OutFile.outFile(sortedArraList);
    }
}

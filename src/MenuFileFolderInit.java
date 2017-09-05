import java.io.IOException;
//Запускается из класса ReadingStringIntFile.rederFile
public class MenuFileFolderInit {

    public static String fileFolder;

    public static String fileFolder() throws IOException {
        System.out.print("Укажите путь к файлу и его имя ( res//test.txt ): ");
        fileFolder = ReadingStringIntFile.readerConsolString();
       return fileFolder;
    }
}

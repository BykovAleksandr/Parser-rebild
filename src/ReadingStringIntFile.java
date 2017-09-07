
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

    // Инициализация ArrayList строк с файла
    static void readerFile() throws IOException {
        // инициализация пути к файлу
        MenuFileFolderInit.fileFolder();

        try {
            FileInputStream fsReader = new FileInputStream(MenuFileFolderInit.fileFolder);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fsReader));

            String strLine;

            while ((strLine = reader.readLine()) != null){

                String tmpString = "";
                // временный массив для разбитых строк
                String[] tmpArray = new String[ManuallSetProp.someSerchValue];

                for (String mainTmp : strLine.split("\\*")){

                    for (int i = 0; i < ManuallSetProp.someSerchValue; i++){
                        if (mainTmp.contains(ManuallSetProp.serchValueArrayList.get(i))){
                            tmpArray[i] = mainTmp;
                        }
                    }
                }
                // перебор массива на поиск пустых мест и заполнение их.
                for (int i = 0; i < tmpArray.length; i++){
                    if (tmpArray[i] == null){
                        tmpArray[i] = ManuallSetProp.serchValueArrayList.get(i).concat("-]"); // Изменить
                    }
                }
                // Конкатынация масива в одну строку
                for (int i = 0; i < tmpArray.length; i++){
                    tmpString = tmpString.concat(tmpArray[i] + "*");
                }
                SortFile.sortedArraList.add(tmpString);
            }

        }
        catch (IOException e) {
            System.out.println("Файл не найден!");
        }
    }
}

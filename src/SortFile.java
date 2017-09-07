import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SortFile {
    // ArrayList отсортированых данных
    public static ArrayList<String> sortedArraList = new ArrayList<>();
    // ArrayList входящих строк
    public static ArrayList<String> readFileStringArrayList = new ArrayList<>();


    static void ReadAndSortFile() throws IOException {
        Menu.fileFolder();

        try {
            FileInputStream fsReader = new FileInputStream(Menu.fileFolder);
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
        OutFile.outFile(sortedArraList);
    }
}

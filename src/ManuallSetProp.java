import java.io.IOException;
import java.util.ArrayList;

public class ManuallSetProp {

    // Размер массива искомых значений
    public static int someSerchValue;

    // ArrayList искомых значений, принемающий в виде размера значения someSerchValue введенные с консоли
    public static ArrayList<String> serchValueArrayList = new ArrayList<>();

    public static void manuallInitArrayLenth() throws IOException {
        // Принемаем размер массива искомых значений
        System.out.print("Введите количество искомых параметров: ");
        someSerchValue = ReadingStringIntFile.readerConsolInt();

        // Инициализируем arraylist иcкомыми значениями
        for (int i = 0; i < someSerchValue; i++) {
            System.out.print("Введите" + " " + (i + 1) + " " + "искомое значение в столбике: ");
            serchValueArrayList.add(ReadingStringIntFile.readerConsolString());
        }
        // Вызывается класс обрабатывающий файл
        SortFile.ReadAndSortFile();
    }
}

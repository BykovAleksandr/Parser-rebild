import java.io.IOException;

public class Menu {
    public static String fileFolder;
    // 1 Меню выбора метода
    static void choiceOfMethod() throws IOException {
        System.out.println("Укажите какой метод Вы выбрали: ");
        System.out.println("1) Найти совпадения по SKU (введите 1)");
        System.out.println("2) Сортировать по совпадению (введите 2)");
        System.out.print("Укажите ваш вариант: ");

        int inValue = ReadingStringIntFile.readerConsolInt();
        System.out.println();
        if (inValue == 1)
        {
            // добавить код метода
            System.out.println("Метод не подключен");
        }
        else if (inValue == 2)
        {
            IdentifyYorN();
        }
        else {
            choiceOfMethod();
            System.out.println();
        }
    }

    // 2 Меню выбор методов, определяет Д/Н, что делать, какой метод поиска искомых значений использовать и вызывает его
    static void IdentifyYorN() throws IOException {
        System.out.println("Укажите способ поиска искомых параметров");
        System.out.print("Через файл/в ручную (Да через файл/Нет в ручную)  (Д/Н): ");
        String inStringValue = ReadingStringIntFile.readerConsolString();

        if (inStringValue.equalsIgnoreCase("Д") || inStringValue.equalsIgnoreCase("L")) {
            System.out.println("FromFileSetProp");
        } else if (inStringValue.equalsIgnoreCase("Н") || inStringValue.equalsIgnoreCase("Y")) {
            ManuallSetProp.manuallInitArrayLenth();
        } else {
            IdentifyYorN();
            // обработать искючения
        }
    }

    // 3 Меню выбора. Укажите путь к файлу
    public static String fileFolder() throws IOException {
        System.out.print("Укажите путь к файлу и его имя ( res//test.txt ): ");
        fileFolder = ReadingStringIntFile.readerConsolString();
        return fileFolder;
    }
}

import java.io.IOException;

public class ChoiceOfMethod {

    // Выбор метода
    static void choiceOfMethod() throws IOException {
        System.out.println("Укажите какой метод Вы выбрали: ");
        System.out.println("1) Найти совпадения SKU (введите 1)");
        System.out.println("2) Сортировать по совпадению (введите 2)");

        int inValue = ReadingStringIntFile.readerConsolInt();
        if (inValue == 1)
        {
            System.out.println("Метод не подключен");
        }
        else if (inValue == 2)
        {
            SortEqules.IdentifyYorN();
        }
        else {
            choiceOfMethod();
            System.out.println();
        }
    }
}

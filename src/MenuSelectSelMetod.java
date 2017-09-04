import java.io.IOException;

public class MenuSelectSelMetod {

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
            MenuSelectYorN.IdentifyYorN();
        }
        else {
            choiceOfMethod();
            System.out.println();
        }
    }
}

import java.io.IOException;
import java.sql.SQLOutput;

public class MenuSelectYorN {

    //Метод определяет Д/Н, что делать, какой метод поиска искомых значений использовать и вызывает его
    static void IdentifyYorN() throws IOException {
        System.out.println("Укажите способ поиска искомых параметров");
        System.out.print("Через файл/в ручную (Да через файл/Нет в ручную)  (Д/Н): ");
        String inStringValue = ReadingStringIntFile.readerConsolString();

        if (inStringValue.equalsIgnoreCase("Д") || inStringValue.equalsIgnoreCase("L")){
            System.out.println("FromFileSetProp");
        }
        else if (inStringValue.equalsIgnoreCase("Н") || inStringValue.equalsIgnoreCase("Y")){
            System.out.println("ManuallySetProp");
        }
        else
        {
            IdentifyYorN();
            // обработать искючения
        }
    }
}

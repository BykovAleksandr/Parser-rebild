import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
       // Вызов класса для выбора метода
        MenuSelectSelMetod.choiceOfMethod();

        for (String print : SortFile.readFileStringArrayList)
            System.out.println("Поток: " + print);
        System.out.println();
        for (String print : SortFile.sortedArraList)
            System.out.println("Отсортированый массив: " + print);

        System.out.println("The END");
    }
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OutFile {
    public static void outFile(ArrayList<String> stringArrayList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("res//txt-out.txt"))) {
            String sortValue;
            for (int i = 0; i < stringArrayList.size(); i++) {
                sortValue = stringArrayList.get(i);
                bw.write(sortValue + "\n");
                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}

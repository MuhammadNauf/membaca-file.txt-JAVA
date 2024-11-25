import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class index {
    public static void main(String[] args) {
        String filePath = "D:\\AlgoritmaDanPemograman\\baca_file\\file.txt";
        String fileContent = readFile(filePath);
        System.out.println(fileContent);
    }

    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
        return content.toString().trim();
    }
}

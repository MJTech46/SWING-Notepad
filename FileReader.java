import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class FileReader {

    public static String read(String filePath){
        String outputText = "";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                //System.out.println(line);
                outputText= outputText+ "\n" + line;
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
        return outputText;
    }
}

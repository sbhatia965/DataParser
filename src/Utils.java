import java.io.File;
import java.io.IOException;
import java.util.*;

public class Utils {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016ElectionResults(String data){
        ArrayList<ElectionResult> results = new ArrayList<>();
        String[] lines = data.split("\n");

        for(int i = 1; i < lines.length; i++){
            String[] infoPerLines = lines[i].split(", ");

        }
    }
}


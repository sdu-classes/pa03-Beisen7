import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public String[] readFile(String filename) {
        int count = 0;
        String[]emptyArray= new String[0];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                count++;
                line = reader.readLine();
            }
            reader = new BufferedReader(new FileReader(filename));
            line = reader.readLine();
            String[] array = new String[count ];
            count = 0;
            while (line != null) {
                array[count] = line;
                count++;
                line = reader.readLine();
            }
            reader.close();
            return array;
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return emptyArray;
    }
}

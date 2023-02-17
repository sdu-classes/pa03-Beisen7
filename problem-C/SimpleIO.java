import java.io.*;

public class SimpleIO {
    public FileWriter readFile(String filename) throws IOException {
        int count = 0;
        FileWriter fileWriter = new FileWriter("output.txt");
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
            String temp;
            int index= 0;
            int countOfThe;
            while (line != null) {
                temp = line;
                line = line.toLowerCase();
                countOfThe = 0;
                while (true) {
                    index = line.indexOf("the", index);
                    if (index != -1) {
                        countOfThe++;
                        index += "the".length();
                    } else {
                        break;
                    }
                }
                array[count]=temp+"["+countOfThe+"]";
                count++;
                line = reader.readLine();
            }
            reader.close();
            try {
                for (String str : array) {
                    fileWriter.write(str + " ");
                }

                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return fileWriter;
    }
}

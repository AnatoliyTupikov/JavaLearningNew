package Lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileHandler {
    public static List<String> readFile(String filePath) {
        FileInputStream fis = null;
        try {
            return Files.readAllLines(Paths.get(filePath));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return List.of();
    }

    public static void writeToFile(String value, String filePath) {
        try {
            Files.writeString(Paths.get(filePath), value, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void concatFiles(String outFilePath, String... inputFilesPaths) {
        for (String fp : inputFilesPaths) {
            var res = readFile(fp);
            for (String str : res) {
                str = str + "\n";
                writeToFile(str, outFilePath);
            }
        }
    }

    public static void replaceInFile(String targetString, String filePath) {
        var str = readFile(filePath);
        String tempRes = "";
        for (String s : str) {
            tempRes = tempRes  + s + "\n";
        }
        String cleaned = tempRes.replaceAll("[^\\p{L}\\p{N}]", targetString);

        try {
            Files.writeString(Paths.get(filePath), cleaned);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

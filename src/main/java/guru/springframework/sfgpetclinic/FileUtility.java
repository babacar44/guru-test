package guru.springframework.sfgpetclinic;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

;


public class FileUtility {

    private static void toFile_bad(String contents, File file) throws IOException {

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(contents);
    }

    public static void toFile_better(String contents, File file) throws IOException {

        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file), UTF_8)) {
            writer.write(contents);
        }
    }
}

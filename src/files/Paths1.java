package files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Paths1 {
    public static void main(String[] args) {
        Path path = Paths.get("C://");
        System.out.println(path);

        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            directoryStream.forEach(contents -> System.out.println(contents.getFileName()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

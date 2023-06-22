package IOStream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;


public class File {
    public static void main(String[] args) throws IOException {
//        Path folder = Paths.get(System.getProperty("user.home"));
        Path folder = Path.of(System.getProperty("user.home"));
        Stream<Path> stream = Files.list(folder);
        stream.forEach(file -> System.out.println(folder));

//        Files.readAllLines(Paths.get(folder.toAbsolutePath()+java.io.File.separator + "test.txt"));
        Path fileTXT = Paths.get(System.getProperty("user.home") +java.io.File.separator +  "test.txt");
        List<String> lines = Files.readAllLines(fileTXT);//reads the contents of the file
        lines.forEach(System.out::println);
        String msg = "Hello";
       Files.writeString(fileTXT, msg, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        lines.forEach(System.out::println);

        Properties properties = System.getProperties();
        for (Object o : properties.keySet()) {
            System.out.println(o);
        }
        String userFolder = System.getProperty("user.home");
        System.out.println(userFolder);

    }
}

import java.util.Arrays;
import java.util.List;

public class StringToUppercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java-stream", "stream-filter", "stream_map","streams");
        list.stream().filter(s -> s.contains("-"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }
}

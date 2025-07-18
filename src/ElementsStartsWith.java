import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementsStartsWith {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("apple", "banana", "orange", "grape", "alovera");

        long count = elements.stream().filter(s ->s.startsWith("a")).count();
        List<String> fruit = elements.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println(count);
        System.out.println(fruit);
    }
}
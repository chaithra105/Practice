import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> listoffruits = Arrays.asList
                ("apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "orange");
        List<String> l = listoffruits.stream().distinct().collect(Collectors.toList());
        System.out.println(l);
    }
}

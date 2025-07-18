import java.util.Arrays;
import java.util.List;

public class LastElementInTheList {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList
                ("apple", "banana", "orange", "grape");
        String lastElement = fruits.getLast();
        System.out.println(lastElement);
    }
}

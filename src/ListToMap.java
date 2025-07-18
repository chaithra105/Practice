import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Map<String, Integer> map=
                list.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
               System.out.println(map);

//        Map<Integer, List<String>> map2 =  list.stream()
//        .collect(Collectors.groupingBy(String::length));
//               System.out.println(map2);
//               Map<Object, List<String>> map1 = list.stream()
//                       .collect(Collectors.groupingBy(s -> s.charAt(0).));
//               System.out.println(map1);
    }
}

import java.util.*;

public class MaxMinValue {

    public static int findMax(List<Integer> list){
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(sortedlist.size() - 1);

    }
    public static int findMin(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }

    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5,7);
        System.out.println("Maximum value in a given List : " + findMax(list));

        System.out.println("Minimum value in a given List : " + findMin(list));
    }
}


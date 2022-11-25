package Kollektions.Array_List;
import java.util.*;
import java.util.stream.Collectors;

public class Metod_Remove_All {
    public static void main(String[] args) {
        int arrayA[]={124,342,54,2345,23,2};
        int arrayB[]={124,342,54,2345,23,2};

        List<Integer> listA = Arrays.stream(arrayA).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(arrayB).boxed().collect(Collectors.toList());

        listA.removeAll(listB);
    }
}

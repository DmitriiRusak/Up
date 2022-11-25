package myLibrary.deistvia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Iz_massiva_int_V_List {
    public static void main(String[] args) {
        int arrayA[]={124,342,54,2345,23,2};
        int arrayB[]={124,342,54,2345,23,2};

        List<Integer> listA = Arrays.stream(arrayA).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(arrayB).boxed().collect(Collectors.toList());
    }
}

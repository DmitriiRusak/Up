package myLibrary.deistvia;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List_Of_Integers_To_Array_int {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(11,42,534,23,426,7,23);
        int array[]=list.stream().mapToInt(i -> i).toArray();
    }
}

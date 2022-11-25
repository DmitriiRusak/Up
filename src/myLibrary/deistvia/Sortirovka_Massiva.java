package myLibrary.deistvia;

import java.util.Arrays;

public class Sortirovka_Massiva {
    public static void main(String[] args) {
        String stringArray[]={"42","11","25","43","32","77","41"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        int intArray[]={534,22,13,2,65,2};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}

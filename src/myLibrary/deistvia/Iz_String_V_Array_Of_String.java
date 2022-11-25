package myLibrary.deistvia;

import java.util.Arrays;

public class Iz_String_V_Array_Of_String {
    public static void main(String[] args) {

        String string= "privet na dvore segodnia oktiabr 2022 goda";
        String array1[]=string.split(" ");

        System.out.println(Arrays.toString(array1));

    }
}

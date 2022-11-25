package arena;

import operatori.Instance_Of;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Arena2 {
    static void obratniiOtschet(int i){

        if (i == 0) {
            return;
        }else {
            System.out.println(i);
            obratniiOtschet(--i);
        }
    }

    public static void main(String[] args) {
        obratniiOtschet(150);


    }
}

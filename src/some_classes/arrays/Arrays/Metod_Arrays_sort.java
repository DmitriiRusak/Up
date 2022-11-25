package some_classes.arrays.Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

//metod sortiryet lyboi array v vozrastayschem poriadke
//  the name of an array in Java is actually a reference to the place in memory where the array is stored-
// otsyda i vozmozznost tipa array.length;
public class Metod_Arrays_sort {
    public static void main(String[] args) {
        String stringArray[]={"42","11","25","43","32","77","41"};
        Arrays.sort(stringArray);
        System.out.println("Otsortorovann "+Arrays.toString(stringArray));

        int intArray[]={534,22,13,2,65,2};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.stream(intArray).sum());

        int clone []=intArray.clone();
        System.out.println("Clone "+Arrays.toString(clone));

    }
}

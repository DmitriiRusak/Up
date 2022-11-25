package some_classes.arrays.Stream.instream;
// Metod vozvraschaet massiv chisel, kotorie iteriryytsia ot znacheniia pervogo orgymenta i dobovliaa edinicy (1) do veleichini
//vtorogo argymenta
//eto ne klass a interfeis, zatochenni dlia raboti s primitivnim tipom dannix int.
//Sintaksis kak i v rabote s stream. t.e  istochnik_dannix---->promezzytochnie_operatori----->terminalnie_operatori

import java.util.Arrays;
import java.util.stream.IntStream;

public class Metod_RangeClosed {
    public static void main(String[] args) {
        int array[]= IntStream.rangeClosed(5, 10)//vozvraschaet [5, 6, 7, 8, 9, 10]; t.e. pervii orgyment eto start
                .toArray();         //vtoroi eti finish. Rezyltatom metoda iavliaetsia array int[] pervii element raven
                            // pervomy argymenty metoda. dalshe idet yvelichenie na 1 edinicy eto i est-vtoroi element massiva.
                             //esche primer:   int array[]= IntStream.rangeClosed(1, 5) [1, 2, 3, 4, 5];


        int array1[]= IntStream.rangeClosed(1,10).map(x->x*2).toArray();
        System.out.println(Arrays.toString(array1));

    }
}

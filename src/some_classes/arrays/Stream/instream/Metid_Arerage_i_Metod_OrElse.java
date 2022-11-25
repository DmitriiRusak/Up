package some_classes.arrays.Stream.instream;

import java.util.Arrays;
import java.util.stream.IntStream;

//Metod vozvraschaet ---- averege iz vsego stream-a, no tip vozvraschaemogo znacheniia OptionalDouble, dli togo chtobi
//ego privesti k naprimer double ili int mozzno ispolzovat metod orElse();
//metod orElse() ---- vozvraschaet znachenie kotoroe predstavleno v stream. V nashem slychae eto OptionalDouble, esli
// nikokogo znacheniia net to vozvraschaetsia znachenie ykazannoe v parametrax metoda (zdes 0).
public class Metid_Arerage_i_Metod_OrElse {
    public static void main(String[] args) {
        int array[]={35,4,62,674,8,63,4};
        System.out.println(Arrays.stream(array).average());                //OptionalDouble[121.42857142857143]
        System.out.println(Arrays.stream(array).average().orElse(0)); //               121.42857142857143
        System.out.println((int)Arrays.stream(array).average().orElse(0));// mozzno zdelat privedenie tipov (k int naprimer)

        System.out.println(Arrays.stream(array).sum());               //schitaet symmy elementov,vozvraschaet polychennoe znachenie

        IntStream.of(array).average().getAsDouble();                        //vozvraschaet znachenie v double;



    }
}

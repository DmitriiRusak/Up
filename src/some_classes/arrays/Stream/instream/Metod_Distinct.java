package some_classes.arrays.Stream.instream;
import java.util.Arrays;
// Metod sortiryet stream i ostovliaet tolko ynikalnie elementi v nem.
public class Metod_Distinct {
    public static void main(String[] args) {
        String str="Blagopriiatnii";
        int array[]=str.chars()
                .distinct()
                .toArray();


        System.out.println(Arrays.toString(array));//[66, 108, 97, 103, 111, 112, 114, 105, 105, 97, 116, 110, 105, 105]
        //s metodom .distinct()                      [66, 108, 97, 103, 111, 112, 114, 105, 116, 110]
    }
}

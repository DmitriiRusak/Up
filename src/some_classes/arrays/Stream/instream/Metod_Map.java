package some_classes.arrays.Stream.instream;
import java.util.*;
import java.util.stream.IntStream;
//metod map() perebiraet danni stream i proizvodit s kazzdim elementom deistvie ykazannoe v parametrax.
//chtobi sozdat IntStream iz array int[] nado -> IntStream.of(nazvanie massiva) i dalshe yzze intermidiate operacii
public class Metod_Map {
    public static void main(String[] args) {
        int array1[]={23,2,56,33,1,624,54};
        //int intArray[]=IntStream.map(x->x*2).toArray(); tak ne pravilno

         int[] multiplicatedArray =IntStream.of(array1).map(i -> i*2).toArray();
        System.out.println("ymnozzenie "+Arrays.toString(multiplicatedArray));  //[46, 4, 112, 66, 2, 1248, 108]

        int[] dividedArray =IntStream.of(array1).map(i -> i/2).toArray();
        System.out.println("delenie "+Arrays.toString(dividedArray));  //delenie [11, 1, 28, 16, 0, 312, 27]

System.out.println("---------------------------------------------------------------------------------------------");
 //schitaet ynikalnie bykvi v string. Ochen kryto po lokonichnosti.
        String sentence="vsem xoroshego i prodyktivnogo dnia";
        boolean b = sentence.chars()
                .map(Character::toLowerCase) //vozvraschaet stream v lower Case
                .filter(Character::isAlphabetic)//vozvraschaet strem s simvolomi ydovletvoriayschimi ysloviy (t.e. tolko bykvi)
                .distinct() // Returns a stream consisting of the distinct elements of this stream
                .count() == 26;// @return the count of elements in this stream i esli on == 26 return true
    }
}

package some_classes.arrays.Stream.instream;
//Metod .chars() stroit stream iz znachenii iz ASCII kotorim sootvetstvyyt simvoli iz String.
//toArray() - zapisvaet eti cifri v int array.
//String str = "Blagopriiatnii";
//           B   l    a   g    o    p    r    i    i    a   t    n    i    i
//          66, 108, 97, 103, 111, 112, 114, 105, 105, 97, 116, 110, 105, 105
import java.util.Arrays;

public class String_V_Stream_Of_Int {
    public static void main(String[] args) {
        String str="Blagopriiatnii";
        int array[]=str.chars()
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(array));//[66, 108, 97, 103, 111, 112, 114, 105, 105, 97, 116, 110, 105, 105]
        //s metodom .distinct()                      [66, 108, 97, 103, 111, 112, 114, 105, 116, 110]
    }
}

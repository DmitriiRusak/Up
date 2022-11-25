package some_classes.arrays.Stream.instream;

import java.util.List;
import java.util.stream.Collectors;
//Metod_Filter - eto intermidiate operaciia, metod vozvraschaet stream elementov kotorie sootvetstvyyt ysloviy
//(predicaty). V dannom primere esli element (on simvoliziryetsia 'e') instanceOf Integer to ego ostavliayt v
//streame, ostalnix za bort.
public class Metod_Filter {
    public static List filterList(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .collect(Collectors.toList());
    }



//-----------------------------------------------------------------------------------------------------------------
//esche primer filter gde proveriaetsia chto element NE iavliaetsia String i esli eto tak to ego sobirayt...
    public static List filterList1(final List list) {
        return (List) list.stream().filter(o -> !o.getClass().equals(String.class)).collect(java.util.stream.Collectors.toList());
    }




//-----------------------------------------------------------------------------------------------------------------
//esche primer: zdes s pomosch`y filter() ischyt i elementi kotorie >0, na vixode polychayt stream takix elementov
// zatem schitayt v count, i vse eto privodiat k int
//
// return (int) map.values().stream().filter(e -> e > 0).count();



//-----------------------------------------------------------------------------------------------------------------

    public static boolean isValid(char[] walk) {
//proverka na to chto simvolov 'n' i 's' stolko-zze skolko i 'w' i 'e' i chto vsex simvolov v stroke ==10;
        String str = new String(walk);
        return str.chars().filter(e -> e == 'n').count()  ==  str.chars().filter(e -> e == 's').count()
                &&
                str.chars().filter(e -> e == 'w').count()  ==  str.chars().filter(e -> e == 'e').count()
                &&
                str.chars().count() == 10;
    }


    public static void main(String[] args) {

    }
}

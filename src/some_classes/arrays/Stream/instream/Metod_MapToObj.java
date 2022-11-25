package some_classes.arrays.Stream.instream;

import static java.util.stream.Collectors.joining;
//Metod vozvraschaet stream iz ob`ektov.
public class Metod_MapToObj {
    public static void main(String[] args) {
//zdes pokazano kak s pomosch`y dannogo metoda skonkotinirovat simvoli. T.e. mi berem simvol 'c' i delaem
//'c'+""+'c'= 'cc'
        String s="Opanki";
         s.chars().mapToObj(c -> (char) c + "" + (char) c).collect(joining());
    }
}

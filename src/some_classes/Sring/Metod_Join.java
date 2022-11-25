package some_classes.Sring;
//Metod preobrazyet massiv iz String-ov v String.
//Dalee naprimer mozzno zdelat int.

//delimetr eto to kak bydyt razdeliatsia Stringi v rezyltiryyschei String

public class Metod_Join {
    public static void main(String[] args) {
        String stringArray[]={"pervii element", "vtoroi element", "tretii element"};
        String string=String.join("-",stringArray);
        System.out.println(string); //pervii element-vtoroi element-tretii element

        string=String.join("+",stringArray);
        System.out.println(string); //pervii element+vtoroi element+tretii element

        String numbers[]={"1", "3", "5", "2"};
        int intRezalt=Integer.valueOf(String.join("",numbers));
        System.out.println(intRezalt); // 1352
//nado pomnit chto esli perevodia v int v isxodnoi stroke bydyt ne cifri to "numberFormatException"

        // skleit vse slova v String-e
        String sentence="Ny zdravstvyi moi sladkii proger";
        sentence=sentence.replaceAll(" ","");// "Nyzdravstvyimoisladkiiproger"

    }
}

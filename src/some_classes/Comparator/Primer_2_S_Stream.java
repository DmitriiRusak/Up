package some_classes.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//stroka razbivaetsia na massiv i preobrazyersia v strem, stream vizivaet metod .sort kotorii
//prinimaet comparator, dalee kazdii eslement massiva podvergaetsia metody replaceAll, kotorii
//ybiraet vse bykvi iz kazzdogo elementa, ostavliaa tolko cifri, eti cifri i sortiryytsia blago
//daria komparatory, sootvetstvenno i stringi sortiryytsia. Metod replaceAll ne izmeniaet words
// poetomy kaktolko replaceAll kak-bi zakanchivaetsia to elementi preobretayt svoy isxodnyy
// formy (t.e. bykvi vozvraschaytsia) dalee. Koroche xyi ego znaet
public class Primer_2_S_Stream {
    public static String order(String words) {
        words = Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                //.reduce((a, b) -> a + " " + b).get();
                .reduce((a, b) -> a + " " + b).toString();
        return words;
    }

    public static void main(String[] args) {
        String message="Priv3et doro1gie dryz`ia2";
        String rezult=Primer_2_S_Stream.order(message);
        System.out.println(rezult);

//esche odin primer, ia poproboval zdelat: razbit na array s pomosvh`y .split(), polychenni array otsortirovat s pomosch`y .sorted(comparator) <--
//zdes kak-bi sozdaesh metod kotorii vipolniaet comparator pri etom elementi iznachalnogo massiva ne meniaytsia, oni sortiryytsia v toi sortirovke
//chto zadana v comparatore. Dalee v reduce ia razbivay elementi s pomosch`y probela, tak-kak oni 'slipshiesia', i metod get vozvraschaet massiv v
//str.  Poka kak-to tak. Peredelal na .collect(Collectors.joining(" "));
        String str="Dozzat3 d2o po1nimaniia";
        str=Arrays.stream(str.split(" "))
                .sorted(Comparator.comparing(s->Integer.valueOf(s.length())))
                .collect(Collectors.joining(" "));
        System.out.println(str);





    }

}

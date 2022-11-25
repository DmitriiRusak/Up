package some_classes.Sring;

import java.util.ArrayList;
import java.util.Arrays;
//ideia etogo primera: Sortirovka massiva String-ov s pomoschy opredelennogo v String metoda compareTo(String st);
//compareTo(); sravnivaet stroki leksikograficheski. Dak a chto eto takoe blia, leksikograficheskoe sravnenie!
//V obschem y kazzdogo simvola svoi nomer i po nim i sravnivayt.
public class MetodCompareToSSortirovkoiStrok {
    public static void main(String[] args) {

        String stringArray[] = {"this", "is", "a", "test", "of", "a", "string", "sort"};
        String temp;

        System.out.println("Iznachalnii massiv: "+Arrays.toString(stringArray));


        for (int a = 0; a < stringArray.length; a++) {
            for (int b = 0; b< stringArray.length-1; b++) {
                int leksikograf=stringArray[b].compareTo(stringArray[b+1]);
                if (stringArray[b].compareTo(stringArray[b+1]) > 0) {
                    temp = stringArray[b + 1];
                    stringArray[b + 1] = stringArray[b];
                    stringArray[b] = temp;
                }
            }
        }
        System.out.println("Otsortirovan massiv: "+Arrays.toString(stringArray));

        for(int i=0;i<26;i++) {
            char a= (char) (char) ('a'+i);
            System.out.print(a+" "+i+"; ");
        }




    }
}
//this.compareTo(is)=11; t.e. this>is; t.e. v sortirovannom massive idet: is, this
//this.compareTo(a)=19; t.e. this>a; t.e. v sortirovannom massive idet: is, a, this <--chto-to idet ne tak, razobralsia(bilo russkoe 'a' vmesto ang-go 'a')

/*  Realizaciia compareTo() v String osnovivaetsia: vsem bykvam alfavita prisvoen poridkovii nomer
* a b c d e f g h i j k  l   m  n  o  p  q  r  s  t  u  v  w  x  y  z
* 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
* String a="this";
* String b="that";
* a.compareTo(b)= metod poocheredi sravnit chemy ravno (kakoe znachenie sootvetstvyet) pervii simvol stroki  'a', t = 19;
* zatem 'posmotrit chemy raven pervii simvol iz stroki 'b', 't'=19.
* Metod otnimaet ot znacheniia pervogo simvola stroki a (t.e. simvol 't'=19) znachenie pervogo simvola stroki b(t.e. simvol 't'=19).
* Pochemy znachenie ot stroki a otnimaem znachenie stroki b, a ne naoborot? Potomychto imenno stroka a vizivaet metod i v para-
* metrax metoda peredaet stroky b. T.e. kak ia ponimay mi sravnivaem stroky a s b. (konechno mozzno i naoborot). Metod vernet chislo.
*   1) esli rezyltat < 0 eto znachit chto simvol stroki a stoit (imeet nomer)blizze k nachaly  alfavita chem simvol (ego nomer) stroki b
*       v etom slychae schitaetsia chto kak bi stroka a menshe chem stroka b
*   2) esli rezyltat 0, znachit poriadkovie nomera oboix simvolov ravni (t.e. simvoli odinakovie).
*   3) esli rezyltat > 0 eto znachit chto simvol stroki 'a' stoit dalshe ot nachala alfavita chem simvol (ego poridkovii nomer)
*       stroki 'b'. v etom slychae kak bi stroka 'a' bolshe chem 'b';
* V nashem primere simvoly odinakovi i znacheniia y nix odinakovi, v etom slychae sravnivaytsia sledyyschie poocheredi simvoly.
* Poka ne vstrechaytsia raznie simvoly, y nas eto simvoli #3 t.e. y stroki 'a' eto-'i', a y stroki 'b' eto-'a'.
* i=8; a=0; 8-0=8; Sootvetstvenno soglassno realizacii metoda vernetsia chislo 8, ono > 0. Dalshe metod ne vipolniaetsia.
* Sootvetstvenno stroka 'a' > chem stroka 'b'. t.e. stroka 'a' stoit dalshe ot nachala alfavita, a stroka 'b' blizze k nachaly.
* Imeet znacheniia kakaia stroka vizivaet metod. Tak a.compareTo(b)=8; b.compareTo(a)=-8; Vsegda vernyvsheesia znachenie
* otnositsia k vizivayschei metod stroke.
*
*
 */







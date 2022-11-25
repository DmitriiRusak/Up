package some_classes.arrays.Stream;

public class Osobennosti_Ispolzovaniia_Metoda_Reduce {
    public static void main(String[] args) {
        long lon = 1234;
        lon=Long.toString(lon).chars().reduce(0,((left, right) -> left + right));
        System.out.println(lon); //202

//Ia perevel long v string, string v stream of chars:'1','2','3','4', v metode reduce ia
// xochy polychit symmy vsex elementov. No
//polychil = 202. POCHEMY ?. Potomy chto v ASCII '1'=49; '2'=50; '3'=51; '4'=52; 49+50+51+52 = 202 !!!
//No ia xochy polychit symmy iz svoego streama kak: 1 + 2 + 3 + 4; ???
//Esli ot char '1' zdelat  '1'-'0' to polychim znachenie intovoe ravnoe 1. Potomy chto '1'=49; '0'=48; 49-48=1;
//eto kasaetsia vsex cifr predstavlennix kak char, t.e.- '1','2','3'...

        lon=1234;
        lon=Long.toString(lon).chars().reduce(0,(r,i) ->r + (i-'0'));
        System.out.println(lon); //10
//Metod .reduce (0, (r , i) -> r + (i-'0')); dak kak on vse-ze rabotaet?
//pochemy, esli mi skladivaem dva elementa #1 + #2 to ykazivaem -'0' tolko k odnomt elementy?
// logichno bilo bi zdelat: (r-'0') + (i-'0'), t.e. perevesti
//v int i levii element i pravii, zatem ix slozzit, a potom?
// Potom rezyltat popodaet snova pod nashe yslovi (r-'0') + (i-'0').Kak bit schas???
//Soglasno etomy predstavleniy nado  opiat: (rezyltat-'0') + (i-'0'), chto-to ne to polychaetsia.

//  Pochemy -'0' ykazivaem tolko v odnom elemente ???
// soglassno nashemy varianty metoda (r,i) ->r + (i-'0') dolzzno polychitsia cht-to vrode
// 49 + (50-48) + (51-48) + (52-48) = 58   No mi polychili pravilnoe reshenie  1+2+3+4= 10
//vozmozzno deistvie -'0' bydet proizvedeno v samom konce metoda nad polychennim rezyltatom,
// t.e. 58-'0'. 58-48=10 ?
//kak bi proverit ?
    }
}

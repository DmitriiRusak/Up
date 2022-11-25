package some_classes.charactr;

public class Char_I_Cifri {
    public static void main(String[] args) {
        char odin='1';
        char piat='5';
        System.out.println(piat+odin);//102, skladivaet znacheniia iz unicode.
        System.out.println("kakaia-to stroka "+piat+odin);//kakaia-to stroka 51. V etom slychae kak bi skleil
        System.out.println(piat+" "+odin);// 5 1 <- tyt poniatno

        System.out.println(piat-odin);// Ves prikol nachenaetsia zdes! esli proizvodit operecii vichetania, to char ne nado
                                //perevodit v int. Cifram prisvoeni takie znacheniia v ASCII chto mozzno vichetat polychaia
                                //pravilnii rezyltat. Primer: '5'-'1'='4'
        //Matematicheski vozmozzno eto ne ochen polezno / primenimo.
        //No chto esli eto ispolzovat kak privedenie char k int no bez specialnix metodov, a zapisivaia rezyltat vichitaniia v int peremennyy.
        char nol = '0';   // '0'=ASCII=48;
        char deviat= '9'; // '9'=ASCII=57
        System.out.println("nol= "+(int) deviat);

        //kak polychit int iz char?
        int variableInt=deviat-nol; //57-48=9; i zdes avtomaticheski priravnivaetsia k int.
        System.out.println("peremennaia tipa int variableInt = "+variableInt);
        //itak esli ot lyboi char-cifri otniat char-nol to polychaem int-cifry.


    }
}

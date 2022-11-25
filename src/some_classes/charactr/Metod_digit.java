package some_classes.charactr;
//Preobrazyet char v int: "4" -> 4
//Metod Character.digit(param_1, param_2); beret simvol (char) (xochesh iz String, xochesh iz char array[]) ego nyzzno podstavit
// v param_1, a v param_2 nado ykazat sistemy schisleniia v kotoroi metod dolzzen rabotat. Metod (esli danni simvol otobrazzaet
// cifry) vernet int-ovoe znachenie dannogo simvola v ykazannoi sisteme schisleniia. Esli simvol (cifra) vixodit za ramki
//zadannoi sistemi schisleniia, metod vernet -1.


//Yslovie adachi: zdelat metod kotorii preobrazyet cifri v stringe. Esli cifra < 5 ee nado pomeniat na 0, esli > 5 to na 1;
//inpyt garantirovano ne null i soderzzit tolko cifri no v String, naprimer "2354".
//Metod vozvraschaet preobrazovannyy string

//Xitrost v tom chto simvol ne sravnish s cifroi. ("3" < 5 eto ne korektno), nado posimvolno proverit (prochitat) vxodiaschyy
//stroky i preobrazovat ee kazzdii simvol v intovoe predstavlenie (char v int).
//Integer.valueOf(char ch) - vozvraschal predstavlenie simvola v tablice ASCII, privedenie k (int) ne dovalo zelaemogo rez-ta.
public class Metod_digit {

    public static String fakeBin(String numberString) {
        String temp=numberString;
        numberString="";
        for(int i=0;i<temp.length();i++) {
            numberString += ( Character.digit(temp.charAt(i),10) < 5) ? "0":"1"; //nash syper metod
        }
        return numberString;
        //return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1"); mozzno i tak )))

    }

    public static void main(String[] args) {
        String numbers="354645654737";
        System.out.println(Metod_digit.fakeBin(numbers));
    }
}

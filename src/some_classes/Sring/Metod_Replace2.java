package some_classes.Sring;
//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean
// and be case insensitive. The string can contain any char.
//t.e. poschitat odinakovoe li kolichestvo simvolov 'x' i 'o', pri etom shrift y isxodnoi stroki mozzet bit raznii,
// vernyt booleanovskoe znachenie.(trye/false).

public class Metod_Replace2 {

    public static boolean getXO (String str) {
//eto moe reshenie zadachi.
        int xCount=0;
        int oCount=0;
        char charArray[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if( charArray[i]=='X' || charArray[i]=='x')xCount++;
            else if(charArray[i]=='O' || charArray[i]=='o')oCount++;
        }
        if(xCount==oCount)return true;
        else if(xCount==0 && oCount==0)return true;
        else return false;

    }

    public static boolean XorO (String str) {
//zdes chel reshil v odny strochky. Poprobyy razobratsia.
//Pervoe chto zdelano - eto perevesti str v odin shrift (zdes toLowerCase();)

//dalshe vizivaem metod .replace(CharSequence target, CharSequence replacement). target - eto to chto mi ischem v str, ono
//imeet tip znachenie CharSequence, t.e. char. replacement eto to na chto bydetizmenen target esli on est v str.
//str.replace("o","").length() <-- zdes mi izmeniaem simvol 'o' na "" t.e. 'o' na nichego. Grybo govoria eto ravnoznachno
//ydaleniy iz str vsex simvolov 'o', pri etom izmenitsia i dlinna str. naprimer "olovo" -->"lv" . Takim obrazom mi polych-
//aem int kotorii raven iznachalnoe.length - kolichestvo ydalennix simvolov 'o'.esli etot int raven
//str.replace("x","").length(), to polychaetsia chto simvolov 'o' bilo ydaleno stolko-zze kak i 'x'. V etom slychae
//vernyt trye. V lybix drygix slychaiax vernetsia false.

//eshe raz!
//str.replace("o","").length() k primery ravno 20;  t.e. mozno int a =str.replace("o","").length()
//str.replace("x","").length() k primry ravno 15;
//20==15 ? net. Vernet false
        
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }
}

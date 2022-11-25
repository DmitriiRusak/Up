package some_classes.Sring;
//Metod replaceAll meniaet informaciy, predstavlennyy v regyliarnom virazzenii na
//na lybyy stroky.
//replaceAll(String regex, String replacement);
//regex <-- regyliarnoe virazzenie kotoroe mi ischem v stroke, esli ego naxodim to meniaem ego
//na replacement.
//zdes meniaem cifri 0t 0 do 5 na cifry 1. Nado znat regyliarnie virazzeniia.
import zadachi.naString.ZamenaSimvolov;

public class Metod_ReplaceAll {
    public String replaceDigits(String numbers){
        String temp;
        temp= numbers.replaceAll("[0-5]","1");
        return temp;
    }
    public static void main(String[] args) {
        String someString="123457210";
        System.out.println(someString);
        ZamenaSimvolov zamenaSimvolov=new ZamenaSimvolov();
        System.out.println(zamenaSimvolov.replaceDigits(someString));
    }
}

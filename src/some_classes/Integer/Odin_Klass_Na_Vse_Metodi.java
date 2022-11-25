package some_classes.Integer;

public class Odin_Klass_Na_Vse_Metodi {
    public static void main(String[] args) {
// Metod Integer.valueOf(String) vernet int iz String, no pri yslovii chto v String
// zapisani cifri. Primer: "2535". Esli tam simvoli to bydet oshibka: number formatException.
        String number="453453";
        int num=Integer.valueOf(number);

        String array[]={"32","77","41"};
        int rezalt= Integer.valueOf(String.join("", array));
        System.out.println(rezalt);

/////////////////////////////////////////////////////////////////////////////////////
//v chem raznica primeneniia .parseInt(String) i valueOf(String)---ne poniatno na etom etape.Oba metoda perevodiat String v int

        String st="-1241453";
        int r=Integer.parseInt(st);
        System.out.println("rezyltat .parseInt(String) "+r);
        r=Integer.valueOf(st);
        System.out.println("rezyltat .parseInt(String) "+r);

System.out.println("//////////////////////////////////////////////////////////////////////////////////");
//Integer.toString(int) <--po nazvaniy vse poniatno y String eto zze povedenie v metode String.valueOf(int)
//To-zze samoe mozzno polychit s pomosch`y valueOf();   Xm.
//Eto-chto polychaetsia? Vse dognal:
// Integer valueOf(String)<--vozvraschaet int iz string,
// Integer.parseInt(String)<--vozvraschaet int iz String
//
        String intToString=Integer.toString(r);
        System.out.println("Integer.toString(String)= "+intToString);
        String newInt=String.valueOf(r);
        System.out.println("String.valueOf(int)= "+newInt);






    }
}

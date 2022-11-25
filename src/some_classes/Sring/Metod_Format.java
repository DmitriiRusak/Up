package some_classes.Sring;

// Если нужно подставить строку мы пишем %s, если число — %d.
// %f	вещественное число: float, double
//%b	boolean
//%c	char
//%t	Date

public class Metod_Format {
    public static void main(String[] args) {

        String name="Santiago";
        int example=210;
        System.out.println(String.format("Hello, %s how are you doing today? %d", name,example));

        System.out.println("----------------------------------------------------------------------------");
        //metod mozzno ispolzovat dlia perevoda chisla v String. Naprimer
        int someInt=2354;
        String examp=String.format("%d",someInt);
        System.out.println(examp);  // "2354"

        System.out.println("----------------------------------------------------------------------------");
//Metod mozzno ispolzovat dlia okrygleniia chisla.Naprimer double do neskolkix (skolko xochesh) znakov posle zapiatoi
        double dl=1.255234;
        System.out.println(String.format("%.3f",dl));//1.255 <-- 3 znaka posle zapiatoi

    }
}
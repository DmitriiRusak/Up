package some_classes.Sring;
//danni metod razdeliaet stroky na neskolko strok ispolzyia dlia etogo regyliarnoe virozzenie
//no mozzno ispolzovat i obichnie simvoli, v dannom primere ia ispolzoval simvol probela, pri
//etom sam simvol po kotoromy razdelenie proisxodit - teriaetsia (ne ychitivaetsia).
//split()-vozvraschaet massiv strok!
import java.util.Arrays;

public class MetodSplit {
    public static void main(String[] args) {
        String string="Eto dlinnaia stroka kotoryy nado preobrazovat v massiv";
        String stringArray[]=string.split(" ");
        System.out.println(Arrays.toString(stringArray));
    }
}

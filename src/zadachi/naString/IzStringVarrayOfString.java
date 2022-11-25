package zadachi.naString;
//zdelat metod preobrazyyschii stroky v massiv iz strok.
//vse eto mozzno bilo zdelat s pomosch`y metoda split();, v argymenti metoda peredaetsia regyliarnoe virazzenie, no mozzno
// i prosto v dvoinix kavichkax kakoito simvol ili probel. V rezyltate polychaem stringovii massiv, pri etom sam simvol
// razdeleniia ne ychitivaetsia. Bliat etot ebanii metod menia ogorchil, ny v smisle .split();.....
import java.util.Arrays;

public class IzStringVarrayOfString {

    public static String [] stringToArray(String s) {
        char arrayChar[] =s.toCharArray();
        int sumOfSpace=0;

        for(int i=0;i<arrayChar.length;i++){        //schitay probeli v s, skolko probelov
            if(arrayChar[i]==' ')sumOfSpace++;    //stlko i slov
        }

        String stringArray[]=new String[sumOfSpace+1]; //sozday massiv dlinnoi v kolichestvo
        int stringArrayCount=0;                 // probelov +1 tak-kak slov na 1 bolshe
        String singleWord="";

        for(int i=0;i<arrayChar.length;i++){
            if(arrayChar[i] !=' '){           //esli simvol ne probel zapisvaem v temp string
                singleWord+=arrayChar[i];
            }
            else if(arrayChar[i]==' '){      //esli simvol probel, zapisvaem temp string v
                stringArray[stringArrayCount]=singleWord;  // massiv
                stringArrayCount++;
                singleWord="";
            }
            stringArray[stringArrayCount]=singleWord;//v konce zadannoi string 's' probela net,a slovo est.nado zapisat
        }
        return stringArray;
    }

    public static void main(String[] args) {
        String example= "privet na dvoer segodnia oktiabr 2022 goda";
        String array[]= IzStringVarrayOfString.stringToArray(example);
        System.out.println(Arrays.toString(array));


        String array1[]=example.split(" "); //mozzno ispolzovat .split() i vseee blia
    }
}

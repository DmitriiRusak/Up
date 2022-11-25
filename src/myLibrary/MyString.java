package myLibrary;

import java.util.Arrays;

public class MyString {


// Preobrazyet odny, sostoiaschyy iz neskolkox slov, stroky, v massiv strok,
// gde kazzdoe slovo eto element massiva.
    public String [] stringToStringArray(String s) {
        char arrayChar[] =s.toCharArray();
        int sumOfSpace=0;

        for(int i=0;i<arrayChar.length;i++){
            if(arrayChar[i]==' ')sumOfSpace++;
        }

        String stringArray[]=new String[sumOfSpace+1];
        int stringArrayCount=0;
        String singleWord="";

        for(int i=0;i<arrayChar.length;i++){
            if(arrayChar[i] !=' '){
                singleWord+=arrayChar[i];
            }
            else if(arrayChar[i]==' '){
                stringArray[stringArrayCount]=singleWord;
                stringArrayCount++;
                singleWord="";
            }
            stringArray[stringArrayCount]=singleWord;
        }
        return stringArray;
//String[] array = String.valueOf(s).split(" "); <--pizdec, net slov!!! ves metod v 1 stroky
    }
/*
*
*
 */
//Okazivaetsia est gotovii metod (kombinaciia) perevodiaschii stroky v massiv strok
    public void stringToStringArray2(String s){
        String[] array = String.valueOf(s).split(" ");//rezyltat=[privet, programmisti]
        String[] array1 = String.valueOf(s).split("");//rezyltat=[p, r, i, v, e, t,  , p, r, o, g, r, a, m, m, i, s, t, i]
        System.out.println(Arrays.toString(array)+" - length="+array.length);
        System.out.println(Arrays.toString(array1)+" - length="+array.length);
    }
/*
*
*
 */
// Metod Meniaet Vse Pervie bykvi V Slovax Na Zaglavnie.
//Esli stroka ne null i ona ne pysta
// razbivaem stroky na massiv stringov. V cikle sozdaem massiv charov i kazzdii element
//iz massiva strok priravnivaem massivy charov. Dalee, v massive charov pervii simvol
//preobrazyem v zaglavnuy bykvy.
//zapisvaem obratno v massiv strok vidoizmenenni massiv charov.
//Zatem nado zapisat massiv strok v odny finalnyy string.
//Est moment chto pri dobovlenii v finalnyy string massiva strok
//nado dobovliat i probel dlia korrektnogo otobrazzeniia,no pri etom chtob v konce ne bilo probela.
public String toJadenCase(String phrase) {
    if (phrase == null || phrase.isEmpty()) {
        return null;
    }
    String rezalt = "";
    String stringArray[] = phrase.split(" ");
    for (int i = 0; i < stringArray.length; i++) {
        char tempArray[] = stringArray[i].toCharArray();
        tempArray[0] = (char) (tempArray[0] & 95);
        stringArray[i] = String.valueOf(tempArray);
        if(i<stringArray.length-1) {
            rezalt += stringArray[i] + " ";
        }else rezalt+=stringArray[i];

    }
    return rezalt;
}
}

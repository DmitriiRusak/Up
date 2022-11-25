package myLibrary.deistvia;

public class Iz_Array_Of_String_V_String {
    public static void main(String[] args) {

        // sposob #1 ispolzovat String.join(delimetr, array);

        String arrayOfString[]={"privet", "ia", "polychay", "opit"};
        String rezult=String.join("",arrayOfString);
        System.out.println(rezult);//privetiapolychayopit  <--tak-kak delimetr iavliaetsia "" to stroka 'skleena'.
        rezult=String.join(" ",arrayOfString);
        System.out.println(rezult);//privet ia polychay opit <-- delimetr vistavlen na " " a ne na "".

        //sposob #2


    }
}

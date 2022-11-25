package myLibrary.deistvia;
// Preobrazovanie massiva char v String;
public class Iz_CharArray_V_String {
    public static void main(String[] args) {
        char[] chArr= {'n','w','s','n','e','e','n','s','n','e'};
        String str=String.valueOf(chArr);       // <-- sposob #1
        String str2=new String(chArr);          // <-- sposob #2

    }
}

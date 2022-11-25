package myLibrary.deistvia;

public class Propisnyy_Bykvy_V_Zaglavnyy {
    public static void main(String[] args) {

        //metod #1 ispolzyi Charakter.toUpperCase(ch);               ne pytat s String.toUpperCase();
        char ch='a';
        ch=Character.toUpperCase(ch);
        System.out.println(ch);

        //metod #2
        char ch1= 'b';
        ch1=(char)(ch1 & 95);
        System.out.println(ch1);
    }
}

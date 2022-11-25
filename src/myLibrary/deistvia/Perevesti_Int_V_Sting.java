package myLibrary.deistvia;

public class Perevesti_Int_V_Sting {
    public static void main(String[] args) {
        System.out.println("Sposob # 1 --------------------------------------------------------------------");
        int someInt=34520;
        String str=String.valueOf(someInt);
        System.out.println("Primenenie String.valueOf(int)= "+str+"\n");
        str="";

        System.out.println("Sposob # 2 --------------------------------------------------------------------");
        str=Integer.toString(someInt);
        System.out.println("Primenenie Integer.toString(int)= "+str+"\n");
        str="";

        System.out.println("Sposob # 3 --------------------------------------------------------------------");
        str+=someInt;
        System.out.println("Primenenie  str+=someInt= "+str+"\n");
        str="";

        System.out.println("Sposob # 4 --------------------------------------------------------------------");
        str=String.format("%d",someInt);
        System.out.println("Primenenie  String.format()= "+str+"\n");
        str="";
        System.out.println("--------------------------------------------------------------------");

    }
}

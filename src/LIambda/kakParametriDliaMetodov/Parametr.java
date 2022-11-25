package LIambda.kakParametriDliaMetodov;

//!!!!!!!!!!!***  lambda mozzno peredovat v parametrax drygomy metody ***!!!!!!!

public class Parametr {
    public static void main(String[] args) {
        int resalt=0;
        Showable showable;
        Showable showable1;
        showable= ()-> System.out.println("it`s time to selebrate");//<- mozzno peredovat lybyy ssilky
        showable1=()-> System.out.println("it`s getting interesting");// ot interfaisa i sootvetstvenno

        System.out.println(resalt=calcylate(22,200,showable));// imet kakyy-to drygyy logiky vzaimodeistvia
       System.out.println(resalt=calcylate(22,200,showable1));


    }
    //////////.///////////////////// sozdanie fynkcii/////////////////////////////////////////////
    //////////////////    kotoraia prinimaet v parametrax lambda    //////////////////////////////

    public static int calcylate(int x, int y, Showable showable) {
        int resalt=0;

        showable.show();

        if(x!=0&&y!=0){
            resalt=x+y;
            return resalt;
        }
        else return 0;
    }
}
/*
*
*
*
 */
interface Showable{
    void show();
}
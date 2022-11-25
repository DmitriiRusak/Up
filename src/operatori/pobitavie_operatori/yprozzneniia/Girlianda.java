package operatori.pobitavie_operatori.yprozzneniia;

import java.util.Random;
                //              YPR. DLIA ZAKREPLENIIA POBITOVIX OPERATOROV

//Imeetsia girlianda iz 32 lampochek.Kazzdaia lampochka imeet dva sostoianiia-vklychena/viklychena.
//V nachale programmi zadat slychainim obrazom kakie lampochki vklycheni/viklycheni
//realizovt:
//a)-metod kotorii bydet migat lampochkami zadannoe kolichestvo raz. (blink (int a, int count));
//b)-metod kotorii bydet zapuskat girliandy v rezzime begyschei stroki (run (int a) );
//v)-metod kotorii bydet viiasniat vklychena li lampochka na pervoi pozicii.
public class Girlianda {
    public static void main(String[] args) {
        Random random=new Random();
        int a=random.nextInt();
        statusLampochki(a);

        blink(a,5);

        System.out.println("----------------------------------------------------------------");

        run(a);



    }

    static void blink(int a,int count){

        for(int i=0;i<count;i++){
            System.out.println(Integer.toBinaryString(a));
            System.out.println(Integer.toBinaryString(~a));
        }
    }
    static void run(int a){

        for(int i=0;i<30;i++){
           // System.out.println(Integer.toBinaryString(a));
            a=a<<1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
    static void statusLampochki(int a){
       String b=(a&1)==0?"lampochka ne gorit":"lampochka gorit";
        System.out.println(b);
    }
    //lyboe chislo s operaciei (a & 1) bydet = 0 esli poslednii bit a==0; chto sootvetstvyet a eto chetnoe chislo
    //lyboe chislo s operaciei (a & 1) bydet = 1 esli poslednii bit a==1; chto sootvetstvyet a eto nechetnoe chislo
    //int a=4;    100
    //           &
    //      1;    001
    //            000  <-- rezyltat, 'a' eto chetnoe chislo

    //int a=5;    101
    //           &
    //      1;    001
    //            001  <-- rezyltat, 'a' eto ne chetnoe chislo
}

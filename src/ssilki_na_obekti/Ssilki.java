package ssilki_na_obekti;

public class Ssilki {
    public static void main(String[] args) {

// ***** ssilka ETO NE OB`EKT!!! eto tolko kak adres ob`ekta v pamiati, ssilok mozzet bit mnogo na odin i tot-zze ob`ekt

        Demo demo1, demo2, demo3; // Создание нескольких ссылок
        demo1 = new Demo();// prisvoenie ssilki demo1 na ob`ekt
        demo2 = demo1;     // prisvoenie ssilki demo2 na tot zze ob`ekt
        demo3 = demo2;     // prisvoenie ssilki demo3 na tot zze ob`ekt

        System.out.println(demo1+"\n "+demo2+"\n "+demo3);// <--teper vse ssilki ykazivayt na odin i tot-zze ob`ekt

        System.out.println(demo1==demo2);




    }
}
    class Demo{
        public Demo(){
        }
    }

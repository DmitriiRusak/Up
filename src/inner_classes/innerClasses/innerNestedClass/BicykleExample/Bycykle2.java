package inner_classes.innerClasses.innerNestedClass.BicykleExample;

//Вложенный класс не может существовать независимо от класса, в который он вложен.

//v dannom klasse ia eksperementalno posmotry chto mozzno sdelat vo vneshnem klasse po otnosheniy k
//inner classy. pri etom sdelay inner classi private.
// класс не может быть связан с модификатором доступа private, но если у нас есть класс как член другого
// класса, то внутренний класс может быть private
// Sizzy i dymay a na xera delat inner class private?
//Delaem inner class private i sozdanie ob`ekta vozmozzno tolko vo vneshnem klasse i vizivat metodi inner
//classa mozzno dybliryia ix iz vneshnego.
//
//  1)-Sozdanie ob`ekta v vneshnem klasse: HandleBar2 nazvanieOb`ekta = new HandleBar2();
//          t.e. tak-zze kak v main pri obichnom classe.

//  2)-Nesmotria na private modifikatori dostypa v inner classe, getteri ne ponadobilis.
//          peremennie ekzempliara inner classa dostypni po tochechnoi notacii vo vneshnem classe

//  3)-Tak-kak sozdanie ob`ekta inner classa vozmozzno tolko vo vnytrennem classse to stoit
//          pozabotitsia o logike vizova metodov inner classa iz vneshnego klassa.

//  4)-ЭЭЭ dak esli inkapsyliaciia takaia silnaia chto ob`ekt inner classa mozzno sozdat tolko
//          vo vneshnem klasse, to zachem modifikatori dostypa y chlenov inner klassa? ix zze
//          mozzno polychit tolko vo vneshnem klasse, t.e. tam gde est ob`ekt inner classa.
//          Gde-to vne vneshnego klassa vizvat ix ne vozmozzno.Sootvetstvenno na modifikatori
//          dostypa (y chlenov inner classa) esli on private, mozzno ne zamarachivatsia.
//
//
//
//
//

public class Bycykle2 {
    private String model;
    private int weight;
    static String instrykciiaBezopasnosti="perechen pravil eksplyatacii velosipeda";
    HandleBar2 handleBar2=new HandleBar2();

    public Bycykle2(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void getVariablseOfInnerClassa(){
        System.out.println( handleBar2.getStr() );      //dostyp k peremennim ekzempliara s
        System.out.println( handleBar2.getSomeFild() ); // pomosch`y getterov.

        System.out.println( handleBar2.str );           //takoi-zze dostyp bez getterov.
        System.out.println( handleBar2.someFild );
    }

    public void handlBarToTheRight() {                 //vizov metoda inner classa cherez metod vneshnego.
        handleBar2.right();
    }
/*
*
*
*
*
 */
    private class HandleBar2 {  //dlia chego ego delat private ? Mozeet dostatochno zdelat private polia?
        private int someFild=126;
        private String str="class private";


        public void right() {
            System.out.println(instrykciiaBezopasnosti);
            System.out.println(model);
            System.out.println("Руль вправо!");
        }

    public int getSomeFild() {
        return someFild;
    }

    public String getStr() {
        return str;
    }

    public void left() {

            System.out.println("Руль влево!");



        }
    }
/*
*
*
*
*
 */

    private class Seat {

        public void up() {

            System.out.println("Сиденье поднято выше!");
        }

        public void down() {

            System.out.println("Сиденье опущено ниже!");
        }
    }

}
class Racing2{
    public static void main(String[] args) {


    Bycykle2 bicycle=new Bycykle2("Десна", 2022);
//    Bycykle2.HandleBar2 handleBar=bicycle.new HandleBar2();   <-- Tak yze nesozdash
//    Bycykle2.HandleBar2 handleBar1=new Bycykle2("Desna",2021).new HandleBar2();  <-- Tak yze nesozdash
    bicycle.handlBarToTheRight(); //<-- vizov metoda inner classa cherez vneshnii
}
    }
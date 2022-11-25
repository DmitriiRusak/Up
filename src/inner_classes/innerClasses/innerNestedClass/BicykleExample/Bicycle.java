package inner_classes.innerClasses.innerNestedClass.BicykleExample;
//Ia rassmatrival danni primer s pozicii inner classa. No ne s pozicii vneshnego klassa.
//A chto mozzet vneshnii klass po otnosheniy k inner classy?

//Вложенный класс не может существовать независимо от класса, в который он вложен.

// Inner class nyzzni dlia правильноgo проектирования классов с точки зрения конкретной программы и в смысле
// этой программы. Внутренние классы — это классы для выделения в программе некой сущности, которая неразрывно
// связана с другой сущностью. Руль, сиденье, педали — это составные части велосипеда. Отдельно от велосипеда
// они не имеют смысла. No tolko v kontekste programmi gde nam nyzzen velosiped kak celii ob`ekt. Da mozzno
//sozdat eti klassi i razdelno, no v takom slychae mozzno dopystit logicheskyy oshibky i nasozdavat takix
// ob`ektov otdelno ot ob`ekta velosiped. Naprimer
//  public static void main(String[]args){
//         HandleBar someHandleBar=new HandleBar();
//         someHandleBar.right();
//         Toest mi sozdali ot kyda nevozmis ryl i on tipa kyda-to povernyl na pravo...)
//  Отделив сущность руля от сущности велосипеда, мы потеряли логику OOP dlia нашей программы
//V nashem zze slychae HandleBar iavliaetsia logicheskoi sostovliayschei velosipeda, poetomy i naxoditsia
//vnytri classa Bycikle i iavliaetsia ego chlenom. Pri etom texnicheski nelzia sozdat HandleBar bez ob`ekta
// Bycikle t.e. velosipeda. Tak-kak ob`ekt vnytrennego klassa (inner class) ne mozzet syschestvovat otdelno
//bez ob`ekta vneshnego klassa.A pochemy bi ne zdelat HandleBar private? Esli v programme nado chtobi bila
//vozmozznost sozdaniia rylia otdelno? to private bydet nepodxodiaschim variantom/esli ob`ekt HandleBar
//ne nyzzen to private bydet logichnim resheniem.

//Теперь давай рассмотрим другую ситуацию.Допустим, мы хотим создать программу, моделирующую магазин велосипедов
// и их запчастей. В этой ситуации наше предыдущее решение будет неудачным. В рамках магазина запчастей каждая
// отдельная часть велосипеда имеет смысл даже отдельно от сущности велосипеда. Здесь использовать внутренние
// классы было бы ошибкой — каждая отдельная часть велосипеда в рамках нашей новой программы имеет
// собственный смысл: она отделима от сущности велосипеда, i никак не привязана к нему.

//Schitay chto vlozztnnie klassi poiavilis blagodaria neobxodimosti sozdavat slozznie/mnogosostavnie ob`ekti
//pri etom nedopyskat sostovnie chasti takix ob`ektov syschestvovat otdelno. Ili dopyskat no pri syschestvovanii
//neobxodimoi logiki...

//              Texnicheskaia chast:
//  1)-Объект внутреннего класса не может существовать без объекта «внешнего» класса.Это логично: для того мы
//      и сделали Seat и HandleBar внутренними классами, чтобы в нашей программе не появлялись то тут, то там
//      бесхозные рули и сиденья.

//  2)-У объекта inner класса есть доступ к lybim chlenam «внешнего» класса (i metodam i peremennim
//      v tom chisle i static)

//  3)-У inner класса ne mozzet bit staticheskix chlenov klassa (ni peremennix; ni metodov);Obratno-zze
//      eto logika OOP, ryl ne mozzet chto-to delat dazze ne poiavivshis ili kogda dazze velosipeda net.
//      popravka: mozzno imet peremennie static final !!!

//  4)-При создании объекта внутреннего класса важную роль играет его модификатор доступа.(public, private,
//      protected и package private). Почему это важно? Это влияет на то, где в нашей программе мы сможем создавать
//      экземпляры внутреннего класса.Если наш класс Seat объявлен как public, мы можем создавать его объекты в
//      любом другом классе. Единственное требование — объект «внешнего» класса тоже обязательно должен существовать.
//      Если же мы объявим внутренний класс как private, доступ к созданию объектов у нас будет только внутри «внешнего»
//      Bycikl класса. Создать объект Seat снаружи (vne klassa Bycikl) мы уже не сможем:


public class Bicycle {

    private String model;
    private int weight;
    static String instrykciiaBezopasnosti="perechen pravil eksplyatacii velosipeda";

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Поехали!");
    }

     public class HandleBar {

        //static int id;        Static declarations in inner classes are not supported

        public void right() {
            System.out.println(instrykciiaBezopasnosti);   //dostyp est i k staticheskoi peremennoi
            System.out.println(model);                    // <--est dostyp k peremennim vneshnego klassa.
            System.out.println("Руль вправо!");
        }

       public void left() {

            System.out.println("Руль влево!");
        }
    }


    private class Seat {

        public void up() {

            System.out.println("Сиденье поднято выше!");
        }

        public void down() {

            System.out.println("Сиденье опущено ниже!");
        }
    }

}
class Racing{
    Bicycle bicycle=new Bicycle("Десна", 2022);
    Bicycle.HandleBar handleBar=bicycle.new HandleBar();     //mozzem sozdat ob`ekt klassa HandleBar tak-kak on public;
    //Bicycle.Seat seat=bicycle.new Seat();// oshibka: innerNestedClass.Bicycle.Seat' has private access
    Bicycle.HandleBar handleBar1=new Bicycle("Desna",2021).new HandleBar();// <-- prikolnii sintaksis.
}
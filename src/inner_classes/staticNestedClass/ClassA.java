package inner_classes.staticNestedClass;
//Вложенный класс не может существовать независимо от класса, в который он вложен.

//Staticheskii class mozzet soderzzat staticheskie i ne staticheskie
//chleni klassa: polia(peremennie) i metodi.
//V staticheskom klasse nelzia polychit dostyp k nestaticheskim chlenam Vneshnego klassa (ni k peremennim, ni k metodam). K primery v staticheskom klasse
// ob`iavlen nestaticheskii metod v nem mi pitaemsia polychit dostyp k nestaticheskim peremennim vneshnego klassa - vidast oshibky:
// Non-static field 'someInt' cannot be referenced from a static context. Tozee proizoidet esli popitatsia obratiisia iz staticheskogo classa i
// iz nestaticheskogo metoda k nestaticheskoi peremennoi vneshnego klassa, no esli v staticheskom klasse sozdat nestaticheskii metod i v para-
// metrax emy peredovat ssilky na ob`ekt vneshnego klassa to cherez ob`ekt mozzno polychit dostyp k nestaticheskim poliam vneshnego klassa.
// Osnovnaia ideia - iz staticheskogo kontexsta nelzia obraschatsia k ne staticheskim metodam i poliam. Eto na samom dele logichno, tak-kak nestaticheskie
// polia prinadlezzat ob`ektam klassa i imeyt y kazzdogo ob`ekta svoe znachenie, togda kak staticheskie chleni klassa prinadlezzat samomy klassy i iavliay-
//tsia obschimi dlia vsex ob`ektov dannogo klassa.

//V tozze vremia v samom staticheskom classe mozzno bezprepiatstvenno obraschatsia k lybim peremennim etogo-zze classa v nestaticheskix metodax.
//Togda-kak esli v staticheskom klasse sozdat staticheskii metod to v tele metoda mozzno rabotat tolko s staticheskimi peremennimi, s nestaticheskimi
// peremennimi, ob`iavlennimi dazze v dannom staticheskom classe nelzia polychit dostyp iz staticheskogo contexta
//Static nested class mozzet soderzzat main metod.

//V metode main staticheskii vnytrenni class vedet sebia tak-zze kak obichnii class. No chtobi sozdat ob`ekt static nested class vne  vneshnego
// to nado = OuterClass.StaticNestedClass nazvanieOb`ekta = new OuterClass.StaticNestedClass();

// Primenenie dannogo vida klassa opravdano esli staic nested klass po idee mozzet syschestvovat otdelno ot vneshnego no i  v tozze
// vremia iavliaetsia logicheskoi chast`y vneshnego. Primer: vneshnii klass opisivaet samolet, a static nested class opisivaet cherchezz dannogo
//samaleta. V principe esli gde-to ponadobitsia cherchezz mi ego sozdadim bez sozdaniia samoleta i eto sovpodaet s parodigmoi OOP.




import java.util.Arrays;

public class ClassA {

    public int someInt;
    public static String string="staticheskaia peremennaia v ClassA";
    /*
    *
     */
    public ClassA(int someInt){
        this.someInt=someInt;
    }
    /*
    *
     */
    public void notStaticMethod(){
        System.out.println(someInt);
    }
    /*
    *
     */
    public static void staticMethod(){
        System.out.println(string);
    }
    /*
    *
     */
    static class ClassB{
        public int intClassB=53;
        public static String stringFromClassB = "staticheskaia String v ClassB";

        /*
        *
         */
        public void doMethod(){
            System.out.println(stringFromClassB+" "+string);
            //System.out.println(someInt);          //oshibka: Non-static field 'someInt' cannot be referenced from a static context
            //notStaticMethod();                      //oshibka: Non-static field 'someInt' cannot be referenced from a static context
            System.out.println(stringFromClassB+" "+intClassB);
        }
        /*
        *
         */
        public static void staticDoMethod(){
            //System.out.println(intClassB); //oshibka: Non-static field 'someInt' cannot be referenced from a static context
            System.out.println(stringFromClassB);
        }
        /*
        *
         */
        public void doSomeThingWithVariable(ClassA a){ //mozzno polychit dostyp k peremennim ne static vneshnego klassa,esli peredat
            a.someInt=111;                             // v parametri metoda ssilky na ob`ekt vneshnego klassa.
        }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(args));
        }
    }

    public static void main(String[] args) {
        ClassB classB=new ClassB(); //tak mozzno tak-kak classB naxoditsia v ClassA, no vne ego neobxodima:ClassA.ClassB ssilka=new ClassA.ClassB();
        classB.doMethod();
        ClassB.staticDoMethod();
        ClassA.ClassB.staticDoMethod();//Vne vneshnego klassa k staticheskim chlenam mozzno obraschatsia vot-tak
                //ClassB.staticDoMethod(); <-- tal rabotaet tolko vo vneshnem klasse


    }

}

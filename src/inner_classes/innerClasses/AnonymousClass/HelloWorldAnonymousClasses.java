package inner_classes.innerClasses.AnonymousClass;
//Primer ne odnoznachnii...v nem anonimnie klassi iavliaytsia lokalnimi.Nado razobrat povedenie i xarakteristiki anonimnogo klassa
// ne kak lokalnogo klassa, a kak inner classa.

//Вложенный класс не может существовать независимо от класса, в который он вложен.

//Schas poprobyy ob`iasnit.
//Esli k primery est vneshnii klass predstavliayschii soboi kakyyto dovolno mnogosostovnyy syschnost
// mi reshaem sozdat neskolko podxodiaschix 'sostavnix' vnytrennix klassov kotorie nam podxodiat po logike i kotorie (opiat-zze po logike)
// dolzzni imet kakoeto odinakovoe povedenie, poetomy sozdaem interface( zdes eto HelloWorldIntrface).No sozdavat celii class i propisivat
// vse signatyri dolgo. Dlia etogo i syschestvyyt Anonimnie klassi.
//
//                                              Sintaksis sozdaniia anonimnogo classa:
// NazvanieInterfaisa imiaSsilki= new NazvanieInterfaisa(){
//  public void realizaciiaMetodaInterfaisa(){...}
// };
// T.e. polychaetsia mi sozdali kak bi ob`ekt interfeisa. No eto ne tak, na samom dele eto ob`ekt bezimiannogo klassa
// kotorii realizyet povedenie interfaisa.
// Konkretno v etom primere sozdaetsia 3 lokalnix classa, 2-a iz kotorix iavliaytsia anonimnimi. V kontekste lokalnogo klassa
//konkretno v etom primere, posle sozdaniia klassov, idet obraschenie k ix ob`ektam i vizova metoda, vse eto proisxodit
// v ramkax metoda gde sozdaytsia dannie klassi (sozdanie ob`ekta lokalnogo klassa vozmozzno tolko v bloke koda gde on
//ob`iavlen)
public class HelloWorldAnonymousClasses {
      static int a=0;
     /*
    *
     */
    interface HelloWorldIntrface{
        public void greet();
        public void greetSomeone(String someone);
    }
    /*
    *
     */
    public void sayHello(){

        class EnglishGreeting implements HelloWorldIntrface{   //sozdanie local inner classa
            final static  int r=0;
            String name="world";
            public void greet(){
                greetSomeone("world");
            }
            public void greetSomeone(String someone){
                a=11;
                name=someone;
                System.out.println("Hello "+name+" "+a);
            }
        }

        HelloWorldIntrface englishGreeting =new EnglishGreeting();//sozdanie ob`ekta EnglishGreeting no cherez interfaisnyy
                                                        // ssilky
        HelloWorldIntrface frenchGreeting=new HelloWorldIntrface(){//sozdanie anonimous klass An anonymous class must always extend
            // a super class or implement an interface but it cannot have an explicit extends or implements word
            //instead it has reference of interface type (here it is HelloWorldIntrface)or superClass
            String name="tout le monde";
            public void greet() {
                greetSomeone("tout le monde"+" "+a);
            }//tak kak mi implements interface to
            //dolzni realizovat vse abstraktnie metodi etogo inrerfaisa(y nas eto HelloWorld);

            @Override
            public void greetSomeone(String someone) {
                name=someone;
                System.out.println("Salut "+name);
            }
        };
        HelloWorldIntrface spanishGreeting = new HelloWorldIntrface() {
            String name="mundo";
            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
            name=someone;
                System.out.println("Hola, "+name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Frank");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses HWAC=new HelloWorldAnonymousClasses();
        HWAC.sayHello();
    }
}

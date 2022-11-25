package inner_classes.innerClasses.AnonymousClass;

//Вложенный класс не может существовать независимо от класса, в который он вложен.

//V dannom primere anonimnie klassi vistypayt v roli inner classov.

//                              Texnicheskie xarakteristiki:
//           1)-v anonimnom klasse mozzno sozdavat lybie chleni klassa krome static.
//              no mozzno static final i tolko dlia peremennix.

//          2)-ob`ekt anonimnogo klassa (ssilka) dostypen tolko vo vneshnem classe gde on i sozdan.

//          3)-У объекта anonimnogo класса есть доступ к lybim chlenam «внешнего» класса (i metodam i peremennim
//             v tom chisle i static)

// V celom povedenie ochen napominaet inner class no so svoimi osobennostiami.
//Dymay chto bolee predmetno ispolzovat danni vid klassov kak localnie, zatochennie pod 1 metod.
public class Cartoteka {

    private static int cartoteka=0;

    interface person{
        public void introduce();
    }

    public void showTheNamberOfAllPersons(){
        System.out.println(cartoteka);
    }

    person vania=new person() {

       private int yearOfBerth=1976;
        String name="Vania";
        @Override
        public void introduce() {
            System.out.println(name+" "+yearOfBerth);
            cartoteka++;                                        //est dostyp k peremennim
        }

    };

    person kostia=new person() {
        private int yearOfBerth=1986;
        String name="Kostia";
        @Override
        public void introduce() {
            System.out.println(name+" "+yearOfBerth);
            cartoteka++;
        }
    };

    public void introduction(){
        vania.introduce();
        kostia.introduce();
    }

    public static void main(String[] args) {
        Cartoteka cartoteka=new Cartoteka();
        cartoteka.introduction();
        cartoteka.showTheNamberOfAllPersons();
        //Cartoteka.vania                       //ob`ekt sozdannogo anonimnogo klassa v main ne polychit.
    }
}


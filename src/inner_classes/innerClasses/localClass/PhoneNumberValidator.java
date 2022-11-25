package inner_classes.innerClasses.localClass;

//Вложенный класс не может существовать независимо от класса, в который он вложен.

//Method local inner classes <--nazvanie na English
// Локальный класс объявляется только в блоке кода. Чаще всего — внутри какого-то метода внешнего класса.
//Зачем объявлять класс именно внутри метода? Почему не использовать обычный внутренний класс?
//Действительно, можно было бы поступить и так: сделать класс PhoneNumber внутренним.
//Другое дело, что итоговое решение зависит от структуры и предназначения твоей программы.
//Программа у нас совсем простая. У нее всего одна функция — проверить, является ли число номером телефона.
//В большинстве случаев наш PhoneNumberValidator будет даже не самостоятельной программой, а просто частью
// в логике авторизации для основной программы.
//Например, на разных сайтах при регистрации часто просят ввести номер телефона. И если напечатать какую-нибудь
// чушь вместо цифр, сайт выдаст ошибку: «Это не номер телефона!».
//Иными словами, у нас есть один внешний класс с одним методом, который будет использован в одном месте программы
// и больше нигде. А если и будет, то в нем ничего не изменится: один метод делает свою работу — и все.
//В этом случае, раз уж вся логика работы собрана в одном методе, будет гораздо удобнее и правильнее инкапсулировать
// там и дополнительный класс. Своих методов, кроме геттера и сеттера, у него нет. Нам, по сути, нужны только
// данные из его конструктора. В других методах он не задействован. Поэтому нет причин выносить информацию
// о нем за пределы единственного метода, где он используется. Ny я xz... polychaetsia esli osnovnoi klass
// imeet tolko odin metod i bydet ispolzovatsia dlia ooochen specifichnoi i edinstvennoi (ne vidoizmeniaemoi)
// zadachi, to sozdanie inner klassa opravdano lokalno v tom samom edinstvennom metode.

//              Texnicheskaia chast:
//      1)-Объект локального класса не может создаваться за пределами метода или блока, в котором его объявили

//      2)- возможность доступа к: a)- локальным переменным ob`iavlennim v metode gde ob`iavlen sam lokal klass.
//                                 b)- peremennim v параметраx метода gde ob`iavlen sam lokal klass.
//                                 c)- k vsem chlenam vneshnego klassa(pri yslovii chto metod gde ob`iavlen lokal klass ne staticheskii)
//                                     t.e. ko vsem metodam i peremennim vneshnego klassa

//      3)-Tak-zze kak inner classi, local inner classi не могут определять или объявлять какие-либо статические члены.
//                Opanki, okazivaetsia mozzno sozdavat peremennie esli oni static final.

//      4)-V local inner classe nelzia ob`iavit interface, tak-kak interface po svoei 'prirode' static.
//                No esli interface ob`iavlen v vneshnem klasse to local inner class mozzet ego realizovat.
//
//






public class PhoneNumberValidator  {

    static String regularExpression = "[^0-9]";
    int experement=123;
    /*
    *
     */

    public void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

        final int  requaredPfonnumberLength = 10;                            //<--peremennaia ispolzyetsia tolko v etom metode sootvetstvenno i ob`iavlena tolko v etom metode.(local veriable)
        class PhoneNumber {                                                     //<-- Local Inner Class, tak kak etot class ob`iavlen vnytri metoda to nosit
            String formattedPhoneNumber = null;                                     //nazvanie Local
                                                                              /* Klass imeet dostyp k lokalnim peremennim ob`iavlennim kak final or effectively final (kak te
                                                                                 * chto v parametrax metoda t.e. ne meniaytsia) Takzze class mozzet imet static peremennie no
                                                                                 * pri yslovii chto oni ob`iavlenni final.
                                                                                 *////esli klass ob`iavlen v metode ne static to est dostyp k lybim peremennim dazze static
             PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regularExpression, ""); // imeet dostyp k static peremennoi vneshnego klassa
                if (currentNumber.length() == requaredPfonnumberLength)                    // <--imeet dostyp k lokalnim peremennim dannogo metoda
                    formattedPhoneNumber = currentNumber;                            //Effective-final называют переменную, значение которой не менялось после инициализации.
                else
                    formattedPhoneNumber = null;

            }
            /*
            *
             */
            public String getNumber() {
                return formattedPhoneNumber;
            }


            public void printOriginalNumbers() {
                System.out.println(experement);                              //<-- imeet dostyp k peremennim ekzempliara
                System.out.println("Original numbers are " + phoneNumber1 +  //<-- imeet dostyp k lokalnim peremennim parametra metoda gde ob`iavlen sam klass
                    " and " + phoneNumber2);
            }
        }
//Объект локального класса не может создаваться за пределами метода или блока, в котором его объявили
        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }

    //public PhoneNumber get(){ <--koompiliator ne znaet takoi klass. On vidim tolko v bloke,gde ob`iavlen.

    public static void main(String... args) {
        PhoneNumberValidator validator=new PhoneNumberValidator();
        validator.validatePhoneNumber("123-456-7890", "456-7890");
        //PhoneNumber phoneNumber=new PhoneNumber("123-456-7890"); ob`ekt lokal class mozzno sozdat v bloke gde on ob`iavlen
        //v dannom slychae v metode i nigde bolshe!

    }
}
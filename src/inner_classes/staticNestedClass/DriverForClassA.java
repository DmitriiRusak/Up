package inner_classes.staticNestedClass;
//zdes nagliadno pokazana raznica v sozdanii ob`ekta ot static nested class --> ClassA.ClassB ob=new ClassA.ClassB();
//i sozdanie ob`ekta ot inner class                                         --> Bicycle.HandleBar handleBar=new Bicycle("model",10).new HandleBar();
// raznica v tom chto pri sozdanii ob`ekta ot static nested classa ispolzyetsia tolko odin operetor 'new', pochemy?
// togda kak ot inner classa ispolzyetsia 2-a operatora 'new'.
// naverno potomy chto odin iz klassov staticheskii. Xotia neznay,

//vneshnii klass ne imeet dostypa k chlenam vnytrennego klassa bez sozdaniia ob`ekta inner klassa
// ClassA objectA=new ClassA(214);      sozdaem v main ob`ekt vneshnego classa
//        objectA.doMethod();       s pomosch`y ob`ekta vneshnego classa pitaemsia vizvat metod inner classa. Eto oshibka.!!!
//
import inner_classes.innerClasses.innerNestedClass.BicykleExample.Bicycle;

public class DriverForClassA {
    public static void main(String[] args) {

        ClassA.ClassB b=new ClassA.ClassB();                                          //raznica v sozdanii ob`ektov static nested class
        Bicycle.HandleBar handleBar=new Bicycle("model",10).new HandleBar();// i inner class


        ClassA objectVneshnegoClassaA=new ClassA(214);
        //objectVneshnegoClassaA.doMethod(); //dlia vizova metoda inner classa nyzzen ob`ekt inner classa

    }
}

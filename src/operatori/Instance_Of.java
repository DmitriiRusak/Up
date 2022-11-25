package operatori;
//          Оператор instanceof проверяет именно происхождение объекта, а не переменной.
public class Instance_Of {
     class Animal {

     }

     class Cat extends Animal {

    }

     class MaineCoon extends Cat {

    }
////////////////////////////////////////////////////////////

    public static void main(String[] args) {
         Instance_Of instance_of=new Instance_Of();
        Instance_Of.Cat cat = instance_of.new Cat();

        System.out.println(cat instanceof Animal);      //true;
        System.out.println(cat instanceof MaineCoon);   //false

// Operator instance_of proveriaet sam ob`ekt, no ne ssilky.

        Instance_Of.Cat cat1 = instance_of.new MaineCoon();

        System.out.println(cat instanceof Cat);         //true;
        System.out.println(cat instanceof MaineCoon);   //true;
    }
}

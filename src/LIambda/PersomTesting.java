package LIambda;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersomTesting {
    public static void main(String[] args)  {

        Person p1=new Person("Dima", LocalDate.of(2000,7,4), Person.Sex.MALE,"sam@email");
//        Person p2=new Person("Bik", LocalDate.of(2001,5,21), Person.Sex.MALE,"sam@emsdfsail");
//        Person p3=new Person("Marfa", LocalDate.of(1984,2,9), Person.Sex.FEMALE,"sam@esdcmail");
//    List<Person>collection=new ArrayList<>();
//    collection.add(p1);
//    collection.add(p2);
//    collection.add(p3);

        Test tt=new Test();
        tt.testsMethod(p1);




//        List <Person> collection;
//        collection=Person.createRoster();
//        Person.printPersons(collection);




//
//                   // Anonimous class
//            CheckPerson checkPerson=(Person p)-> {return p.gender==Person.Sex.MALE && p.getAge()>=18 && p.getAge()<25;};
//
//        for(Person s: collection){
//            if(checkPerson.test(s)){
//                s.printPerson();
//            }
//        }

    }
}

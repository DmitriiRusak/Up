package interfaces.marker;

import java.util.ArrayList;
import java.util.List;

public class MarkerDemo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        FarmMan farmMan = new FarmMan();

        List <FarmLife>farm=new ArrayList<>();
        farm.add(dog);
        farm.add(cat);
        farm.add(caw);
        farm.add(farmMan);

        for (FarmLife s:farm){
            if(s instanceof Permisson){
                s.saiHi();
            }
            else{
                System.out.println("NATHING IS TO SAY for "+s.getClass());
            }
        }
    }
}
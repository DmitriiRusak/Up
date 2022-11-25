package jeneriks.preobrazovanie;

public class Roditel <T>{
    private T roditelValue;
    public Roditel(T t){
        roditelValue=t;
    }


    public void doMethod(){
        System.out.println("Roditel");
    }

    public void doRoditel(){
        System.out.println("Roditel i doRoditelMetod");
    }



    public static void main(String[] args) {
        Naslednik naslednik=new Naslednik(1);
        Naslednik naslednik1=new Naslednik("prEvEt");

        naslednik.doMethod();
        naslednik1.doRoditel();





    }
}
class Naslednik <T> extends Roditel<T>{

    public Naslednik(T t){
        super(t);
    }
     public void doMethod(){
        System.out.println("Naslednik");
    }
}

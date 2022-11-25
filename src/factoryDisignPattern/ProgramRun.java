package factoryDisignPattern;

public class ProgramRun {
    public static void main(String[] args) {


        PiccaFactory piccaFactory = new PiccaFactory();
        Picceriia picceriia = new Picceriia(piccaFactory);
        picceriia.makeAnOrder(PiccaType.Mesnaia);


        PiccaFactory piccaFactory1 = new PiccaFactory();
        Picca picca=piccaFactory.makePicca(PiccaType.Vegetarian);


        Picceriia picceriia1 = new Picceriia(new PiccaFactory());
        picceriia1.makeAnOrder(PiccaType.Tempo);



        Picca picca1=piccaFactory1.makePicca(PiccaType.Vegetarian);
    }
}
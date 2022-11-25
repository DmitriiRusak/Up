package factoryDisignPattern;

public class Picceriia {
    private PiccaFactory piccaFactory;

    public Picceriia (PiccaFactory piccaFactory){
        this.piccaFactory=piccaFactory;
    }
    /*
    *
     */
    public Picca makeAnOrder(PiccaType type){
        Picca picca=piccaFactory.makePicca(type);
        return picca;
    }

}

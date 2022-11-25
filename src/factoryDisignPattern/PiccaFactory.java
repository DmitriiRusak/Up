package factoryDisignPattern;

public class PiccaFactory {

    public Picca makePicca(PiccaType type){
         Picca picca = null;

        switch (type){
            case Mesnaia:
                picca=new Mesnaia();
                break;
            case Vegetarian:
                picca=new Vegetarian();
                break;
            case Tempo:
                picca=new Tempo();
                break;
        }
        return picca;
    }


}

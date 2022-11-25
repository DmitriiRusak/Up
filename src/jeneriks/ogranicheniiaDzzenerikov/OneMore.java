package jeneriks.ogranicheniiaDzzenerikov;

public class OneMore <T extends ForJeneriks>{

    private T t;
    public OneMore(T t){
        this.t=t;
    }

    public void doMethod(){
        t.toString();
    }
}

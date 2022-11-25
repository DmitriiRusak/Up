package jeneriks.ogranicheniiaDzzenerikov;

public class ForOgranichenii extends ForJeneriks{

   public <T>ForOgranichenii(T ob, int sum){
        super(ob,sum);
    }
        @Override
    public String toString(){
        System.out.println(this.getClass().getSimpleName());
        return null;
    }
}

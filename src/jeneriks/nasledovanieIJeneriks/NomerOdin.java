package jeneriks.nasledovanieIJeneriks;

public class NomerOdin <T>{
    private T value;

    public NomerOdin(T t){
        this.value=t;
    }

    public static void main(String[] args) {
        NomerDva nomerDva=new NomerDva(18,"sda");
        NomerDva nomerDva1=new NomerDva("1sda",22);


     }

}
class NomerDva<T,B> extends NomerOdin <T>{
    private B bValue;

    public NomerDva(T t, B bValue ){
        super(t);
        this.bValue=bValue;
    }
}
package jeneriks.ogranicheniiaDzzenerikov;

public class ForJeneriks <T> {
    private T id;
    private int sum;
    /*
    *
     */
    public ForJeneriks(T param, int sum){
        this.id=param;
        this.sum=sum;
    }
    /*
    *
     */

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    @Override
    public String toString(){
        System.out.println(this.getClass().getSimpleName());
        return null;
    }
}

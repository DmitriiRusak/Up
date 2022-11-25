package some_classes.Object.methodFinalize;

public class A {
    @Override
    protected void finalize(){
        System.out.println("object classa A  bil ydalen");
    }

    public static void main(String[] args) {
        B b=new B(new A());
        b=null;
                //ogo poxody dlia vizova metoda ne nado ego specialno vizivat,dostatochno prosto pereopredelit v
        System.gc(); // klasse i on sam srabotaet pri ydalenii ob`ekta. PRIKOLNO)))
    }
}
class B extends A{
    private A a;

    public B(A a){
        this.a= a;
    }

    @Override
    protected void finalize(){
        System.out.println("ob`ekt classa B bil ydalen");
    }
}

package some_classes.Object.methodClone;

public class MethodClone  implements Cloneable{
    int a;
    String string;

    public MethodClone(int a, String string) {
        this.a = a;
        this.string = string;
    }
 // ispolzovanie klonirovania po ymolchaniy trebyet realizacii interfaisa Cloneable, bez nego ne rabotaet
    @Override
    public MethodClone clone() throws CloneNotSupportedException {
        return (MethodClone)super.clone();
    }
    /*
    *
     */
    // ispolzovanie klonirovaniia s sobstvennoi realizaciei... mozzno bez Cloneable
//    @Override
//    public MethodClone clone() {
//        MethodClone methodClone=new MethodClone(0," ");
//        methodClone.a=this.a;
//        methodClone.some_classes.string=this.some_classes.string;
//        return methodClone;
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MethodClone methodClone=new MethodClone(1,"CLONE");
        System.out.println(methodClone.hashCode());
        MethodClone methodClone1=methodClone.clone();
        System.out.println(methodClone1.hashCode());
    }
}

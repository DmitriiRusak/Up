package Static_methods;

public class Soliankas {
    static void dosos(){
        System.out.println("ETO DOSOS BRATAN");
    }

    public void dosos(String st){
        System.out.println(st);
    }

    public static void main(String[] args) {
        Soliankas.dosos();
        Soliankas s=new Soliankas();
        s.dosos("DA TI POGNALL");
    }

}

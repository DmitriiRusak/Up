package accessModifiers;

public class Modifiers {

      public static void calculate(int a, int b){
          System.out.println("Modifiers");

    }
    public void parentMethod(){
        System.out.println("Perent Method");
    }

    public static void main(String[] args) {
          FirstChild.calculate(2,2);
          Modifiers modifiers=new FirstChild();
          modifiers.calculate(1,1);
          modifiers.parentMethod();




//          Modifiers modifiers=new FirstChild();
//        modifiers.calculate(1,1);
//        ((FirstChild)modifiers).calculate(1,1);
    }



}
class FirstChild extends Modifiers{
        public static void calculate(int a, int b){
        System.out.println("FirstChild ");

    }

    @Override
    public void parentMethod() {
        System.out.println("FirstChildMethod");
    }
}

class SecondChild extends Modifiers{

     public static void calculate(int a, int b) {
        System.out.println("secondChild");

    }
}
//Pri pereopredelenii metoda mozzno meniat modefikatori dostypa no v poriadke yvelichenia dostypa
//private->package private->protected->public
//////////////////////////////////////////////////////////////////////////////////////////////////
//




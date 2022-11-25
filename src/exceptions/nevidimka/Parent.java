package exceptions.nevidimka;

public class Parent extends Exception{
    private int a;

    @Override
    public String toString(){
        return "ISKLYCHENIE IZ PARENT";
    }




    public static void main(String[] args) {
        try{
            //throw new Parent();
            throw new NaslednikException();
        }
        catch (Parent parent){
            System.out.println(parent.toString());
        }
//        catch (NaslednikException naslednikException){
//            System.out.println(naslednikException.toString());
//        }
    }
}



class NaslednikException extends Parent{
    @Override
    public String toString(){

        return "isklychenie iz Naslednik";
    }
}
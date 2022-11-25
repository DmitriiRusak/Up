package algoritms;

import java.util.Arrays;

public class ForTrainig {


    public void method(){
        ForNeTrenia ob1=new ForNeTrenia();
        System.out.println(ob1.a);
    }


     private class ForNeTrenia{
        private int a=121;

        public int getA(){
            return a;
        }
    }


}
class LeviClass {
    public static void main(String[] args) {


        ForTrainig ob = new ForTrainig();
        ob.method();
    }
}

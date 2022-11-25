package interfaces;

import java.time.LocalDateTime;

public class Relatable implements Relatabl {

    private int area;

    public int getArea() {
        return area;
    }

    public Relatable(int area) {
        this.area = area;
    }

    @Override
    public void isLargeThan(Relatabl other) {
       // Relatable obj = (Relatable) other;   //<-- STAROE PRIVEDENIE TIPOV
        if (this.getArea() < ((Relatable) other).getArea()) { //<-- NOVOE PRIVEDENIE TIPOV
            System.out.println("false");
            // return -1;
        } else if (this.getArea() > ((Relatable) other).getArea()) {
            System.out.println("true");
            //return 1;
        } else {
            System.out.println("the objects are equal");
            //return 0;
        }
    }

        public LocalDateTime getTime (){
            LocalDateTime dme=LocalDateTime.now().withMinute(0).withSecond(0).withNano(0);
            return dme;
        }
    public static void main(String[] args) {
        Relatable rlt=new Relatable(4);
        Relatable rlt1=new Relatable(4);
        rlt.isLargeThan(rlt1);
        Relatabl.doNathing();
        System.out.println(rlt.getTime());

    }
}

package some_classes.math;

import java.util.Random;

public class Razbor_metodov {
    public static void main(String[] args) {
        int a=10;
        int b=2;

        double d=16.7;

///////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Math.max(int a, int b)<--sravnivaet i vozvraschaet bolshee chislo.rabotaet s int,double,float,long
        int rezalt=Math.max(a,b);

///////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Math.min(int a, int b)<--sravnivaet i vozvraschaet menshee chislo rabotaet s int,double,float,long
        rezalt=Math.min(a,b);

////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Math.abs(int a); vozvraschaet абсолютное значение аргумента.(t.e. ne otricatelnoe)
        Math.abs(a);

///////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Math.sqrt(int a)<-- naxodit kvadratnii koren chisla. primer: квадратный корень из девяти=3.
        System.out.println(Math.sqrt(d));

///////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Math.round(int a)<--return the value of the argument rounded to the nearest int value.
        System.out.println(Math.round(d));

        //Math.ceil(int a)<--return the value of the argument rounded to the top int value.
        //primer: esli znachenie peremennoi=16.7; metod vernet 17;
        System.out.println(Math.ceil(d));

        //Math.floor(int a);<--vernet okryglennoe znachenie blizze k nizy (t.e. yberet desiatichnuy chast)
        //primer: esli znachenie peremennoi=16.7; metod vernet 16;
        System.out.println(Math.floor(d));
///////////////////////////////////////////////////////////////////////////////////////////////////////////
        //naxodit stepen,pervii argyment eto samo chislo, a vtoroi argryment stepen v kotoroe vozvodim
        //vozvesti v stepen znachit chislo ymnozzit samo na sebia. V primere 2 * 2 = 4;
        Math.pow(2, 3);





    }
}

package prototipi;

import java.io.IOException;

//Напишите программу, которая находила бы все простые числа в диапазоне
//от 2 до 100.
public class VehicleDemo {
    public static void main ( String args[] ) throws IOException {
        Vehicle minivan=new Vehicle ();
        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;

        Vehicle miniban=minivan;
        int range;
        System.out.println(miniban.fuelcap);
        miniban.fuelcap=0;
        System.out.println(minivan.fuelcap);
        System.out.println(miniban+" "+minivan);



//        range=minivan.fuelcap*minivan.mpg;
//        System.out.println("Minifyrgon mozzet perevezti "+minivan.passengers+
//                "passazzirov na rasstoianie "+ range+ " mil");
    }
}
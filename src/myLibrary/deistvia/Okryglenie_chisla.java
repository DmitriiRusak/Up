package myLibrary.deistvia;

import java.text.DecimalFormat;

public class Okryglenie_chisla {
    public static void main(String[] args) {

//Okrygliaem double s pomosch`y String.format()
// regex "%.2f" <--oznochaet skolko cifr posle zapiatoi ostovliaetsia, zdes eto 2 cifry.
        double rezult=1.453665;
        String str=String.format("%.2f",rezult);    //1.45
        System.out.println("znachenie String- "+str);

        System.out.println("-----------------------------------------------------------------------------------------");
//Ispolzovanie klassa DecimalFormat, pri sozdanii ekzempliara peredaem shablon
        double value = 34.766674;
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        String result = decimalFormat.format(value);
        System.out.println(result);//34,767


    System.out.println("-----------------------------------------------------------------------------------------");

    }
}

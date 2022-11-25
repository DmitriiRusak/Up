package myLibrary.deistvia;

import java.util.Arrays;
//Naiti minimalnoe v massive!
//Ochen interestnoe reshenie. Chel snachala otsortiroval massiv, a zatem vivel index[0]
//Logichno chto posle sortirovki tam bydet naimenshee chislo. Och kryto
public class Naiti_Minimalnoe_Znachenie_V_Massive {
    public static void main(String[] args) {
        int arrayInt[]={53,34,65,22,78,1,4};
        Arrays.sort(arrayInt);
        System.out.println(arrayInt[0]);
    }
}
